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
                .add(ModBlocks.BEECH_PLANKS)
                .add(ModBlocks.CHESTNUT_SLAB)
                .add(ModBlocks.MAPLE_SLAB)
                .add(ModBlocks.BEECH_SLAB)
                .add(ModBlocks.CHESTNUT_STAIRS)
                .add(ModBlocks.MAPLE_STAIRS)
                .add(ModBlocks.BEECH_STAIRS)
                .add(ModBlocks.CHESTNUT_FENCE)
                .add(ModBlocks.MAPLE_FENCE)
                .add(ModBlocks.BEECH_FENCE)
                .add(ModBlocks.CHESTNUT_FENCE_GATE)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.BEECH_FENCE_GATE)
                .add(ModBlocks.CHESTNUT_DOOR)
                .add(ModBlocks.MAPLE_DOOR)
                .add(ModBlocks.BEECH_DOOR)
                .add(ModBlocks.CHESTNUT_TRAPDOOR)
                .add(ModBlocks.MAPLE_TRAPDOOR)
                .add(ModBlocks.BEECH_TRAPDOOR)
                .add(ModBlocks.CHESTNUT_BUTTON)
                .add(ModBlocks.MAPLE_BUTTON)
                .add(ModBlocks.BEECH_BUTTON)
                .add(ModBlocks.CHESTNUT_PRESSURE_PLATE)
                .add(ModBlocks.MAPLE_PRESSURE_PLATE)
                .add(ModBlocks.BEECH_PRESSURE_PLATE);

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

        valueLookupBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.CHESTNUT_SAPLING)
                .add(ModBlocks.MAPLE_SAPLING)
                .add(ModBlocks.BEECH_SAPLING);

        valueLookupBuilder(BlockTags.PLANKS)
                .add(ModBlocks.CHESTNUT_PLANKS)
                .add(ModBlocks.MAPLE_PLANKS)
                .add(ModBlocks.BEECH_PLANKS);

        valueLookupBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.CHESTNUT_SLAB)
                .add(ModBlocks.MAPLE_SLAB)
                .add(ModBlocks.BEECH_SLAB);

        valueLookupBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.CHESTNUT_STAIRS)
                .add(ModBlocks.MAPLE_STAIRS)
                .add(ModBlocks.BEECH_STAIRS);

        valueLookupBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.CHESTNUT_FENCE)
                .add(ModBlocks.MAPLE_FENCE)
                .add(ModBlocks.BEECH_FENCE);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.CHESTNUT_FENCE_GATE)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.BEECH_FENCE_GATE);

        valueLookupBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.CHESTNUT_DOOR)
                .add(ModBlocks.MAPLE_DOOR)
                .add(ModBlocks.BEECH_DOOR);

        valueLookupBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.CHESTNUT_TRAPDOOR)
                .add(ModBlocks.MAPLE_TRAPDOOR)
                .add(ModBlocks.BEECH_TRAPDOOR);

        valueLookupBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.CHESTNUT_BUTTON)
                .add(ModBlocks.MAPLE_BUTTON)
                .add(ModBlocks.BEECH_BUTTON);

        valueLookupBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.CHESTNUT_PRESSURE_PLATE)
                .add(ModBlocks.MAPLE_PRESSURE_PLATE)
                .add(ModBlocks.BEECH_PRESSURE_PLATE);

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

        valueLookupBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.CHESTNUT_SIGN)
                .add(ModBlocks.MAPLE_SIGN)
                .add(ModBlocks.BEECH_SIGN);

        valueLookupBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.CHESTNUT_WALL_SIGN)
                .add(ModBlocks.MAPLE_WALL_SIGN)
                .add(ModBlocks.BEECH_WALL_SIGN);

        valueLookupBuilder(BlockTags.SIGNS)
                .add(ModBlocks.CHESTNUT_SIGN)
                .add(ModBlocks.MAPLE_SIGN)
                .add(ModBlocks.BEECH_SIGN)
                .add(ModBlocks.CHESTNUT_WALL_SIGN)
                .add(ModBlocks.MAPLE_WALL_SIGN)
                .add(ModBlocks.BEECH_WALL_SIGN);

        valueLookupBuilder(BlockTags.ALL_SIGNS)
                .add(ModBlocks.CHESTNUT_SIGN)
                .add(ModBlocks.MAPLE_SIGN)
                .add(ModBlocks.BEECH_SIGN)
                .add(ModBlocks.CHESTNUT_WALL_SIGN)
                .add(ModBlocks.MAPLE_WALL_SIGN)
                .add(ModBlocks.BEECH_WALL_SIGN)
                .add(ModBlocks.CHESTNUT_HANGING_SIGN)
                .add(ModBlocks.MAPLE_HANGING_SIGN)
                .add(ModBlocks.BEECH_HANGING_SIGN)
                .add(ModBlocks.CHESTNUT_WALL_HANGING_SIGN)
                .add(ModBlocks.MAPLE_WALL_HANGING_SIGN)
                .add(ModBlocks.BEECH_WALL_HANGING_SIGN);

        valueLookupBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.CHESTNUT_HANGING_SIGN)
                .add(ModBlocks.MAPLE_HANGING_SIGN)
                .add(ModBlocks.BEECH_HANGING_SIGN);

        valueLookupBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.CHESTNUT_WALL_HANGING_SIGN)
                .add(ModBlocks.MAPLE_WALL_HANGING_SIGN)
                .add(ModBlocks.BEECH_WALL_HANGING_SIGN);

        valueLookupBuilder(BlockTags.ALL_HANGING_SIGNS)
                .add(ModBlocks.CHESTNUT_HANGING_SIGN)
                .add(ModBlocks.MAPLE_HANGING_SIGN)
                .add(ModBlocks.BEECH_HANGING_SIGN)
                .add(ModBlocks.CHESTNUT_WALL_HANGING_SIGN)
                .add(ModBlocks.MAPLE_WALL_HANGING_SIGN)
                .add(ModBlocks.BEECH_WALL_HANGING_SIGN);
    }
}
