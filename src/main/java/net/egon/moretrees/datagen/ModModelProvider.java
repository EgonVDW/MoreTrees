package net.egon.moretrees.datagen;

import net.egon.moretrees.block.ModBlockFamilies;
import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGeneratorHelper;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerAxisRotated(ModBlocks.CHESTNUT_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_CHESTNUT_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.CHESTNUT_WOOD, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_CHESTNUT_WOOD, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.MAPLE_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_MAPLE_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.MAPLE_WOOD, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_MAPLE_WOOD, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerAxisRotated(ModBlocks.BEECH_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_BEECH_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.BEECH_WOOD, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerAxisRotated(ModBlocks.STRIPPED_BEECH_WOOD, TexturedModel.CUBE_COLUMN);

        BlockStateModelGeneratorHelper.registerCubeAllFamily(blockStateModelGenerator, ModBlockFamilies.CHESTNUT_FAMILY);
        BlockStateModelGeneratorHelper.registerCubeAllFamily(blockStateModelGenerator, ModBlockFamilies.MAPLE_FAMILY);
        BlockStateModelGeneratorHelper.registerCubeAllFamily(blockStateModelGenerator, ModBlockFamilies.BEECH_FAMILY);

        blockStateModelGenerator.registerSingleton(ModBlocks.MAPLE_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHESTNUT_LEAVES, TexturedModel.LEAVES);
        blockStateModelGenerator.registerSingleton(ModBlocks.BEECH_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CHESTNUT_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.BEECH_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModBlocks.CHESTNUT_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.MAPLE_SAPLING.asItem(), Models.GENERATED);
        itemModelGenerator.register(ModBlocks.BEECH_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModItems.CHESTNUT_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHESTNUT_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAPLE_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MAPLE_CHEST_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEECH_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BEECH_CHEST_BOAT, Models.GENERATED);

    }
}
