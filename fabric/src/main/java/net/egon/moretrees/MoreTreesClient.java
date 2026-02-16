package net.egon.moretrees;

import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.block.ModWoodTypes;
import net.egon.moretrees.client.ModBoatEntityRenderer;
import net.egon.moretrees.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.entity.EntityRendererFactories;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.client.util.SpriteIdentifier;
import net.minecraft.block.WoodType;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;

public class MoreTreesClient implements ClientModInitializer {
    private static final int LEAVES_TINT_NONE = 0xFFFFFF;

    @Override
    public void onInitializeClient() {
        registerSignTextures();

        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEECH_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEECH_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.CHESTNUT_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.MAPLE_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(ModBlocks.BEECH_TRAPDOOR, BlockRenderLayer.CUTOUT);

        registerLeafColor(LEAVES_TINT_NONE, ModBlocks.CHESTNUT_LEAVES);
        registerLeafColor(LEAVES_TINT_NONE, ModBlocks.BEECH_LEAVES);
        registerLeafColor(LEAVES_TINT_NONE, ModBlocks.MAPLE_LEAVES);

        EntityRendererFactories.register(ModEntities.MAPLE_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_BOAT,
                        Identifier.of(MoreTreesCommon.MOD_ID, "textures/entity/boat/maple.png")));
        EntityRendererFactories.register(ModEntities.MAPLE_CHEST_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_CHEST_BOAT,
                        Identifier.of(MoreTreesCommon.MOD_ID, "textures/entity/chest_boat/maple.png")));

        EntityRendererFactories.register(ModEntities.CHESTNUT_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_BOAT,
                        Identifier.of(MoreTreesCommon.MOD_ID, "textures/entity/boat/chestnut.png")));
        EntityRendererFactories.register(ModEntities.CHESTNUT_CHEST_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_CHEST_BOAT,
                        Identifier.of(MoreTreesCommon.MOD_ID, "textures/entity/chest_boat/chestnut.png")));

        EntityRendererFactories.register(ModEntities.BEECH_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_BOAT,
                        Identifier.of(MoreTreesCommon.MOD_ID, "textures/entity/boat/beech.png")));
        EntityRendererFactories.register(ModEntities.BEECH_CHEST_BOAT, ctx ->
                new ModBoatEntityRenderer(ctx, EntityModelLayers.OAK_CHEST_BOAT,
                        Identifier.of(MoreTreesCommon.MOD_ID, "textures/entity/chest_boat/beech.png")));
    }

    private static void registerSignTextures() {
        registerSignTextures(ModWoodTypes.CHESTNUT, "chestnut");
        registerSignTextures(ModWoodTypes.MAPLE, "maple");
        registerSignTextures(ModWoodTypes.BEECH, "beech");
    }

    private static void registerLeafColor(int color, Block block) {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> color, block);
    }

    private static void registerSignTextures(WoodType woodType, String name) {
        TexturedRenderLayers.SIGN_TYPE_TEXTURES.put(woodType,
                new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
                        Identifier.of(MoreTreesCommon.MOD_ID, "entity/signs/" + name)));
        TexturedRenderLayers.HANGING_SIGN_TYPE_TEXTURES.put(woodType,
                new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE,
                        Identifier.of(MoreTreesCommon.MOD_ID, "entity/signs/hanging/" + name)));
    }
}
