package net.egon.moretrees.world;

import net.egon.moretrees.MoreTreesCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public final class ModBiomes {
    public static final ResourceKey<Biome> BROADLEAF_FOREST = ResourceKey.create(
            Registries.BIOME,
            Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, "broadleaf_forest")
    );
    public static final ResourceKey<Biome> MAPLE_FOREST = ResourceKey.create(
            Registries.BIOME,
            Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, "maple_forest")
    );

    private ModBiomes() {
    }
}
