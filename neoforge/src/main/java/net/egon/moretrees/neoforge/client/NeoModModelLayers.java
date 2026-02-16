package net.egon.moretrees.neoforge.client;

import net.egon.moretrees.neoforge.MoreTreesNeoForge;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public final class NeoModModelLayers {
    public static final ModelLayerLocation CHESTNUT_BOAT = create("boat/chestnut");
    public static final ModelLayerLocation CHESTNUT_CHEST_BOAT = create("chest_boat/chestnut");
    public static final ModelLayerLocation MAPLE_BOAT = create("boat/maple");
    public static final ModelLayerLocation MAPLE_CHEST_BOAT = create("chest_boat/maple");
    public static final ModelLayerLocation BEECH_BOAT = create("boat/beech");
    public static final ModelLayerLocation BEECH_CHEST_BOAT = create("chest_boat/beech");

    private NeoModModelLayers() {
    }

    private static ModelLayerLocation create(String path) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(MoreTreesNeoForge.MOD_ID, path), "main");
    }
}
