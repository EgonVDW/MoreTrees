package net.egon.moretrees.block;

import net.egon.moretrees.MoreTreesCommon;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public final class ModWoodTypes {
    public static final WoodType CHESTNUT = register("chestnut");
    public static final WoodType MAPLE = register("maple");
    public static final WoodType BEECH = register("beech");

    private ModWoodTypes() {
    }

    private static WoodType register(String name) {
        return WoodTypeBuilder.copyOf(WoodType.OAK)
                .register(Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, name), BlockSetType.OAK);
    }
}
