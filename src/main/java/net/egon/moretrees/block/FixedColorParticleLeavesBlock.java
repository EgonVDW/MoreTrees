package net.egon.moretrees.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.particle.TintedParticleEffect;
import net.minecraft.util.dynamic.Codecs;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class FixedColorParticleLeavesBlock extends LeavesBlock {
    public static final MapCodec<FixedColorParticleLeavesBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                            Codecs.rangedInclusiveFloat(0.0F, 1.0F)
                                    .fieldOf("leaf_particle_chance")
                                    .forGetter(block -> block.leafParticleChance),
                            Codecs.RGB.fieldOf("leaf_particle_color")
                                    .forGetter(block -> block.leafParticleColor),
                            createSettingsCodec()
                    )
                    .apply(instance, FixedColorParticleLeavesBlock::new)
    );

    private final int leafParticleColor;

    public FixedColorParticleLeavesBlock(float leafParticleChance, int leafParticleColor, AbstractBlock.Settings settings) {
        super(leafParticleChance, settings);
        this.leafParticleColor = leafParticleColor;
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        ParticleUtil.spawnParticle(
                world,
                pos,
                random,
                TintedParticleEffect.create(ParticleTypes.TINTED_LEAVES, this.leafParticleColor)
        );
    }

    @Override
    public MapCodec<? extends FixedColorParticleLeavesBlock> getCodec() {
        return CODEC;
    }
}
