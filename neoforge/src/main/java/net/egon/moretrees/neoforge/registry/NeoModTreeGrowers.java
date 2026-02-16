package net.egon.moretrees.neoforge.registry;

import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public final class NeoModTreeGrowers {
    public static final TreeGrower CHESTNUT = new TreeGrower(
            "moretrees_chestnut",
            Optional.empty(),
            Optional.of(NeoModConfiguredFeatures.CHESTNUT_TREE),
            Optional.empty()
    );

    public static final TreeGrower MAPLE = new TreeGrower(
            "moretrees_maple",
            Optional.empty(),
            Optional.of(NeoModConfiguredFeatures.MAPLE_TREE),
            Optional.empty()
    );

    public static final TreeGrower BEECH = new TreeGrower(
            "moretrees_beech",
            Optional.empty(),
            Optional.of(NeoModConfiguredFeatures.BEECH_TREE),
            Optional.empty()
    );

    private NeoModTreeGrowers() {
    }
}
