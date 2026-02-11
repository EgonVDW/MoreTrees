package net.egon.moretrees.datagen;

import net.egon.moretrees.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
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
        blockStateModelGenerator.registerSingleton(ModBlocks.CHESTNUT_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.STRIPPED_CHESTNUT_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHESTNUT_WOOD, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.STRIPPED_CHESTNUT_WOOD, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSingleton(ModBlocks.MAPLE_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.STRIPPED_MAPLE_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.MAPLE_WOOD, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.STRIPPED_MAPLE_WOOD, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSingleton(ModBlocks.BEECH_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.STRIPPED_BEECH_LOG, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.BEECH_WOOD, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.STRIPPED_BEECH_WOOD, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAPLE_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHESTNUT_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BEECH_PLANKS);

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

    }
}
