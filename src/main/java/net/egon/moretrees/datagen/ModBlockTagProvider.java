package net.egon.moretrees.datagen;

import net.egon.moretrees.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.CHESTNUT_LOG)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.BEECH_LOG)
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_BEECH_LOG)
                .add(ModBlocks.CHESTNUT_WOOD)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.BEECH_WOOD)
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_BEECH_WOOD)
                .add(ModBlocks.CHESTNUT_PLANKS)
                .add(ModBlocks.MAPLE_PLANKS)
                .add(ModBlocks.BEECH_PLANKS);

        valueLookupBuilder(BlockTags.LOGS)
                .add(ModBlocks.CHESTNUT_LOG)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.BEECH_LOG)
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_BEECH_LOG);

        valueLookupBuilder(BlockTags.LEAVES)
                .add(ModBlocks.CHESTNUT_LEAVES)
                .add(ModBlocks.MAPLE_LEAVES)
                .add(ModBlocks.BEECH_LEAVES);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHESTNUT_LOG)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.BEECH_LOG)
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.STRIPPED_BEECH_LOG)
                .add(ModBlocks.CHESTNUT_WOOD)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.BEECH_WOOD)
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_BEECH_WOOD);
    }
}
