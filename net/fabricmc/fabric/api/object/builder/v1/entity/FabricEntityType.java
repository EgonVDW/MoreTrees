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

import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1309;
import net.minecraft.class_1311;
import net.minecraft.class_1317;
import net.minecraft.class_2902;
import net.minecraft.class_5132;
import net.minecraft.class_9168;

/**
 * General-purpose Fabric-provided extensions for {@link class_1299}.
 */
public interface FabricEntityType {
	/**
	 * General-purpose Fabric-provided extensions for {@link class_1299.class_1300}.
	 *
	 * <p>Note: This interface is automatically implemented on {@link class_1299.class_1300} via Mixin and interface injection.
	 */
	interface Builder<T extends class_1297> {
		/**
		 * Sets whether the entity's velocity should always be updated.
		 *
		 * @param alwaysUpdateVelocity whether the entity's velocity should always be updated
		 * @return this builder
		 */
		default class_1299.class_1300<T> alwaysUpdateVelocity(boolean alwaysUpdateVelocity) {
			throw new AssertionError("Implemented in Mixin");
		}

		/**
		 * Sets whether the entity is able to execute commands.
		 *
		 * @param canPotentiallyExecuteCommands whether the entity is able to execute commands
		 * @return this builder
		 */
		default class_1299.class_1300<T> canPotentiallyExecuteCommands(boolean canPotentiallyExecuteCommands) {
			throw new AssertionError("Implemented in Mixin");
		}

		/**
		 * Creates an entity type builder for a living entity.
		 *
		 * <p>This entity's spawn group will automatically be set to {@link class_1311#field_17715}.
		 *
		 * @param <T> the type of entity
		 * @param livingBuilder a function to configure living entity specific properties
		 *
		 * @return a new living entity type builder
		 */
		static <T extends class_1309> class_1299.class_1300<T> createLiving(class_1299.class_4049<T> factory, class_1311 spawnGroup, UnaryOperator<Living<T>> livingBuilder) {
			return FabricEntityTypeImpl.Builder.createLiving(factory, spawnGroup, livingBuilder);
		}

		/**
		 * Creates an entity type builder for a mob entity.
		 *
		 * @param <T> the type of entity
		 * @param mobBuilder a function to configure mob entity specific properties
		 *
		 * @return a new mob entity type builder
		 */
		static <T extends net.minecraft.class_1308> class_1299.class_1300<T> createMob(class_1299.class_4049<T> factory, class_1311 spawnGroup, UnaryOperator<Mob<T>> mobBuilder) {
			return FabricEntityTypeImpl.Builder.createMob(factory, spawnGroup, mobBuilder);
		}

		/**
		 * A builder for additional properties of a living entity, use via {@link #createLiving(class_1299.class_4049, class_1311, UnaryOperator)}.
		 * @param <T> the type of living entity
		 */
		interface Living<T extends class_1309> {
			/**
			 * Sets the default attributes for a type of living entity.
			 *
			 * @param defaultAttributeBuilder a function to generate the default attribute builder from the entity type
			 * @return this builder for chaining
			 */
			Living<T> defaultAttributes(Supplier<class_5132.class_5133> defaultAttributeBuilder);
		}

		/**
		 * A builder for additional properties of a mob entity, use via {@link #createMob(class_1299.class_4049, class_1311, UnaryOperator)}.
		 * @param <T> the type of mob entity
		 */
		interface Mob<T extends net.minecraft.class_1308> extends Living<T> {
			/**
			 * Registers a spawn restriction for this entity.
			 *
			 * <p>This is used by mobs to determine whether Minecraft should spawn an entity within a certain context.
			 *
			 * @return this builder for chaining.
			 */
			Mob<T> spawnRestriction(class_9168 location, class_2902.class_2903 heightmap, class_1317.class_4306<T> spawnPredicate);

			/**
			 * Sets the default attributes for a type of mob entity.
			 *
			 * @param defaultAttributeBuilder a function to generate the default attribute builder from the entity type
			 * @return this builder for chaining
			 */
			@Override
			Mob<T> defaultAttributes(Supplier<class_5132.class_5133> defaultAttributeBuilder);
		}
	}
}
