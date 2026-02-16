package net.egon.moretrees.neoforge.registry;

import net.egon.moretrees.neoforge.MoreTreesNeoForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public final class NeoModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHESTNUT_TREE = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(MoreTreesNeoForge.MOD_ID, "chestnut_tree")
    );

    public static final ResourceKey<ConfiguredFeature<?, ?>> MAPLE_TREE = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(MoreTreesNeoForge.MOD_ID, "maple_tree")
    );

    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH_TREE = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(MoreTreesNeoForge.MOD_ID, "beech_tree")
    );

    private NeoModConfiguredFeatures() {
    }
}
