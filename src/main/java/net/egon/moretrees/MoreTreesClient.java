package net.egon.moretrees;

import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.client.ModBoatEntityRenderer;
import net.egon.moretrees.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.entity.EntityRendererFactories;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;

public class MoreTreesClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEECH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEECH_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEECH_TRAPDOOR, BlockRenderLayer.CUTOUT);

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

        EntityRendererFactories.register(ModEntities.MAPLE_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_BOAT,
                        Identifier.of(MoreTrees.MOD_ID, "textures/entity/boat/maple.png")));
        EntityRendererFactories.register(ModEntities.MAPLE_CHEST_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_CHEST_BOAT,
                        Identifier.of(MoreTrees.MOD_ID, "textures/entity/chest_boat/maple.png")));

        EntityRendererFactories.register(ModEntities.CHESTNUT_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_BOAT,
                        Identifier.of(MoreTrees.MOD_ID, "textures/entity/boat/chestnut.png")));
        EntityRendererFactories.register(ModEntities.CHESTNUT_CHEST_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_CHEST_BOAT,
                        Identifier.of(MoreTrees.MOD_ID, "textures/entity/chest_boat/chestnut.png")));

        EntityRendererFactories.register(ModEntities.BEECH_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_BOAT,
                        Identifier.of(MoreTrees.MOD_ID, "textures/entity/boat/beech.png")));
        EntityRendererFactories.register(ModEntities.BEECH_CHEST_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_CHEST_BOAT,
                        Identifier.of(MoreTrees.MOD_ID, "textures/entity/chest_boat/beech.png")));
    }
}
