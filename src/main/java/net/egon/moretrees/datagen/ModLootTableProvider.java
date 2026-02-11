package net.egon.moretrees.datagen;

import net.egon.moretrees.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHESTNUT_LOG);
        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.BEECH_LOG);

        addDrop(ModBlocks.STRIPPED_CHESTNUT_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_BEECH_LOG);

        addDrop(ModBlocks.CHESTNUT_WOOD);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.BEECH_WOOD);

        addDrop(ModBlocks.STRIPPED_CHESTNUT_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_BEECH_WOOD);

        addDrop(ModBlocks.CHESTNUT_PLANKS);
        addDrop(ModBlocks.MAPLE_PLANKS);
        addDrop(ModBlocks.BEECH_PLANKS);

        addDrop(ModBlocks.CHESTNUT_SAPLING);
        addDrop(ModBlocks.MAPLE_SAPLING);
        addDrop(ModBlocks.BEECH_SAPLING);

        addDrop(ModBlocks.CHESTNUT_LEAVES, leavesDrops(ModBlocks.CHESTNUT_LEAVES, ModBlocks.CHESTNUT_SAPLING, 0.0625f));
        addDrop(ModBlocks.MAPLE_LEAVES, leavesDrops(ModBlocks.MAPLE_LEAVES, ModBlocks.MAPLE_SAPLING, 0.0625f));
        addDrop(ModBlocks.BEECH_LEAVES, leavesDrops(ModBlocks.BEECH_LEAVES, ModBlocks.BEECH_SAPLING, 0.0625f));
    }
}
