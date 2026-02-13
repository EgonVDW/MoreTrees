/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.api.object.builder.v1.entity;

import java.util.Objects;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1311;
import net.minecraft.class_1317;
import net.minecraft.class_1937;
import net.minecraft.class_2248;
import net.minecraft.class_2902;
import net.minecraft.class_4048;
import net.minecraft.class_5132;
import net.minecraft.class_5321;
import net.minecraft.class_7696;
import net.minecraft.class_9168;
import com.google.common.collect.ImmutableSet;
import org.jspecify.annotations.Nullable;

/**
 * @deprecated replace with {@link class_1299.class_1300}
 */
@Deprecated
public class FabricEntityTypeBuilder<T extends class_1297> {
	private class_1311 spawnGroup;
	private class_1299.class_4049<T> factory;
	private boolean saveable = true;
	private boolean summonable = true;
	private int trackRange = 5;
	private int trackedUpdateRate = 3;
	private Boolean forceTrackedVelocityUpdates;
	private boolean fireImmune = false;
	private boolean spawnableFarFromPlayer;
	private class_4048 dimensions = class_4048.method_18384(-1.0f, -1.0f);
	private ImmutableSet<class_2248> specificSpawnBlocks = ImmutableSet.of();

	@Nullable
	private class_7696[] requiredFeatures = null;

	protected FabricEntityTypeBuilder(class_1311 spawnGroup, class_1299.class_4049<T> factory) {
		this.spawnGroup = spawnGroup;
		this.factory = factory;
		this.spawnableFarFromPlayer = spawnGroup == class_1311.field_6294 || spawnGroup == class_1311.field_17715;
	}

	/**
	 * Creates an entity type builder.
	 *
	 * <p>This entity's spawn group will automatically be set to {@link class_1311#field_17715}.
	 *
	 * @param <T> the type of entity
	 *
	 * @return a new entity type builder
	 * @deprecated use {@link class_1299.class_1300#method_5902(class_1311)}
	 */
	@Deprecated
	public static <T extends class_1297> FabricEntityTypeBuilder<T> create() {
		return create(class_1311.field_17715);
	}

	/**
	 * Creates an entity type builder.
	 *
	 * @param spawnGroup the entity spawn group
	 * @param <T> the type of entity
	 *
	 * @return a new entity type builder
	 * @deprecated use {@link class_1299.class_1300#method_5902(class_1311)}
	 */
	@Deprecated
	public static <T extends class_1297> FabricEntityTypeBuilder<T> create(class_1311 spawnGroup) {
		return create(spawnGroup, FabricEntityTypeBuilder::emptyFactory);
	}

	/**
	 * Creates an entity type builder.
	 *
	 * @param spawnGroup the entity spawn group
	 * @param factory the entity factory used to create this entity
	 * @param <T> the type of entity
	 *
	 * @return a new entity type builder
	 * @deprecated use {@link class_1299.class_1300#method_5903(class_1299.class_4049, class_1311)}
	 */
	@Deprecated
	public static <T extends class_1297> FabricEntityTypeBuilder<T> create(class_1311 spawnGroup, class_1299.class_4049<T> factory) {
		return new FabricEntityTypeBuilder<>(spawnGroup, factory);
	}

	/**
	 * Creates an entity type builder for a living entity.
	 *
	 * <p>This entity's spawn group will automatically be set to {@link class_1311#field_17715}.
	 *
	 * @param <T> the type of entity
	 *
	 * @return a new living entity type builder
	 * @deprecated use {@link FabricEntityType.Builder#createLiving(class_1299.class_4049, class_1311, UnaryOperator)}
	 */
	@Deprecated
	public static <T extends class_1309> FabricEntityTypeBuilder.Living<T> createLiving() {
		return new FabricEntityTypeBuilder.Living<>(class_1311.field_17715, FabricEntityTypeBuilder::emptyFactory);
	}

