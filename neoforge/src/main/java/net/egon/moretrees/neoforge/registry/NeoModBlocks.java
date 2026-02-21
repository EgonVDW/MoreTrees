package net.egon.moretrees.neoforge.registry;

import net.egon.moretrees.neoforge.block.MapleSapCollectorBlock;
import net.egon.moretrees.neoforge.MoreTreesNeoForge;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public final class NeoModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreTreesNeoForge.MOD_ID);

    public static final WoodType CHESTNUT_WOOD_TYPE = WoodType.register(new WoodType(MoreTreesNeoForge.MOD_ID + ":chestnut", BlockSetType.OAK));
    public static final WoodType MAPLE_WOOD_TYPE = WoodType.register(new WoodType(MoreTreesNeoForge.MOD_ID + ":maple", BlockSetType.OAK));
    public static final WoodType BEECH_WOOD_TYPE = WoodType.register(new WoodType(MoreTreesNeoForge.MOD_ID + ":beech", BlockSetType.OAK));

    public static final DeferredBlock<Block> CHESTNUT_LOG = register("chestnut_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final DeferredBlock<Block> MAPLE_LOG = register("maple_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final DeferredBlock<Block> BEECH_LOG = register("beech_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final DeferredBlock<Block> STRIPPED_CHESTNUT_LOG = register("stripped_chestnut_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
    public static final DeferredBlock<Block> STRIPPED_MAPLE_LOG = register("stripped_maple_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
    public static final DeferredBlock<Block> STRIPPED_BEECH_LOG = register("stripped_beech_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final DeferredBlock<Block> CHESTNUT_WOOD = register("chestnut_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<Block> MAPLE_WOOD = register("maple_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final DeferredBlock<Block> BEECH_WOOD = register("beech_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final DeferredBlock<Block> STRIPPED_CHESTNUT_WOOD = register("stripped_chestnut_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<Block> STRIPPED_MAPLE_WOOD = register("stripped_maple_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final DeferredBlock<Block> STRIPPED_BEECH_WOOD = register("stripped_beech_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final DeferredBlock<Block> CHESTNUT_PLANKS = register("chestnut_planks",
            Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final DeferredBlock<Block> MAPLE_PLANKS = register("maple_planks",
            Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final DeferredBlock<Block> BEECH_PLANKS = register("beech_planks",
            Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final DeferredBlock<Block> MAPLE_SAP_COLLECTOR = register("maple_sap_collector",
            MapleSapCollectorBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f));

    public static final DeferredBlock<Block> CHESTNUT_SLAB = register("chestnut_slab",
            SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    public static final DeferredBlock<Block> MAPLE_SLAB = register("maple_slab",
            SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    public static final DeferredBlock<Block> BEECH_SLAB = register("beech_slab",
            SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));

    public static final DeferredBlock<Block> CHESTNUT_STAIRS = register("chestnut_stairs",
            props -> new StairBlock(CHESTNUT_PLANKS.get().defaultBlockState(), props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    public static final DeferredBlock<Block> MAPLE_STAIRS = register("maple_stairs",
            props -> new StairBlock(MAPLE_PLANKS.get().defaultBlockState(), props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    public static final DeferredBlock<Block> BEECH_STAIRS = register("beech_stairs",
            props -> new StairBlock(BEECH_PLANKS.get().defaultBlockState(), props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));

    public static final DeferredBlock<Block> CHESTNUT_FENCE = register("chestnut_fence",
            FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    public static final DeferredBlock<Block> MAPLE_FENCE = register("maple_fence",
            FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    public static final DeferredBlock<Block> BEECH_FENCE = register("beech_fence",
            FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));

    public static final DeferredBlock<Block> CHESTNUT_FENCE_GATE = register("chestnut_fence_gate",
            props -> new FenceGateBlock(CHESTNUT_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    public static final DeferredBlock<Block> MAPLE_FENCE_GATE = register("maple_fence_gate",
            props -> new FenceGateBlock(MAPLE_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    public static final DeferredBlock<Block> BEECH_FENCE_GATE = register("beech_fence_gate",
            props -> new FenceGateBlock(BEECH_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));

    public static final DeferredBlock<Block> CHESTNUT_DOOR = register("chestnut_door",
            props -> new DoorBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));
    public static final DeferredBlock<Block> MAPLE_DOOR = register("maple_door",
            props -> new DoorBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));
    public static final DeferredBlock<Block> BEECH_DOOR = register("beech_door",
            props -> new DoorBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));

    public static final DeferredBlock<Block> CHESTNUT_TRAPDOOR = register("chestnut_trapdoor",
            props -> new TrapDoorBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));
    public static final DeferredBlock<Block> MAPLE_TRAPDOOR = register("maple_trapdoor",
            props -> new TrapDoorBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));
    public static final DeferredBlock<Block> BEECH_TRAPDOOR = register("beech_trapdoor",
            props -> new TrapDoorBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));

    public static final DeferredBlock<Block> CHESTNUT_BUTTON = register("chestnut_button",
            props -> new ButtonBlock(BlockSetType.OAK, 30, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    public static final DeferredBlock<Block> MAPLE_BUTTON = register("maple_button",
            props -> new ButtonBlock(BlockSetType.OAK, 30, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    public static final DeferredBlock<Block> BEECH_BUTTON = register("beech_button",
            props -> new ButtonBlock(BlockSetType.OAK, 30, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));

    public static final DeferredBlock<Block> CHESTNUT_PRESSURE_PLATE = register("chestnut_pressure_plate",
            props -> new PressurePlateBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    public static final DeferredBlock<Block> MAPLE_PRESSURE_PLATE = register("maple_pressure_plate",
            props -> new PressurePlateBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    public static final DeferredBlock<Block> BEECH_PRESSURE_PLATE = register("beech_pressure_plate",
            props -> new PressurePlateBlock(BlockSetType.OAK, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));

    public static final DeferredBlock<Block> CHESTNUT_LEAVES = register("chestnut_leaves",
            props -> new UntintedParticleLeavesBlock(
                    0.01f,
                    ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x285F15),
                    props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> MAPLE_LEAVES = register("maple_leaves",
            props -> new UntintedParticleLeavesBlock(
                    0.01f,
                    ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0xE85D08),
                    props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final DeferredBlock<Block> BEECH_LEAVES = register("beech_leaves",
            props -> new UntintedParticleLeavesBlock(
                    0.01f,
                    ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x3E8C2F),
                    props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final DeferredBlock<Block> CHESTNUT_SAPLING = register("chestnut_sapling",
            props -> new SaplingBlock(NeoModTreeGrowers.CHESTNUT, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final DeferredBlock<Block> MAPLE_SAPLING = register("maple_sapling",
            props -> new SaplingBlock(NeoModTreeGrowers.MAPLE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final DeferredBlock<Block> BEECH_SAPLING = register("beech_sapling",
            props -> new SaplingBlock(NeoModTreeGrowers.BEECH, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    public static final DeferredBlock<Block> CHESTNUT_SIGN = register("chestnut_sign",
            props -> new StandingSignBlock(CHESTNUT_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final DeferredBlock<Block> CHESTNUT_WALL_SIGN = register("chestnut_wall_sign",
            props -> new WallSignBlock(CHESTNUT_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN));
    public static final DeferredBlock<Block> CHESTNUT_HANGING_SIGN = register("chestnut_hanging_sign",
            props -> new CeilingHangingSignBlock(CHESTNUT_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final DeferredBlock<Block> CHESTNUT_WALL_HANGING_SIGN = register("chestnut_wall_hanging_sign",
            props -> new WallHangingSignBlock(CHESTNUT_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN));

    public static final DeferredBlock<Block> MAPLE_SIGN = register("maple_sign",
            props -> new StandingSignBlock(MAPLE_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final DeferredBlock<Block> MAPLE_WALL_SIGN = register("maple_wall_sign",
            props -> new WallSignBlock(MAPLE_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN));
    public static final DeferredBlock<Block> MAPLE_HANGING_SIGN = register("maple_hanging_sign",
            props -> new CeilingHangingSignBlock(MAPLE_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final DeferredBlock<Block> MAPLE_WALL_HANGING_SIGN = register("maple_wall_hanging_sign",
            props -> new WallHangingSignBlock(MAPLE_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN));

    public static final DeferredBlock<Block> BEECH_SIGN = register("beech_sign",
            props -> new StandingSignBlock(BEECH_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final DeferredBlock<Block> BEECH_WALL_SIGN = register("beech_wall_sign",
            props -> new WallSignBlock(BEECH_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN));
    public static final DeferredBlock<Block> BEECH_HANGING_SIGN = register("beech_hanging_sign",
            props -> new CeilingHangingSignBlock(BEECH_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final DeferredBlock<Block> BEECH_WALL_HANGING_SIGN = register("beech_wall_hanging_sign",
            props -> new WallHangingSignBlock(BEECH_WOOD_TYPE, props),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN));

    private NeoModBlocks() {
    }

    private static <T extends Block> DeferredBlock<T> register(String name,
                                                               Function<BlockBehaviour.Properties, T> factory,
                                                               Supplier<BlockBehaviour.Properties> propertiesSupplier) {
        return BLOCKS.registerBlock(name, factory, propertiesSupplier);
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
