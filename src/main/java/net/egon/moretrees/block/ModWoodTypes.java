package net.egon.moretrees.block;

import net.egon.moretrees.MoreTrees;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.util.Identifier;

public final class ModWoodTypes {
    public static final WoodType CHESTNUT = register("chestnut");
    public static final WoodType MAPLE = register("maple");
    public static final WoodType BEECH = register("beech");

    private ModWoodTypes() {
    }

    private static WoodType register(String name) {
        return WoodTypeBuilder.copyOf(WoodType.OAK)
                .register(Identifier.of(MoreTrees.MOD_ID, name), BlockSetType.OAK);
    }
}
