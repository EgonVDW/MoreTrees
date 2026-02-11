package net.egon.moretrees.block;

import net.egon.moretrees.MoreTrees;
import net.egon.moretrees.world.ModSaplingGenerators;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
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

    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            key -> new TintedParticleLeavesBlock(0.01f, AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(key)));
    public static final Block MAPLE_LEAVES = registerBlock("maple_leaves",
            key -> new TintedParticleLeavesBlock(0.01f, AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(key)));
    public static final Block BEECH_LEAVES = registerBlock("beech_leaves",
            key -> new TintedParticleLeavesBlock(0.01f, AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).registryKey(key)));

    public static final Block CHESTNUT_SAPLING = registerBlock("chestnut_sapling",
            key -> new SaplingBlock(ModSaplingGenerators.CHESTNUT, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(key)));
    public static final Block MAPLE_SAPLING = registerBlock("maple_sapling",
            key -> new SaplingBlock(ModSaplingGenerators.MAPLE, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(key)));
    public static final Block BEECH_SAPLING = registerBlock("beech_sapling",
            key -> new SaplingBlock(ModSaplingGenerators.BEECH, AbstractBlock.Settings.copy(Blocks.OAK_SAPLING).registryKey(key)));

    private static Block registerBlock(String name, Function<RegistryKey<Block>, Block> blockFactory) {
        Identifier id = Identifier.of(MoreTrees.MOD_ID, name);
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, id);
        Block block = blockFactory.apply(key);
        Block registeredBlock = Registry.register(Registries.BLOCK, id, block);
        registerBlockItems(name, registeredBlock);
        return registeredBlock;
    }

    private static void registerBlockItems(String name, Block block) {
        Identifier id = Identifier.of(MoreTrees.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item.Settings settings = new Item.Settings()
                .registryKey(key)
                .useBlockPrefixedTranslationKey();
        Registry.register(Registries.ITEM, id, new BlockItem(block, settings));
    }

    public static void registerModBlocks() {
        MoreTrees.LOGGER.info("Registering ModBlocks " + MoreTrees.MOD_ID);
    }
}