	/**
	 * Creates an entity type builder for a mob entity.
	 *
	 * @param <T> the type of entity
	 *
	 * @return a new mob entity type builder
	 * @deprecated use {@link FabricEntityType.Builder#createMob(class_1299.class_4049, class_1311, UnaryOperator)}
	 */
	public static <T extends net.minecraft.class_1308> FabricEntityTypeBuilder.Mob<T> createMob() {
		return new FabricEntityTypeBuilder.Mob<>(class_1311.field_17715, FabricEntityTypeBuilder::emptyFactory);
	}

	private static <T extends class_1297> T emptyFactory(class_1299<T> type, class_1937 world) {
		return null;
	}

	@Deprecated
	public FabricEntityTypeBuilder<T> spawnGroup(class_1311 group) {
		Objects.requireNonNull(group, "Spawn group cannot be null");
		this.spawnGroup = group;
		return this;
	}

	@Deprecated
	public <N extends T> FabricEntityTypeBuilder<N> entityFactory(class_1299.class_4049<N> factory) {
		Objects.requireNonNull(factory, "Entity Factory cannot be null");
		this.factory = (class_1299.class_4049<T>) factory;
		return (FabricEntityTypeBuilder<N>) this;
	}

	/**
	 * Whether this entity type is summonable using the {@code /summon} command.
	 *
	 * @return this builder for chaining
	 * @deprecated use {@link class_1299.class_1300#method_5901()}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> disableSummon() {
		this.summonable = false;
		return this;
	}

	/**
	 * @deprecated use {@link class_1299.class_1300#method_5904()}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> disableSaving() {
		this.saveable = false;
		return this;
	}

	/**
	 * Sets this entity type to be fire immune.
	 *
	 * @return this builder for chaining
	 * @deprecated use {@link class_1299.class_1300#method_19947()}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> fireImmune() {
		this.fireImmune = true;
		return this;
	}

	/**
	 * Sets whether this entity type can be spawned far away from a player.
	 *
	 * @return this builder for chaining
	 * @deprecated use {@link class_1299.class_1300#method_20815()}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> spawnableFarFromPlayer() {
		this.spawnableFarFromPlayer = true;
		return this;
	}

	/**
	 * Sets the dimensions of this entity type.
	 *
	 * @param dimensions the dimensions representing the entity's size
	 *
	 * @return this builder for chaining
	 * @deprecated use {@link class_1299.class_1300#method_17687(float, float)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> dimensions(class_4048 dimensions) {
		Objects.requireNonNull(dimensions, "Cannot set null dimensions");
		this.dimensions = dimensions;
		return this;
	}

	/**
	 * @deprecated use {@link FabricEntityTypeBuilder#trackRangeBlocks(int)}, {@link FabricEntityTypeBuilder#trackedUpdateRate(int)} and {@link FabricEntityTypeBuilder#forceTrackedVelocityUpdates(boolean)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> trackable(int trackRangeBlocks, int trackedUpdateRate) {
		return trackable(trackRangeBlocks, trackedUpdateRate, true);
	}

	/**
	 * @deprecated use {@link FabricEntityTypeBuilder#trackRangeBlocks(int)}, {@link FabricEntityTypeBuilder#trackedUpdateRate(int)} and {@link FabricEntityTypeBuilder#forceTrackedVelocityUpdates(boolean)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> trackable(int trackRangeBlocks, int trackedUpdateRate, boolean forceTrackedVelocityUpdates) {
		this.trackRangeBlocks(trackRangeBlocks);
		this.trackedUpdateRate(trackedUpdateRate);
		this.forceTrackedVelocityUpdates(forceTrackedVelocityUpdates);
		return this;
	}

	/**
	 * Sets the maximum chunk tracking range of this entity type.
	 *
	 * @param range the tracking range in chunks
	 *
	 * @return this builder for chaining
	 * @deprecated use {@link FabricEntityTypeBuilder#trackRangeBlocks(int)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> trackRangeChunks(int range) {
		this.trackRange = range;
		return this;
	}

	/**
	 * Sets the maximum block range at which players can see this entity type.
	 *
	 * @param range the tracking range in blocks
	 *
	 * @return this builder for chaining
	 * @deprecated use {@link FabricEntityTypeBuilder#trackRangeChunks(int)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> trackRangeBlocks(int range) {
		return trackRangeChunks((range + 15) / 16);
	}

	/**
	 * @deprecated use {@link FabricEntityTypeBuilder#trackRangeBlocks(int)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> trackedUpdateRate(int rate) {
		this.trackedUpdateRate = rate;
		return this;
	}

	/**
	 * @deprecated use {@link FabricEntityTypeBuilder#trackRangeBlocks(int)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> forceTrackedVelocityUpdates(boolean forceTrackedVelocityUpdates) {
		this.forceTrackedVelocityUpdates = forceTrackedVelocityUpdates;
		return this;
	}

	/**
	 * Sets the {@link ImmutableSet} of blocks this entity can spawn on.
	 *
	 * @param blocks the blocks the entity can spawn on
	 * @return this builder for chaining
	 * @deprecated use {@link class_1299.class_1300#method_29497(class_2248...)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> specificSpawnBlocks(class_2248... blocks) {
		this.specificSpawnBlocks = ImmutableSet.copyOf(blocks);
		return this;
	}

	/**
	 * Sets the features this entity requires. If a feature is not enabled,
	 * the entity cannot be spawned, and existing ones will despawn immediately.
	 * @param requiredFeatures the features
	 * @return this builder for chaining
	 * @deprecated use {@link class_1299.class_1300#method_45323(class_7696...)}
	 */
	@Deprecated
	public FabricEntityTypeBuilder<T> requires(class_7696... requiredFeatures) {
		this.requiredFeatures = requiredFeatures;
		return this;
	}

