package net.egon.moretrees.datagen;

import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ModTags.Items.CHESTNUT_LOGS)
                .add(ModBlocks.CHESTNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())
                .add(ModBlocks.CHESTNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD.asItem());

        valueLookupBuilder(ModTags.Items.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem());

        valueLookupBuilder(ModTags.Items.BEECH_LOGS)
                .add(ModBlocks.BEECH_LOG.asItem())
                .add(ModBlocks.STRIPPED_BEECH_LOG.asItem())
                .add(ModBlocks.BEECH_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BEECH_WOOD.asItem());

        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.CHESTNUT_LOG.asItem())
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.BEECH_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_BEECH_LOG.asItem())
                .add(ModBlocks.CHESTNUT_WOOD.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.BEECH_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BEECH_WOOD.asItem());

        valueLookupBuilder(ItemTags.PLANKS)
                .add(ModBlocks.CHESTNUT_PLANKS.asItem())
                .add(ModBlocks.MAPLE_PLANKS.asItem())
                .add(ModBlocks.BEECH_PLANKS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_SLABS)
                .add(ModBlocks.CHESTNUT_SLAB.asItem())
                .add(ModBlocks.MAPLE_SLAB.asItem())
                .add(ModBlocks.BEECH_SLAB.asItem());

        valueLookupBuilder(ItemTags.WOODEN_STAIRS)
                .add(ModBlocks.CHESTNUT_STAIRS.asItem())
                .add(ModBlocks.MAPLE_STAIRS.asItem())
                .add(ModBlocks.BEECH_STAIRS.asItem());

        valueLookupBuilder(ItemTags.WOODEN_FENCES)
                .add(ModBlocks.CHESTNUT_FENCE.asItem())
                .add(ModBlocks.MAPLE_FENCE.asItem())
                .add(ModBlocks.BEECH_FENCE.asItem());

        valueLookupBuilder(ItemTags.FENCE_GATES)
                .add(ModBlocks.CHESTNUT_FENCE_GATE.asItem())
                .add(ModBlocks.MAPLE_FENCE_GATE.asItem())
                .add(ModBlocks.BEECH_FENCE_GATE.asItem());

        valueLookupBuilder(ItemTags.WOODEN_DOORS)
                .add(ModBlocks.CHESTNUT_DOOR.asItem())
                .add(ModBlocks.MAPLE_DOOR.asItem())
                .add(ModBlocks.BEECH_DOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.CHESTNUT_TRAPDOOR.asItem())
                .add(ModBlocks.MAPLE_TRAPDOOR.asItem())
                .add(ModBlocks.BEECH_TRAPDOOR.asItem());

        valueLookupBuilder(ItemTags.WOODEN_BUTTONS)
                .add(ModBlocks.CHESTNUT_BUTTON.asItem())
                .add(ModBlocks.MAPLE_BUTTON.asItem())
                .add(ModBlocks.BEECH_BUTTON.asItem());

        valueLookupBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.CHESTNUT_PRESSURE_PLATE.asItem())
                .add(ModBlocks.MAPLE_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BEECH_PRESSURE_PLATE.asItem());
    }
}
