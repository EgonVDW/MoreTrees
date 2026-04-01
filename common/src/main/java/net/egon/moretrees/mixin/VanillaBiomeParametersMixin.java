package net.egon.moretrees.mixin;

import net.egon.moretrees.world.ModBiomes;
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
public class VanillaBiomeParametersMixin {
    @Shadow
    @Final
    private ResourceKey<Biome>[][] MIDDLE_BIOMES;

    @Inject(method = "<init>", at = @At("TAIL"))
    private void moretrees$addOverworldBiomes(CallbackInfo ci) {
        if (System.getProperty("fabric-api.datagen") != null) {
            return;
        }

        this.MIDDLE_BIOMES[1][2] = ModBiomes.MAPLE_FOREST;
        this.MIDDLE_BIOMES[2][2] = ModBiomes.BROADLEAF_FOREST;
    }
}
