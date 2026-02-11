package net.egon.moretrees.world;

import net.egon.moretrees.MoreTrees;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_TREE =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreTrees.MOD_ID, "chestnut_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_TREE =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreTrees.MOD_ID, "maple_tree"));
    public static final RegistryKey<ConfiguredFeature<?, ?>> BEECH_TREE =
            RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(MoreTrees.MOD_ID, "beech_tree"));

    private ModConfiguredFeatures() {
    }
}
