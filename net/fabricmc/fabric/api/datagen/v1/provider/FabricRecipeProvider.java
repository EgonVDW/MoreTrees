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

package net.fabricmc.fabric.api.datagen.v1.provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import org.jspecify.annotations.Nullable;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.minecraft.class_161;
import net.minecraft.class_1860;
import net.minecraft.class_2405;
import net.minecraft.class_2446;
import net.minecraft.class_2447;
import net.minecraft.class_2450;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_5797;
import net.minecraft.class_6903;
import net.minecraft.class_7225;
import net.minecraft.class_7403;
import net.minecraft.class_7784;
import net.minecraft.class_7924;
import net.minecraft.class_8779;
import net.minecraft.class_8790;

/**
 * Extend this class and implement {@link FabricRecipeProvider#method_62766(class_7225.class_7874, class_8790)}.
 *
 * <p>Register an instance of the class with {@link FabricDataGenerator.Pack#addProvider} in a {@link net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint}.
 */
public abstract class FabricRecipeProvider extends class_2446.class_10114 {
	protected final FabricDataOutput output;
	private final CompletableFuture<class_7225.class_7874> registriesFuture;

	public FabricRecipeProvider(FabricDataOutput output, CompletableFuture<class_7225.class_7874> registriesFuture) {
		super(output, registriesFuture);
		this.output = output;
		this.registriesFuture = registriesFuture;
	}

	/**
	 * Implement this method and then use the range of methods in {@link class_2446} or from one of the recipe json factories such as {@link class_2447} or {@link class_2450}.
	 */
	@Override
	protected abstract class_2446 method_62766(class_7225.class_7874 registryLookup, class_8790 exporter);

	/**
	 * Return a new exporter that applies the specified conditions to any recipe json provider it receives.
	 */
	protected class_8790 withConditions(class_8790 exporter, ResourceCondition... conditions) {
		Preconditions.checkArgument(conditions.length > 0, "Must add at least one condition.");
		return new class_8790() {
			@Override
			public void method_53819(class_5321<class_1860<?>> key, class_1860<?> recipe, @Nullable class_8779 advancementEntry) {
				FabricDataGenHelper.addConditions(recipe, conditions);
				exporter.method_53819(key, recipe, advancementEntry);
			}

			@Override
			public class_161.class_162 method_53818() {
				return exporter.method_53818();
			}

			@Override
			public void method_62738() {
			}

			@Override
			public class_2960 getRecipeIdentifier(class_2960 recipeId) {
				return exporter.getRecipeIdentifier(recipeId);
			}
		};
	}

	@Override
	public CompletableFuture<?> method_10319(class_7403 writer) {
		return registriesFuture.thenCompose((wrapperLookup -> {
			Set<class_2960> generatedRecipes = Sets.newHashSet();
			List<CompletableFuture<?>> list = new ArrayList<>();
			class_2446 recipeGenerator = method_62766(wrapperLookup, new class_8790() {
				@Override
				public void method_53819(class_5321<class_1860<?>> recipeKey, class_1860<?> recipe, @Nullable class_8779 advancement) {
					class_2960 identifier = recipeKey.method_29177();

					if (!generatedRecipes.add(identifier)) {
						throw new IllegalStateException("Duplicate recipe " + identifier);
					}

					class_6903<JsonElement> registryOps = wrapperLookup.method_57093(JsonOps.INSTANCE);
					JsonObject recipeJson = class_1860.field_47319.encodeStart(registryOps, recipe).getOrThrow(IllegalStateException::new).getAsJsonObject();
					ResourceCondition[] conditions = FabricDataGenHelper.consumeConditions(recipe);
					FabricDataGenHelper.addConditions(recipeJson, conditions);

					final class_7784.class_7489 recipesPathResolver = output.method_60917(class_7924.field_52178);
					final class_7784.class_7489 advancementsPathResolver = output.method_60917(class_7924.field_52177);

					list.add(class_2405.method_10320(writer, recipeJson, recipesPathResolver.method_44107(identifier)));

					if (advancement != null) {
						JsonObject advancementJson = class_161.field_47179.encodeStart(registryOps, advancement.comp_1920()).getOrThrow(IllegalStateException::new).getAsJsonObject();
						FabricDataGenHelper.addConditions(advancementJson, conditions);
						list.add(class_2405.method_10320(writer, advancementJson, advancementsPathResolver.method_44107(advancement.comp_1919())));
					}
				}

				@Override
				public class_161.class_162 method_53818() {
					//noinspection removal
					return class_161.class_162.method_51698().method_708(class_5797.field_39377);
				}

				@Override
				public void method_62738() {
				}

				@Override
				public class_2960 getRecipeIdentifier(class_2960 recipeId) {
					return FabricRecipeProvider.this.getRecipeIdentifier(recipeId);
				}
			});
			recipeGenerator.method_10419();
			return CompletableFuture.allOf(list.toArray(CompletableFuture[]::new));
		}));
	}

	/**
	 * Override this method to change the recipe identifier. The default implementation normalizes the namespace to the mod ID.
	 */
	protected class_2960 getRecipeIdentifier(class_2960 identifier) {
		return class_2960.method_60655(output.getModId(), identifier.method_12832());
	}
}
