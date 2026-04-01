package net.egon.moretrees.world;

import net.egon.moretrees.MoreTreesCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public final class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> CHESTNUT_TREE = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, "chestnut_tree")
    );
    public static final ResourceKey<ConfiguredFeature<?, ?>> MAPLE_TREE = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, "maple_tree")
    );
    public static final ResourceKey<ConfiguredFeature<?, ?>> BEECH_TREE = ResourceKey.create(
            Registries.CONFIGURED_FEATURE,
            Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, "beech_tree")
    );

    private ModConfiguredFeatures() {
    }
}
