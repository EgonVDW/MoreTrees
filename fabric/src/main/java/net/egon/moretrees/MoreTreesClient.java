package net.egon.moretrees;

import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.block.ModWoodTypes;
import net.egon.moretrees.client.ModModelLayers;
import net.egon.moretrees.entity.ModEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockColorRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.color.block.BlockTintSources;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.resources.model.sprite.SpriteId;
import net.minecraft.resources.Identifier;

public class MoreTreesClient implements ClientModInitializer {
    private static final int LEAVES_TINT_NONE = 0xFFFFFFFF;

    @Override
    public void onInitializeClient() {
        registerSignTextures();
        registerLeafColors();
        registerModelLayers();
        registerBoatRenderers();
    }

    private static void registerLeafColors() {
        BlockColorRegistry.register(
                java.util.List.of(BlockTintSources.constant(LEAVES_TINT_NONE)),
                ModBlocks.CHESTNUT_LEAVES,
                ModBlocks.MAPLE_LEAVES,
                ModBlocks.BEECH_LEAVES
        );
    }

    private static void registerModelLayers() {
        ModelLayerRegistry.registerModelLayer(ModModelLayers.CHESTNUT_BOAT, BoatModel::createBoatModel);
        ModelLayerRegistry.registerModelLayer(ModModelLayers.CHESTNUT_CHEST_BOAT, BoatModel::createChestBoatModel);
        ModelLayerRegistry.registerModelLayer(ModModelLayers.MAPLE_BOAT, BoatModel::createBoatModel);
        ModelLayerRegistry.registerModelLayer(ModModelLayers.MAPLE_CHEST_BOAT, BoatModel::createChestBoatModel);
        ModelLayerRegistry.registerModelLayer(ModModelLayers.BEECH_BOAT, BoatModel::createBoatModel);
        ModelLayerRegistry.registerModelLayer(ModModelLayers.BEECH_CHEST_BOAT, BoatModel::createChestBoatModel);
    }

    private static void registerBoatRenderers() {
        EntityRenderers.register(ModEntities.CHESTNUT_BOAT, context -> new BoatRenderer(context, ModModelLayers.CHESTNUT_BOAT));
        EntityRenderers.register(ModEntities.CHESTNUT_CHEST_BOAT, context -> new BoatRenderer(context, ModModelLayers.CHESTNUT_CHEST_BOAT));
        EntityRenderers.register(ModEntities.MAPLE_BOAT, context -> new BoatRenderer(context, ModModelLayers.MAPLE_BOAT));
        EntityRenderers.register(ModEntities.MAPLE_CHEST_BOAT, context -> new BoatRenderer(context, ModModelLayers.MAPLE_CHEST_BOAT));
        EntityRenderers.register(ModEntities.BEECH_BOAT, context -> new BoatRenderer(context, ModModelLayers.BEECH_BOAT));
        EntityRenderers.register(ModEntities.BEECH_CHEST_BOAT, context -> new BoatRenderer(context, ModModelLayers.BEECH_CHEST_BOAT));
    }

    private static void registerSignTextures() {
        registerSignTextures(ModWoodTypes.CHESTNUT, "chestnut");
        registerSignTextures(ModWoodTypes.MAPLE, "maple");
        registerSignTextures(ModWoodTypes.BEECH, "beech");
    }

    private static void registerSignTextures(net.minecraft.world.level.block.state.properties.WoodType woodType, String name) {
        Sheets.SIGN_SPRITES.put(
                woodType,
                new SpriteId(Sheets.SIGN_SHEET, Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, "entity/signs/" + name))
        );
        Sheets.HANGING_SIGN_SPRITES.put(
                woodType,
                new SpriteId(Sheets.SIGN_SHEET, Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, "entity/signs/hanging/" + name))
        );
    }
}
