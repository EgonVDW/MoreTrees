package net.egon.moretrees.block;

import net.egon.moretrees.MoreTreesCommon;
import net.egon.moretrees.world.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.TallBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(key)));
    public static final Block MAPLE_LOG = registerBlock("maple_log",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(key)));
    public static final Block BEECH_LOG = registerBlock("beech_log",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).registryKey(key)));

    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(key)));
    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(key)));
    public static final Block STRIPPED_BEECH_LOG = registerBlock("stripped_beech_log",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).registryKey(key)));

    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(key)));
    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(key)));
    public static final Block BEECH_WOOD = registerBlock("beech_wood",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).registryKey(key)));

    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(key)));
    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(key)));
    public static final Block STRIPPED_BEECH_WOOD = registerBlock("stripped_beech_wood",
            key -> new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).registryKey(key)));

    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            key -> new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(key)));
    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            key -> new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(key)));
    public static final Block BEECH_PLANKS = registerBlock("beech_planks",
            key -> new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS).registryKey(key)));

    public static final Block CHESTNUT_SLAB = registerSlabBlock("chestnut_slab");
    public static final Block CHESTNUT_STAIRS = registerStairsBlock("chestnut_stairs", CHESTNUT_PLANKS);
    public static final Block CHESTNUT_FENCE = registerFenceBlock("chestnut_fence");
    public static final Block CHESTNUT_FENCE_GATE = registerFenceGateBlock("chestnut_fence_gate");
    public static final Block CHESTNUT_DOOR = registerDoorBlock("chestnut_door");
    public static final Block CHESTNUT_TRAPDOOR = registerTrapdoorBlock("chestnut_trapdoor");
    public static final Block CHESTNUT_BUTTON = registerButtonBlock("chestnut_button");
    public static final Block CHESTNUT_PRESSURE_PLATE = registerPressurePlateBlock("chestnut_pressure_plate");

    public static final Block MAPLE_SLAB = registerSlabBlock("maple_slab");
    public static final Block MAPLE_STAIRS = registerStairsBlock("maple_stairs", MAPLE_PLANKS);
    public static final Block MAPLE_FENCE = registerFenceBlock("maple_fence");
    public static final Block MAPLE_FENCE_GATE = registerFenceGateBlock("maple_fence_gate");
    public static final Block MAPLE_DOOR = registerDoorBlock("maple_door");
    public static final Block MAPLE_TRAPDOOR = registerTrapdoorBlock("maple_trapdoor");
    public static final Block MAPLE_BUTTON = registerButtonBlock("maple_button");
    public static final Block MAPLE_PRESSURE_PLATE = registerPressurePlateBlock("maple_pressure_plate");

    public static final Block BEECH_SLAB = registerSlabBlock("beech_slab");
    public static final Block BEECH_STAIRS = registerStairsBlock("beech_stairs", BEECH_PLANKS);
    public static final Block BEECH_FENCE = registerFenceBlock("beech_fence");
    public static final Block BEECH_FENCE_GATE = registerFenceGateBlock("beech_fence_gate");
    public static final Block BEECH_DOOR = registerDoorBlock("beech_door");
    public static final Block BEECH_TRAPDOOR = registerTrapdoorBlock("beech_trapdoor");
    public static final Block BEECH_BUTTON = registerButtonBlock("beech_button");
    public static final Block BEECH_PRESSURE_PLATE = registerPressurePlateBlock("beech_pressure_plate");

    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            key -> new FixedColorParticleLeavesBlock(0.01f, 0x285F15,
                    AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(key)));
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            key -> new FixedColorParticleLeavesBlock(0.01f, 0xE85D08,
                    AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(key)));
    public static final Block BEECH_LEAVES = registerBlock("beech_leaves",
            key -> new FixedColorParticleLeavesBlock(0.01f, 0x3E8C2F,
                    AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(key)));

    public static final Block CHESTNUT_SAPLING = registerBlock("chestnut_sapling",
            key -> new SaplingBlock(ModSaplingGenerators.CHESTNUT, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(key)));
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",
            key -> new SaplingBlock(ModSaplingGenerators.MAPLE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(key)));
    public static final Block BEECH_SAPLING = registerBlock("beech_sapling",
            key -> new SaplingBlock(ModSaplingGenerators.BEECH, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(key)));

    public static final Block CHESTNUT_SIGN = registerBlockWithoutItem("chestnut_sign",
            key -> new SignBlock(ModWoodTypes.CHESTNUT, AbstractBlock.Settings.copy(Blocks.OAK_SIGN).registryKey(key)));
    public static final Block CHESTNUT_WALL_SIGN = registerBlockWithoutItem("chestnut_wall_sign",
            key -> new WallSignBlock(ModWoodTypes.CHESTNUT, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).registryKey(key)));
    public static final Block CHESTNUT_HANGING_SIGN = registerBlockWithoutItem("chestnut_hanging_sign",
            key -> new HangingSignBlock(ModWoodTypes.CHESTNUT, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).registryKey(key)));
    public static final Block CHESTNUT_WALL_HANGING_SIGN = registerBlockWithoutItem("chestnut_wall_hanging_sign",
            key -> new WallHangingSignBlock(ModWoodTypes.CHESTNUT, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN).registryKey(key)));

    public static final Block MAPLE_SIGN = registerBlockWithoutItem("maple_sign",
            key -> new SignBlock(ModWoodTypes.MAPLE, AbstractBlock.Settings.copy(Blocks.OAK_SIGN).registryKey(key)));
    public static final Block MAPLE_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",
            key -> new WallSignBlock(ModWoodTypes.MAPLE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).registryKey(key)));
    public static final Block MAPLE_HANGING_SIGN = registerBlockWithoutItem("maple_hanging_sign",
            key -> new HangingSignBlock(ModWoodTypes.MAPLE, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).registryKey(key)));
    public static final Block MAPLE_WALL_HANGING_SIGN = registerBlockWithoutItem("maple_wall_hanging_sign",
            key -> new WallHangingSignBlock(ModWoodTypes.MAPLE, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN).registryKey(key)));

    public static final Block BEECH_SIGN = registerBlockWithoutItem("beech_sign",
            key -> new SignBlock(ModWoodTypes.BEECH, AbstractBlock.Settings.copy(Blocks.OAK_SIGN).registryKey(key)));
    public static final Block BEECH_WALL_SIGN = registerBlockWithoutItem("beech_wall_sign",
            key -> new WallSignBlock(ModWoodTypes.BEECH, AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).registryKey(key)));
    public static final Block BEECH_HANGING_SIGN = registerBlockWithoutItem("beech_hanging_sign",
            key -> new HangingSignBlock(ModWoodTypes.BEECH, AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).registryKey(key)));
    public static final Block BEECH_WALL_HANGING_SIGN = registerBlockWithoutItem("beech_wall_hanging_sign",
            key -> new WallHangingSignBlock(ModWoodTypes.BEECH, AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN).registryKey(key)));

    private static Block registerSlabBlock(String name) {
        return registerBlock(name,
                key -> new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_SLAB).registryKey(key)));
    }

    private static Block registerStairsBlock(String name, Block baseBlock) {
        return registerBlock(name,
                key -> new StairsBlock(baseBlock.getDefaultState(),
                        AbstractBlock.Settings.copy(Blocks.OAK_STAIRS).registryKey(key)) {
                });
    }

    private static Block registerFenceBlock(String name) {
        return registerBlock(name,
                key -> new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE).registryKey(key)));
    }

    private static Block registerFenceGateBlock(String name) {
        return registerBlock(name,
                key -> new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE).registryKey(key)));
    }

    private static Block registerDoorBlock(String name) {
        return registerBlock(name,
                key -> new DoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_DOOR).registryKey(key)) {
                });
    }

    private static Block registerTrapdoorBlock(String name) {
        return registerBlock(name,
                key -> new TrapdoorBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR).registryKey(key)) {
                });
    }

    private static Block registerButtonBlock(String name) {
        return registerBlock(name,
                key -> new ButtonBlock(BlockSetType.OAK, 30, AbstractBlock.Settings.copy(Blocks.OAK_BUTTON).registryKey(key)) {
                });
    }

    private static Block registerPressurePlateBlock(String name) {
        return registerBlock(name,
                key -> new PressurePlateBlock(BlockSetType.OAK, AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE).registryKey(key)) {
                });
    }

    private static Block registerBlock(String name, Function<RegistryKey<Block>, Block> blockFactory) {
        Identifier id = Identifier.of(MoreTreesCommon.MOD_ID, name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = blockFactory.apply(key);
        Block registeredBlock = Registry.register(Registries.BLOCK, id, block);
        registerBlockItems(name, registeredBlock);
        return registeredBlock;
    }

    private static Block registerBlockWithoutItem(String name, Function<RegistryKey<Block>, Block> blockFactory) {
        Identifier id = Identifier.of(MoreTreesCommon.MOD_ID, name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = blockFactory.apply(key);
        return Registry.register(Registries.BLOCK, id, block);
    }

    private static void registerBlockItems(String name, Block block) {
        Identifier id = Identifier.of(MoreTreesCommon.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings()
                .registryKey(key)
                .useBlockPrefixedTranslationKey();
        Item item = block instanceof DoorBlock
                ? new TallBlockItem(block, settings)
                : new BlockItem(block, settings);
        Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModBlocks() {
        MoreTreesCommon.LOGGER.info("Registering ModBlocks " + MoreTreesCommon.MOD_ID);
    }
}
