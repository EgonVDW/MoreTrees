package net.egon.moretrees.world;

import net.egon.moretrees.MoreTreesCommon;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public final class ModBiomes {
    public static final RegistryKey<Biome> BROADLEAF_FOREST =
            RegistryKey.of(RegistryKeys.BIOME, Identifier.of(MoreTreesCommon.MOD_ID, "broadleaf_forest"));
    public static final RegistryKey<Biome> MAPLE_FOREST =
            RegistryKey.of(RegistryKeys.BIOME, Identifier.of(MoreTreesCommon.MOD_ID, "maple_forest"));

    private ModBiomes() {
    }
}