	/**
	 * Creates the entity type.
	 *
	 * @return a new {@link class_1299}
	 * @deprecated use {@link class_1299.class_1300#method_5905(net.minecraft.class_5321)}
	 */
	@Deprecated
	public class_1299<T> build(class_5321<class_1299<?>> key) {
		class_1299.class_1300<T> builder = class_1299.class_1300.method_5903(this.factory, this.spawnGroup)
				.method_29497(specificSpawnBlocks.toArray(class_2248[]::new))
				.method_27299(this.trackRange)
				.method_27300(this.trackedUpdateRate)
				.method_17687(this.dimensions.comp_2185(), this.dimensions.comp_2186());

		if (!this.saveable) {
			builder = builder.method_5904();
		}

		if (!this.summonable) {
			builder = builder.method_5901();
		}

		if (this.fireImmune) {
			builder = builder.method_19947();
		}

		if (this.spawnableFarFromPlayer) {
			builder = builder.method_20815();
		}

		if (this.requiredFeatures != null) {
			builder = builder.method_45323(this.requiredFeatures);
		}

		if (this.forceTrackedVelocityUpdates != null) {
			builder = builder.alwaysUpdateVelocity(this.forceTrackedVelocityUpdates);
		}

		return builder.method_5905(key);
	}

	/**
	 * An extended version of {@link FabricEntityTypeBuilder} with support for features on present on {@link class_1309 living entities}, such as default attributes.
	 *
	 * @param <T> Entity class.
	 * @deprecated use {@link class_1299.class_1300#createLiving(EntityType.EntityFactory, MobCategory, UnaryOperator)}
	 */
	@Deprecated
	public static class Living<T extends class_1309> extends FabricEntityTypeBuilder<T> {
		@Nullable
		private Supplier<class_5132.class_5133> defaultAttributeBuilder;

