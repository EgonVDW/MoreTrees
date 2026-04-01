package net.egon.moretrees.block;

import net.egon.moretrees.MoreTreesCommon;
import net.egon.moretrees.world.ModSaplingGenerators;
import net.minecraft.core.particles.ColorParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.Item;
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

import java.util.function.Function;
import java.util.function.Supplier;

public class ModBlocks {

    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final Block MAPLE_LOG = registerBlock("maple_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));
    public static final Block BEECH_LOG = registerBlock("beech_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG));

    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));
    public static final Block STRIPPED_BEECH_LOG = registerBlock("stripped_beech_log",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_LOG));

    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));
    public static final Block BEECH_WOOD = registerBlock("beech_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD));

    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));
    public static final Block STRIPPED_BEECH_WOOD = registerBlock("stripped_beech_wood",
            RotatedPillarBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.STRIPPED_OAK_WOOD));

    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final Block BEECH_PLANKS = registerBlock("beech_planks",
            Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PLANKS));
    public static final Block MAPLE_SAP_COLLECTOR = registerBlock("maple_sap_collector",
            MapleSapCollectorBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                    .noOcclusion()
                    .requiresCorrectToolForDrops()
                    .strength(1.5f));
    public static final Block CHESTNUT_SLAB = registerSlabBlock("chestnut_slab");
    public static final Block CHESTNUT_STAIRS = registerStairsBlock("chestnut_stairs", CHESTNUT_PLANKS);
    public static final Block CHESTNUT_FENCE = registerFenceBlock("chestnut_fence");
    public static final Block CHESTNUT_FENCE_GATE = registerFenceGateBlock("chestnut_fence_gate", ModWoodTypes.CHESTNUT);
    public static final Block CHESTNUT_DOOR = registerDoorBlock("chestnut_door");
    public static final Block CHESTNUT_TRAPDOOR = registerTrapdoorBlock("chestnut_trapdoor");
    public static final Block CHESTNUT_BUTTON = registerButtonBlock("chestnut_button");
    public static final Block CHESTNUT_PRESSURE_PLATE = registerPressurePlateBlock("chestnut_pressure_plate");

    public static final Block MAPLE_SLAB = registerSlabBlock("maple_slab");
    public static final Block MAPLE_STAIRS = registerStairsBlock("maple_stairs", MAPLE_PLANKS);
    public static final Block MAPLE_FENCE = registerFenceBlock("maple_fence");
    public static final Block MAPLE_FENCE_GATE = registerFenceGateBlock("maple_fence_gate", ModWoodTypes.MAPLE);
    public static final Block MAPLE_DOOR = registerDoorBlock("maple_door");
    public static final Block MAPLE_TRAPDOOR = registerTrapdoorBlock("maple_trapdoor");
    public static final Block MAPLE_BUTTON = registerButtonBlock("maple_button");
    public static final Block MAPLE_PRESSURE_PLATE = registerPressurePlateBlock("maple_pressure_plate");

    public static final Block BEECH_SLAB = registerSlabBlock("beech_slab");
    public static final Block BEECH_STAIRS = registerStairsBlock("beech_stairs", BEECH_PLANKS);
    public static final Block BEECH_FENCE = registerFenceBlock("beech_fence");
    public static final Block BEECH_FENCE_GATE = registerFenceGateBlock("beech_fence_gate", ModWoodTypes.BEECH);
    public static final Block BEECH_DOOR = registerDoorBlock("beech_door");
    public static final Block BEECH_TRAPDOOR = registerTrapdoorBlock("beech_trapdoor");
    public static final Block BEECH_BUTTON = registerButtonBlock("beech_button");
    public static final Block BEECH_PRESSURE_PLATE = registerPressurePlateBlock("beech_pressure_plate");

    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            properties -> new UntintedParticleLeavesBlock(
                    0.01f,
                    ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x285F15),
                    properties
            ),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            properties -> new UntintedParticleLeavesBlock(
                    0.01f,
                    ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0xE85D08),
                    properties
            ),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));
    public static final Block BEECH_LEAVES = registerBlock("beech_leaves",
            properties -> new UntintedParticleLeavesBlock(
                    0.01f,
                    ColorParticleOption.create(ParticleTypes.TINTED_LEAVES, 0x3E8C2F),
                    properties
            ),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES));

    public static final Block CHESTNUT_SAPLING = registerBlock("chestnut_sapling",
            properties -> new SaplingBlock(ModSaplingGenerators.CHESTNUT, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",
            properties -> new SaplingBlock(ModSaplingGenerators.MAPLE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));
    public static final Block BEECH_SAPLING = registerBlock("beech_sapling",
            properties -> new SaplingBlock(ModSaplingGenerators.BEECH, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SAPLING));

    public static final Block CHESTNUT_SIGN = registerBlockWithoutItem("chestnut_sign",
            properties -> new StandingSignBlock(ModWoodTypes.CHESTNUT, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block CHESTNUT_WALL_SIGN = registerBlockWithoutItem("chestnut_wall_sign",
            properties -> new WallSignBlock(ModWoodTypes.CHESTNUT, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN));
    public static final Block CHESTNUT_HANGING_SIGN = registerBlockWithoutItem("chestnut_hanging_sign",
            properties -> new CeilingHangingSignBlock(ModWoodTypes.CHESTNUT, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block CHESTNUT_WALL_HANGING_SIGN = registerBlockWithoutItem("chestnut_wall_hanging_sign",
            properties -> new WallHangingSignBlock(ModWoodTypes.CHESTNUT, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN));

    public static final Block MAPLE_SIGN = registerBlockWithoutItem("maple_sign",
            properties -> new StandingSignBlock(ModWoodTypes.MAPLE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block MAPLE_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            properties -> new WallSignBlock(ModWoodTypes.MAPLE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN));
    public static final Block MAPLE_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign",
            properties -> new CeilingHangingSignBlock(ModWoodTypes.MAPLE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block MAPLE_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign",
            properties -> new WallHangingSignBlock(ModWoodTypes.MAPLE, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN));

    public static final Block BEECH_SIGN = registerBlockWithoutItem("beech_sign",
            properties -> new StandingSignBlock(ModWoodTypes.BEECH, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN));
    public static final Block BEECH_WALL_SIGN = registerBlockWithoutItem("beech_wall_sign",
            properties -> new WallSignBlock(ModWoodTypes.BEECH, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN));
    public static final Block BEECH_HANGING_SIGN = registerBlockWithoutItem("beech_hanging_sign",
            properties -> new CeilingHangingSignBlock(ModWoodTypes.BEECH, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN));
    public static final Block BEECH_WALL_HANGING_SIGN = registerBlockWithoutItem("beech_wall_hanging_sign",
            properties -> new WallHangingSignBlock(ModWoodTypes.BEECH, properties),
            () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN));

    private static Block registerSlabBlock(String name) {
        return registerBlock(name, SlabBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SLAB));
    }

    private static Block registerStairsBlock(String name, Block baseBlock) {
        return registerBlock(name,
                properties -> new StairBlock(baseBlock.defaultBlockState(), properties),
                () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_STAIRS));
    }

    private static Block registerFenceBlock(String name) {
        return registerBlock(name, FenceBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE));
    }

    private static Block registerFenceGateBlock(String name, WoodType woodType) {
        return registerBlock(name,
                properties -> new FenceGateBlock(woodType, properties),
                () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_FENCE_GATE));
    }

    private static Block registerDoorBlock(String name) {
        return registerBlock(name,
                properties -> new DoorBlock(BlockSetType.OAK, properties),
                () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_DOOR));
    }

    private static Block registerTrapdoorBlock(String name) {
        return registerBlock(name,
                properties -> new TrapDoorBlock(BlockSetType.OAK, properties),
                () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_TRAPDOOR));
    }

    private static Block registerButtonBlock(String name) {
        return registerBlock(name,
                properties -> new ButtonBlock(BlockSetType.OAK, 30, properties),
                () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_BUTTON));
    }

    private static Block registerPressurePlateBlock(String name) {
        return registerBlock(name,
                properties -> new PressurePlateBlock(BlockSetType.OAK, properties),
                () -> BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_PRESSURE_PLATE));
    }

    private static Block registerBlock(String name,
                                       Function<BlockBehaviour.Properties, Block> factory,
                                       Supplier<BlockBehaviour.Properties> propertiesSupplier) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, name);
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id);
        Block block = factory.apply(propertiesSupplier.get().setId(key));
        Block registeredBlock = Registry.register(BuiltInRegistries.BLOCK, id, block);
        registerBlockItems(name, registeredBlock);
        return registeredBlock;
    }

    private static Block registerBlockWithoutItem(String name,
                                                  Function<BlockBehaviour.Properties, Block> factory,
                                                  Supplier<BlockBehaviour.Properties> propertiesSupplier) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, name);
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, id);
        Block block = factory.apply(propertiesSupplier.get().setId(key));
        return Registry.register(BuiltInRegistries.BLOCK, id, block);
    }

    private static void registerBlockItems(String name, Block block) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Item.Properties properties = new Item.Properties().setId(key).useBlockDescriptionPrefix();
        Item item = block instanceof DoorBlock
                ? new DoubleHighBlockItem(block, properties)
                : new BlockItem(block, properties);
        Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    public static void registerModBlocks() {
        MoreTreesCommon.LOGGER.info("Registering ModBlocks " + MoreTreesCommon.MOD_ID);
    }
}
