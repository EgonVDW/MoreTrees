package net.egon.moretrees.neoforge.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.minecraft.world.level.block.UntintedParticleLeavesBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.common.extensions.IBlockExtension;

public final class FlammableBlocks {
    private FlammableBlocks() {
    }

    private interface FlammableExtension extends IBlockExtension {
        int moreTrees$flammability();

        int moreTrees$fireSpreadSpeed();

        @Override
        default int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return moreTrees$flammability();
        }

        @Override
        default int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
            return moreTrees$fireSpreadSpeed();
        }
    }

    public static final class BasicBlock extends Block implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public BasicBlock(BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class RotatedPillar extends RotatedPillarBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public RotatedPillar(BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class Slab extends SlabBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public Slab(BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class Stair extends StairBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public Stair(BlockState baseState, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(baseState, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class Fence extends FenceBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public Fence(BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class FenceGate extends FenceGateBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public FenceGate(WoodType woodType, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(woodType, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class Door extends DoorBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public Door(BlockSetType type, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(type, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class TrapDoor extends TrapDoorBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public TrapDoor(BlockSetType type, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(type, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class Button extends ButtonBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public Button(BlockSetType type, int pressTicks, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(type, pressTicks, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class PressurePlate extends PressurePlateBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public PressurePlate(BlockSetType type, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(type, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class Leaves extends UntintedParticleLeavesBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public Leaves(float leafParticleChance, ParticleOptions leafParticle, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(leafParticleChance, leafParticle, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class Sapling extends SaplingBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public Sapling(TreeGrower treeGrower, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(treeGrower, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class StandingSign extends StandingSignBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public StandingSign(WoodType woodType, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(woodType, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class WallSign extends net.minecraft.world.level.block.WallSignBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public WallSign(WoodType woodType, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(woodType, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class CeilingHangingSign extends CeilingHangingSignBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public CeilingHangingSign(WoodType woodType, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(woodType, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }

    public static final class WallHangingSign extends net.minecraft.world.level.block.WallHangingSignBlock implements FlammableExtension {
        private final int flammability;
        private final int fireSpreadSpeed;

        public WallHangingSign(WoodType woodType, BlockBehaviour.Properties properties, int flammability, int fireSpreadSpeed) {
            super(woodType, properties);
            this.flammability = flammability;
            this.fireSpreadSpeed = fireSpreadSpeed;
        }

        @Override
        public int moreTrees$flammability() {
            return flammability;
        }

        @Override
        public int moreTrees$fireSpreadSpeed() {
            return fireSpreadSpeed;
        }
    }
}
