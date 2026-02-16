package net.egon.moretrees.neoforge.client;

import net.egon.moretrees.neoforge.registry.NeoModBlocks;
import net.egon.moretrees.neoforge.registry.NeoModEntities;
import net.minecraft.client.model.object.boat.BoatModel;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.entity.BoatRenderer;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

public final class NeoModClientEvents {
    private static final int LEAVES_TINT_NONE = 0xFFFFFF;

    private NeoModClientEvents() {
    }

    public static void register(IEventBus modEventBus) {
        modEventBus.addListener(NeoModClientEvents::onClientSetup);
        modEventBus.addListener(NeoModClientEvents::onRegisterRenderers);
        modEventBus.addListener(NeoModClientEvents::onRegisterLayerDefinitions);
        modEventBus.addListener(NeoModClientEvents::onRegisterBlockColors);
    }

    private static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            Sheets.addWoodType(NeoModBlocks.CHESTNUT_WOOD_TYPE);
            Sheets.addWoodType(NeoModBlocks.MAPLE_WOOD_TYPE);
            Sheets.addWoodType(NeoModBlocks.BEECH_WOOD_TYPE);

            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.CHESTNUT_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.MAPLE_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.BEECH_SAPLING.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.CHESTNUT_DOOR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.MAPLE_DOOR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.BEECH_DOOR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.CHESTNUT_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.MAPLE_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
            ItemBlockRenderTypes.setRenderLayer(NeoModBlocks.BEECH_TRAPDOOR.get(), ChunkSectionLayer.CUTOUT);
        });
    }

    private static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(NeoModEntities.CHESTNUT_BOAT.get(),
                context -> new BoatRenderer(context, NeoModModelLayers.CHESTNUT_BOAT));
        event.registerEntityRenderer(NeoModEntities.CHESTNUT_CHEST_BOAT.get(),
                context -> new BoatRenderer(context, NeoModModelLayers.CHESTNUT_CHEST_BOAT));
        event.registerEntityRenderer(NeoModEntities.MAPLE_BOAT.get(),
                context -> new BoatRenderer(context, NeoModModelLayers.MAPLE_BOAT));
        event.registerEntityRenderer(NeoModEntities.MAPLE_CHEST_BOAT.get(),
                context -> new BoatRenderer(context, NeoModModelLayers.MAPLE_CHEST_BOAT));
        event.registerEntityRenderer(NeoModEntities.BEECH_BOAT.get(),
                context -> new BoatRenderer(context, NeoModModelLayers.BEECH_BOAT));
        event.registerEntityRenderer(NeoModEntities.BEECH_CHEST_BOAT.get(),
                context -> new BoatRenderer(context, NeoModModelLayers.BEECH_CHEST_BOAT));
    }

    private static void onRegisterLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(NeoModModelLayers.CHESTNUT_BOAT, BoatModel::createBoatModel);
        event.registerLayerDefinition(NeoModModelLayers.CHESTNUT_CHEST_BOAT, BoatModel::createChestBoatModel);
        event.registerLayerDefinition(NeoModModelLayers.MAPLE_BOAT, BoatModel::createBoatModel);
        event.registerLayerDefinition(NeoModModelLayers.MAPLE_CHEST_BOAT, BoatModel::createChestBoatModel);
        event.registerLayerDefinition(NeoModModelLayers.BEECH_BOAT, BoatModel::createBoatModel);
        event.registerLayerDefinition(NeoModModelLayers.BEECH_CHEST_BOAT, BoatModel::createChestBoatModel);
    }

    private static void onRegisterBlockColors(RegisterColorHandlersEvent.Block event) {
        event.register((state, world, pos, tintIndex) -> LEAVES_TINT_NONE,
                NeoModBlocks.CHESTNUT_LEAVES.get(),
                NeoModBlocks.MAPLE_LEAVES.get(),
                NeoModBlocks.BEECH_LEAVES.get());
    }
}
