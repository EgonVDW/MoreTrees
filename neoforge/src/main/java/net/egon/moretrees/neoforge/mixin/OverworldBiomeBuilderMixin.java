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
        // NeoForge calls Commands.validate() in dev startup with a vanilla-only biome lookup.
        // Injecting mod biomes there trips "unreferenced key" checks and crashes startup.
        if (isCommandValidationBootstrap()) {
            return;
        }

        // Match the Fabric behavior: swap selected vanilla temperate forest slots.
        this.MIDDLE_BIOMES[1][2] = NeoModBiomes.MAPLE_FOREST;
        this.MIDDLE_BIOMES[2][2] = NeoModBiomes.BROADLEAF_FOREST;
    }

    private static boolean isCommandValidationBootstrap() {
        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
            if ("net.minecraft.commands.Commands".equals(element.getClassName()) && "validate".equals(element.getMethodName())) {
                return true;
            }
        }
        return false;
    }
}
