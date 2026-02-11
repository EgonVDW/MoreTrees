package net.egon.moretrees;

import net.egon.moretrees.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.BlockRenderLayer;

public class MoreTreesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEECH_SAPLING, BlockRenderLayer.CUTOUT);

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> {
                    if (world == null || pos == null) {
                        return 0x48B518;
                    }
                    return BiomeColors.getFoliageColor(world, pos);
                },
                ModBlocks.CHESTNUT_LEAVES,
                ModBlocks.BEECH_LEAVES
        );

        ColorProviderRegistry.BLOCK.register(
                (state, world, pos, tintIndex) -> 0xD97B2E,
                ModBlocks.MAPLE_LEAVES
        );
    }
}
