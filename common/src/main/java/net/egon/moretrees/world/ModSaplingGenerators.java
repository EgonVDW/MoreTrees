package net.egon.moretrees.world;

import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public final class ModSaplingGenerators {
    public static final TreeGrower CHESTNUT = new TreeGrower(
            "moretrees_chestnut",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.CHESTNUT_TREE),
            Optional.empty()
    );

    public static final TreeGrower MAPLE = new TreeGrower(
            "moretrees_maple",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.MAPLE_TREE),
            Optional.empty()
    );

    public static final TreeGrower BEECH = new TreeGrower(
            "moretrees_beech",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.BEECH_TREE),
            Optional.empty()
    );

    private ModSaplingGenerators() {
    }
}
