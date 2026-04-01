package net.egon.moretrees.client;

import net.egon.moretrees.MoreTreesCommon;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public final class ModModelLayers {
    public static final ModelLayerLocation CHESTNUT_BOAT = create("boat/chestnut");
    public static final ModelLayerLocation CHESTNUT_CHEST_BOAT = create("chest_boat/chestnut");
    public static final ModelLayerLocation MAPLE_BOAT = create("boat/maple");
    public static final ModelLayerLocation MAPLE_CHEST_BOAT = create("chest_boat/maple");
    public static final ModelLayerLocation BEECH_BOAT = create("boat/beech");
    public static final ModelLayerLocation BEECH_CHEST_BOAT = create("chest_boat/beech");

    private ModModelLayers() {
    }

    private static ModelLayerLocation create(String path) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, path), "main");
    }
}
