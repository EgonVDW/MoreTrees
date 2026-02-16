package net.egon.moretrees.neoforge.registry;

import net.egon.moretrees.neoforge.MoreTreesNeoForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;

public final class NeoModBiomes {
    public static final ResourceKey<Biome> BROADLEAF_FOREST = ResourceKey.create(
            Registries.BIOME,
            Identifier.fromNamespaceAndPath(MoreTreesNeoForge.MOD_ID, "broadleaf_forest")
    );

    public static final ResourceKey<Biome> MAPLE_FOREST = ResourceKey.create(
            Registries.BIOME,
            Identifier.fromNamespaceAndPath(MoreTreesNeoForge.MOD_ID, "maple_forest")
    );

    private NeoModBiomes() {
    }
}
