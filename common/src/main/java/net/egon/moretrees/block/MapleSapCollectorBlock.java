package net.egon.moretrees.block;

import com.mojang.serialization.MapCodec;
import net.egon.moretrees.item.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import org.jetbrains.annotations.Nullable;

import java.util.EnumMap;
import java.util.Map;

public class MapleSapCollectorBlock extends Block {
    public static final MapCodec<MapleSapCollectorBlock> CODEC = createCodec(MapleSapCollectorBlock::new);
    public static final EnumProperty<Direction> FACING = Properties.HORIZONTAL_FACING;
    public static final IntProperty SAP_LEVEL = IntProperty.of("sap_level", 0, 3);

    private static final int MAX_SAP_LEVEL = 3;
    private static final int GROWTH_INTERVAL_TICKS = 5 * 60 * 20;
    private static final Map<Direction, VoxelShape> SHAPES_BY_FACING = createShapesByFacing();

    public MapleSapCollectorBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState(this.stateManager.getDefaultState()
                .with(FACING, Direction.NORTH)
                .with(SAP_LEVEL, 0));
    }

    @Override
    public MapCodec<? extends MapleSapCollectorBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING, SAP_LEVEL);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getHorizontalPlayerFacing());
    }

    @Override
    protected void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
        if (!world.isClient() && !oldState.isOf(this)) {
            world.scheduleBlockTick(pos, this, GROWTH_INTERVAL_TICKS);
        }
    }

    @Override
    protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (canGenerateSap(state, world, pos) && state.get(SAP_LEVEL) < MAX_SAP_LEVEL) {
            world.setBlockState(pos, state.with(SAP_LEVEL, state.get(SAP_LEVEL) + 1), Block.NOTIFY_ALL);
        }

        world.scheduleBlockTick(pos, this, GROWTH_INTERVAL_TICKS);
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES_BY_FACING.get(state.get(FACING));
    }

    @Override
    protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPES_BY_FACING.get(state.get(FACING));
    }

    @Override
    protected ActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos,
                                         PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!stack.isOf(Items.GLASS_BOTTLE) || state.get(SAP_LEVEL) <= 0) {
            return ActionResult.PASS;
        }

        if (world.isClient()) {
            return ActionResult.SUCCESS;
        }

        ItemStack sapBottle = new ItemStack(ModItems.MAPLE_SAP_BOTTLE);
        ItemStack resultStack = ItemUsage.exchangeStack(stack, player, sapBottle);
        player.setStackInHand(hand, resultStack);

        world.setBlockState(pos, state.with(SAP_LEVEL, state.get(SAP_LEVEL) - 1), Block.NOTIFY_ALL);
        world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);
        return ActionResult.SUCCESS;
    }

    private static boolean canGenerateSap(BlockState state, World world, BlockPos pos) {
        Direction facing = state.get(FACING);
        BlockPos targetPos = pos.offset(facing);
        BlockState targetState = world.getBlockState(targetPos);

        if (!targetState.isOf(ModBlocks.MAPLE_LOG) && !targetState.isOf(ModBlocks.STRIPPED_MAPLE_LOG)) {
            return false;
        }

        return targetState.contains(PillarBlock.AXIS) && targetState.get(PillarBlock.AXIS) != facing.getAxis();
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
        VoxelShape shape = VoxelShapes.empty();
        shape = VoxelShapes.union(shape, box(9, 0, 6, 13, 1, 10));
        shape = VoxelShapes.union(shape, box(9, 1, 10, 13, 7, 11));
        shape = VoxelShapes.union(shape, box(9, 1, 5, 13, 7, 6));
        shape = VoxelShapes.union(shape, box(13, 1, 6, 14, 7, 10));
        shape = VoxelShapes.union(shape, box(8, 1, 6, 9, 7, 10));
        shape = VoxelShapes.union(shape, box(11, 7, 5, 12, 10, 6));
        shape = VoxelShapes.union(shape, box(11, 7, 10, 12, 10, 11));
        shape = VoxelShapes.union(shape, box(11, 10, 6, 12, 11, 10));
        shape = VoxelShapes.union(shape, box(10, 8, 7, 16, 10, 9));
        return shape;
    }

    private static VoxelShape rotateY(VoxelShape original, int quarterTurns) {
        int turns = Math.floorMod(quarterTurns, 4);
        VoxelShape rotated = original;

        for (int i = 0; i < turns; i++) {
            VoxelShape[] currentShape = new VoxelShape[] { VoxelShapes.empty() };
            VoxelShape source = rotated;
            source.forEachBox((minX, minY, minZ, maxX, maxY, maxZ) ->
                    currentShape[0] = VoxelShapes.union(
                            currentShape[0],
                            VoxelShapes.cuboid(1.0 - maxZ, minY, minX, 1.0 - minZ, maxY, maxX)
                    )
            );
            rotated = currentShape[0];
        }

        return rotated;
    }

    private static VoxelShape box(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        return VoxelShapes.cuboid(
                minX / 16.0,
                minY / 16.0,
                minZ / 16.0,
                maxX / 16.0,
                maxY / 16.0,
                maxZ / 16.0
        );
    }
}