		protected Living(class_1311 spawnGroup, class_1299.class_4049<T> function) {
			super(spawnGroup, function);
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> spawnGroup(class_1311 group) {
			super.spawnGroup(group);
			return this;
		}

		@Override
		public <N extends T> FabricEntityTypeBuilder.Living<N> entityFactory(class_1299.class_4049<N> factory) {
			super.entityFactory(factory);
			return (Living<N>) this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> disableSummon() {
			super.disableSummon();
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> disableSaving() {
			super.disableSaving();
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> fireImmune() {
			super.fireImmune();
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> spawnableFarFromPlayer() {
			super.spawnableFarFromPlayer();
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> dimensions(class_4048 dimensions) {
			super.dimensions(dimensions);
			return this;
		}

		/**
		 * @deprecated use {@link FabricEntityTypeBuilder.Living#trackRangeBlocks(int)}, {@link FabricEntityTypeBuilder.Living#trackedUpdateRate(int)} and {@link FabricEntityTypeBuilder.Living#forceTrackedVelocityUpdates(boolean)}
		 */
		@Override
		@Deprecated
		public FabricEntityTypeBuilder.Living<T> trackable(int trackRangeBlocks, int trackedUpdateRate) {
			super.trackable(trackRangeBlocks, trackedUpdateRate);
			return this;
		}

		/**
		 * @deprecated use {@link FabricEntityTypeBuilder.Living#trackRangeBlocks(int)}, {@link FabricEntityTypeBuilder.Living#trackedUpdateRate(int)} and {@link FabricEntityTypeBuilder.Living#forceTrackedVelocityUpdates(boolean)}
		 */
		@Override
		@Deprecated
		public FabricEntityTypeBuilder.Living<T> trackable(int trackRangeBlocks, int trackedUpdateRate, boolean forceTrackedVelocityUpdates) {
			super.trackable(trackRangeBlocks, trackedUpdateRate, forceTrackedVelocityUpdates);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> trackRangeChunks(int range) {
			super.trackRangeChunks(range);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> trackRangeBlocks(int range) {
			super.trackRangeBlocks(range);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> trackedUpdateRate(int rate) {
			super.trackedUpdateRate(rate);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> forceTrackedVelocityUpdates(boolean forceTrackedVelocityUpdates) {
			super.forceTrackedVelocityUpdates(forceTrackedVelocityUpdates);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Living<T> specificSpawnBlocks(class_2248... blocks) {
			super.specificSpawnBlocks(blocks);
			return this;
		}

		/**
		 * Sets the default attributes for a type of living entity.
		 *
		 * <p>This can be used in a fashion similar to this:
		 * <blockquote><pre>
		 * FabricEntityTypeBuilder.createLiving()
		 * 	.spawnGroup(SpawnGroup.CREATURE)
		 * 	.entityFactory(MyCreature::new)
		 * 	.defaultAttributes(LivingEntity::createLivingAttributes)
		 * 	...
		 * 	.build();
		 * </pre></blockquote>
		 *
		 * @param defaultAttributeBuilder a function to generate the default attribute builder from the entity type
		 * @return this builder for chaining
		 * @deprecated use {@link FabricEntityType.Builder.Living#defaultAttributes(Supplier)}
		 */
		@Deprecated
		public FabricEntityTypeBuilder.Living<T> defaultAttributes(Supplier<class_5132.class_5133> defaultAttributeBuilder) {
			Objects.requireNonNull(defaultAttributeBuilder, "Cannot set null attribute builder");
			this.defaultAttributeBuilder = defaultAttributeBuilder;
			return this;
		}

		@Deprecated
		@Override
		public class_1299<T> build(class_5321<class_1299<?>> key) {
			final class_1299<T> type = super.build(key);

			if (this.defaultAttributeBuilder != null) {
				FabricDefaultAttributeRegistry.register(type, this.defaultAttributeBuilder.get());
			}

			return type;
		}
	}

	/**
	 * An extended version of {@link FabricEntityTypeBuilder} with support for features on present on {@link Mob mob entities}, such as spawn restrictions.
	 *
	 * @param <T> Entity class.
	 */
	@Deprecated
	public static class Mob<T extends net.minecraft.class_1308> extends FabricEntityTypeBuilder.Living<T> {
		private class_9168 spawnLocation;
		private class_2902.class_2903 restrictionHeightmap;
		private class_1317.class_4306<T> spawnPredicate;

		protected Mob(class_1311 spawnGroup, class_1299.class_4049<T> function) {
			super(spawnGroup, function);
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> spawnGroup(class_1311 group) {
			super.spawnGroup(group);
			return this;
		}

		@Override
		public <N extends T> FabricEntityTypeBuilder.Mob<N> entityFactory(class_1299.class_4049<N> factory) {
			super.entityFactory(factory);
			return (Mob<N>) this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> disableSummon() {
			super.disableSummon();
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> disableSaving() {
			super.disableSaving();
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> fireImmune() {
			super.fireImmune();
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> spawnableFarFromPlayer() {
			super.spawnableFarFromPlayer();
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> dimensions(class_4048 dimensions) {
			super.dimensions(dimensions);
			return this;
		}

		/**
		 * @deprecated use {@link FabricEntityTypeBuilder.Mob#trackRangeBlocks(int)}, {@link FabricEntityTypeBuilder.Mob#trackedUpdateRate(int)} and {@link FabricEntityTypeBuilder.Mob#forceTrackedVelocityUpdates(boolean)}
		 */
		@Override
		@Deprecated
		public FabricEntityTypeBuilder.Mob<T> trackable(int trackRangeBlocks, int trackedUpdateRate) {
			super.trackable(trackRangeBlocks, trackedUpdateRate);
			return this;
		}

		/**
		 * @deprecated use {@link FabricEntityTypeBuilder.Mob#trackRangeBlocks(int)}, {@link FabricEntityTypeBuilder.Mob#trackedUpdateRate(int)} and {@link FabricEntityTypeBuilder.Mob#forceTrackedVelocityUpdates(boolean)}
		 */
		@Override
		@Deprecated
		public FabricEntityTypeBuilder.Mob<T> trackable(int trackRangeBlocks, int trackedUpdateRate, boolean forceTrackedVelocityUpdates) {
			super.trackable(trackRangeBlocks, trackedUpdateRate, forceTrackedVelocityUpdates);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> trackRangeChunks(int range) {
			super.trackRangeChunks(range);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> trackRangeBlocks(int range) {
			super.trackRangeBlocks(range);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> trackedUpdateRate(int rate) {
			super.trackedUpdateRate(rate);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> forceTrackedVelocityUpdates(boolean forceTrackedVelocityUpdates) {
			super.forceTrackedVelocityUpdates(forceTrackedVelocityUpdates);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> specificSpawnBlocks(class_2248... blocks) {
			super.specificSpawnBlocks(blocks);
			return this;
		}

		@Override
		public FabricEntityTypeBuilder.Mob<T> defaultAttributes(Supplier<class_5132.class_5133> defaultAttributeBuilder) {
			super.defaultAttributes(defaultAttributeBuilder);
			return this;
		}

		/**
		 * Registers a spawn restriction for this entity.
		 *
		 * <p>This is used by mobs to determine whether Minecraft should spawn an entity within a certain context.
		 *
		 * @return this builder for chaining.
		 * @deprecated use {@link FabricEntityType.Builder.Mob#spawnRestriction(class_9168, class_2902.class_2903, class_1317.class_4306)}
		 */
		@Deprecated
		public FabricEntityTypeBuilder.Mob<T> spawnRestriction(class_9168 spawnLocation, class_2902.class_2903 heightmap, class_1317.class_4306<T> spawnPredicate) {
			this.spawnLocation = Objects.requireNonNull(spawnLocation, "Spawn location cannot be null.");
			this.restrictionHeightmap = Objects.requireNonNull(heightmap, "Heightmap type cannot be null.");
			this.spawnPredicate = Objects.requireNonNull(spawnPredicate, "Spawn predicate cannot be null.");
			return this;
		}

		@Override
		public class_1299<T> build(class_5321<class_1299<?>> key) {
			class_1299<T> type = super.build(key);

			if (this.spawnPredicate != null) {
				class_1317.method_20637(type, this.spawnLocation, this.restrictionHeightmap, this.spawnPredicate);
			}

			return type;
		}
	}
}
