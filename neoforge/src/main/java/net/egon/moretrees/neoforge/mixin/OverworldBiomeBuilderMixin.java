package net.egon.moretrees.neoforge.mixin;

import net.egon.moretrees.neoforge.registry.NeoModBiomes;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.OverworldBiomeBuilder;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(OverworldBiomeBuilder.class)
public class OverworldBiomeBuilderMixin {
    @Shadow
    @Final
    private ResourceKey<Biome>[][] MIDDLE_BIOMES;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void moretrees$injectCustomBiomes(CallbackInfo ci) {
        // NeoForge constructs vanilla-only biome lookups in a few validation flows.
        // Injecting mod biome keys there trips "unreferenced key" checks before the
        // full mod-backed worldgen registries are available.
        if (isVanillaOnlyBiomeLookup()) {
            return;
        }

        // Match the Fabric behavior: swap selected vanilla temperate forest slots.
        this.MIDDLE_BIOMES[1][2] = NeoModBiomes.MAPLE_FOREST;
        this.MIDDLE_BIOMES[2][2] = NeoModBiomes.BROADLEAF_FOREST;
    }

    private static boolean isVanillaOnlyBiomeLookup() {
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            if ("net.minecraft.commands.Commands".equals(element.getClassName()) && "validate".equals(element.getMethodName())) {
                return true;
            }
            if ("net.minecraft.client.gui.screens.worldselection.WorldOpenFlows".equals(element.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
