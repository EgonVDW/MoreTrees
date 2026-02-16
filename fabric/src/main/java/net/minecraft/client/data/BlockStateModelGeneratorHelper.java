package net.minecraft.client.data;

import net.minecraft.block.Block;
import net.minecraft.data.family.BlockFamily;

/**
 * Accesses package-private model generator APIs for mod datagen.
 */
public final class BlockStateModelGeneratorHelper {
    private BlockStateModelGeneratorHelper() {
    }

    public static void registerCubeAllFamily(BlockStateModelGenerator generator, BlockFamily family) {
        Block baseBlock = family.getBaseBlock();
        TexturedModel texturedModel = BlockStateModelGenerator.TEXTURED_MODELS.getOrDefault(
                baseBlock,
                TexturedModel.CUBE_ALL.get(baseBlock)
        );
        BlockStateModelGenerator.BlockTexturePool pool =
                generator.new BlockTexturePool(texturedModel.getTextures());
        pool.base(baseBlock, texturedModel.getModel());
        pool.family(family);
    }
}
