package net.egon.moretrees.world;

import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator CHESTNUT = new SaplingGenerator(
            "chestnut",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.CHESTNUT_TREE),
            Optional.empty()
    );

    public static final SaplingGenerator MAPLE = new SaplingGenerator(
            "maple",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.MAPLE_TREE),
            Optional.empty()
    );

    public static final SaplingGenerator BEECH = new SaplingGenerator(
            "beech",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.BEECH_TREE),
            Optional.empty()
    );

    private ModSaplingGenerators() {
    }
}
