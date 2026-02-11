package net.egon.moretrees.mixin;

import net.egon.moretrees.world.ModBiomes;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.VanillaBiomeParameters;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VanillaBiomeParameters.class)
public class VanillaBiomeParametersMixin {
    @Shadow @Final private RegistryKey<Biome>[][] commonBiomes;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void moretrees$addOverworldBiomes(CallbackInfo ci) {
        if (System.getProperty("fabric-api.datagen") != null) {
            return;
        }
        // Replace selected temperate forest slots with custom biomes so they generate naturally.
        this.commonBiomes[1][2] = ModBiomes.MAPLE_FOREST;
        this.commonBiomes[2][2] = ModBiomes.BROADLEAF_FOREST;
    }
}
