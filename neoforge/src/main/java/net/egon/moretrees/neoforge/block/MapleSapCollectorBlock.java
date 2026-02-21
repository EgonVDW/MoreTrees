package net.egon.moretrees.neoforge.block;

import com.mojang.serialization.MapCodec;
import net.egon.moretrees.neoforge.registry.NeoModBlocks;
import net.egon.moretrees.neoforge.registry.NeoModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.Nullable;

import java.util.EnumMap;
import java.util.Map;

public class MapleSapCollectorBlock extends Block {
    public static final MapCodec<MapleSapCollectorBlock> CODEC = simpleCodec(MapleSapCollectorBlock::new);
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final IntegerProperty SAP_LEVEL = IntegerProperty.create("sap_level", 0, 3);

    private static final int MAX_SAP_LEVEL = 3;
    private static final int GROWTH_INTERVAL_TICKS = 5 * 60 * 20;
    private static final Map<Direction, VoxelShape> SHAPES_BY_FACING = createShapesByFacing();

    public MapleSapCollectorBlock(BlockBehaviour.Properties properties) {
        super(properties);
        registerDefaultState(stateDefinition.any()
                .setValue(FACING, Direction.NORTH)
                .setValue(SAP_LEVEL, 0));
    }

    @Override
    public MapCodec<? extends Block> codec() {
        return CODEC;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, SAP_LEVEL);
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return defaultBlockState().setValue(FACING, context.getHorizontalDirection());
    }

    @Override
    protected void onPlace(BlockState state, Level level, BlockPos pos, BlockState oldState, boolean movedByPiston) {
        if (!level.isClientSide() && !oldState.is(this)) {
            level.scheduleTick(pos, this, GROWTH_INTERVAL_TICKS);
        }
    }

    @Override
    protected void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (canGenerateSap(state, level, pos) && state.getValue(SAP_LEVEL) < MAX_SAP_LEVEL) {
            level.setBlock(pos, state.setValue(SAP_LEVEL, state.getValue(SAP_LEVEL) + 1), Block.UPDATE_ALL);
        }

        level.scheduleTick(pos, this, GROWTH_INTERVAL_TICKS);
    }

    @Override
    protected BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    protected VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES_BY_FACING.get(state.getValue(FACING));
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPES_BY_FACING.get(state.getValue(FACING));
    }

    @Override
    protected InteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos,
                                          Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!stack.is(Items.GLASS_BOTTLE) || state.getValue(SAP_LEVEL) <= 0) {
            return InteractionResult.PASS;
        }

        if (!level.isClientSide()) {
            ItemStack sapBottle = new ItemStack(NeoModItems.MAPLE_SAP_BOTTLE.get());
            ItemStack resultStack = ItemUtils.createFilledResult(stack, player, sapBottle);
            player.setItemInHand(hand, resultStack);

            level.setBlock(pos, state.setValue(SAP_LEVEL, state.getValue(SAP_LEVEL) - 1), Block.UPDATE_ALL);
            level.playSound(null, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);
        }

        return InteractionResult.SUCCESS;
    }

    private static boolean canGenerateSap(BlockState state, BlockGetter level, BlockPos pos) {
        Direction facing = state.getValue(FACING);
        BlockPos targetPos = pos.relative(facing);
        BlockState targetState = level.getBlockState(targetPos);

        if (!targetState.is(NeoModBlocks.MAPLE_LOG.get()) && !targetState.is(NeoModBlocks.STRIPPED_MAPLE_LOG.get())) {
            return false;
        }

        return targetState.hasProperty(RotatedPillarBlock.AXIS) && targetState.getValue(RotatedPillarBlock.AXIS) != facing.getAxis();
    }

    private static Map<Direction, VoxelShape> createShapesByFacing() {
        EnumMap<Direction, VoxelShape> shapes = new EnumMap<>(Direction.class);
        VoxelShape eastShape = createBaseShape();
        shapes.put(Direction.EAST, eastShape);
        shapes.put(Direction.SOUTH, rotateY(eastShape, 1));
        shapes.put(Direction.WEST, rotateY(eastShape, 2));
        shapes.put(Direction.NORTH, rotateY(eastShape, 3));
        return shapes;
    }

    private static VoxelShape createBaseShape() {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.or(shape, collectorBox(9, 0, 6, 13, 1, 10));
        shape = Shapes.or(shape, collectorBox(9, 1, 10, 13, 7, 11));
        shape = Shapes.or(shape, collectorBox(9, 1, 5, 13, 7, 6));
        shape = Shapes.or(shape, collectorBox(13, 1, 6, 14, 7, 10));
        shape = Shapes.or(shape, collectorBox(8, 1, 6, 9, 7, 10));
        shape = Shapes.or(shape, collectorBox(11, 7, 5, 12, 10, 6));
        shape = Shapes.or(shape, collectorBox(11, 7, 10, 12, 10, 11));
        shape = Shapes.or(shape, collectorBox(11, 10, 6, 12, 11, 10));
        shape = Shapes.or(shape, collectorBox(10, 8, 7, 16, 10, 9));
        return shape;
    }

    private static VoxelShape rotateY(VoxelShape original, int quarterTurns) {
        int turns = Math.floorMod(quarterTurns, 4);
        VoxelShape rotated = original;

        for (int i = 0; i < turns; i++) {
            VoxelShape[] currentShape = new VoxelShape[] { Shapes.empty() };
            VoxelShape source = rotated;
            source.forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) ->
                    currentShape[0] = Shapes.or(
                            currentShape[0],
                            Shapes.box(1.0 - maxZ, minY, minX, 1.0 - minZ, maxY, maxX)
                    )
            );
            rotated = currentShape[0];
        }

        return rotated;
    }

    private static VoxelShape collectorBox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        return Shapes.box(
                minX / 16.0,
                minY / 16.0,
                minZ / 16.0,
                maxX / 16.0,
                maxY / 16.0,
                maxZ / 16.0
        );
    }
}
