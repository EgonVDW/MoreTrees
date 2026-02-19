package net.egon.moretrees.datagen;

import net.egon.moretrees.block.ModBlockFamilies;
import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.item.ModItems;
import net.egon.moretrees.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.resource.featuretoggle.FeatureFlags;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                offerPlanksRecipe(ModBlocks.CHESTNUT_PLANKS, ModTags.Items.CHESTNUT_LOGS, 4);
                offerPlanksRecipe(ModBlocks.MAPLE_PLANKS, ModTags.Items.MAPLE_LOGS, 4);
                offerPlanksRecipe(ModBlocks.BEECH_PLANKS, ModTags.Items.BEECH_LOGS, 4);

                offerBarkBlockRecipe(ModBlocks.CHESTNUT_WOOD, ModBlocks.CHESTNUT_LOG);
                offerBarkBlockRecipe(ModBlocks.MAPLE_WOOD, ModBlocks.MAPLE_LOG);
                offerBarkBlockRecipe(ModBlocks.BEECH_WOOD, ModBlocks.BEECH_LOG);

                offerBarkBlockRecipe(ModBlocks.STRIPPED_CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_LOG);
                offerBarkBlockRecipe(ModBlocks.STRIPPED_MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG);
                offerBarkBlockRecipe(ModBlocks.STRIPPED_BEECH_WOOD, ModBlocks.STRIPPED_BEECH_LOG);

                offerBoatRecipe(ModItems.CHESTNUT_BOAT, ModBlocks.CHESTNUT_PLANKS);
                offerChestBoatRecipe(ModItems.CHESTNUT_CHEST_BOAT, ModItems.CHESTNUT_BOAT);

                offerBoatRecipe(ModItems.MAPLE_BOAT, ModBlocks.MAPLE_PLANKS);
                offerChestBoatRecipe(ModItems.MAPLE_CHEST_BOAT, ModItems.MAPLE_BOAT);

                offerBoatRecipe(ModItems.BEECH_BOAT, ModBlocks.BEECH_PLANKS);
                offerChestBoatRecipe(ModItems.BEECH_CHEST_BOAT, ModItems.BEECH_BOAT);

                offerSmelting(
                        List.of(ModItems.CHESTNUT),
                        RecipeCategory.FOOD,
                        ModItems.ROASTED_CHESTNUT,
                        0.35f,
                        200,
                        "roasted_chestnut"
                );
                offerFoodCookingRecipe(
                        "roasted_chestnut",
                        RecipeSerializer.CAMPFIRE_COOKING,
                        CampfireCookingRecipe::new,
                        600,
                        ModItems.CHESTNUT,
                        ModItems.ROASTED_CHESTNUT,
                        0.35f
                );

                generateFamily(ModBlockFamilies.CHESTNUT_FAMILY, FeatureFlags.VANILLA_FEATURES);
                generateFamily(ModBlockFamilies.MAPLE_FAMILY, FeatureFlags.VANILLA_FEATURES);
                generateFamily(ModBlockFamilies.BEECH_FAMILY, FeatureFlags.VANILLA_FEATURES);
            }
        };
    }

    @Override
    public String getName() {
        return "More Trees Recipes";
    }
}
