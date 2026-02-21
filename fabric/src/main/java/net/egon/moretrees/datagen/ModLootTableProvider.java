package net.egon.moretrees.datagen;

import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.CHESTNUT_LOG);
        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.BEECH_LOG);

        addDrop(ModBlocks.STRIPPED_CHESTNUT_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_BEECH_LOG);

        addDrop(ModBlocks.CHESTNUT_WOOD);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.BEECH_WOOD);

        addDrop(ModBlocks.STRIPPED_CHESTNUT_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_BEECH_WOOD);

        addDrop(ModBlocks.CHESTNUT_PLANKS);
        addDrop(ModBlocks.MAPLE_PLANKS);
        addDrop(ModBlocks.MAPLE_SAP_COLLECTOR);
        addDrop(ModBlocks.BEECH_PLANKS);

        addDrop(ModBlocks.CHESTNUT_SLAB, slabDrops(ModBlocks.CHESTNUT_SLAB));
        addDrop(ModBlocks.MAPLE_SLAB, slabDrops(ModBlocks.MAPLE_SLAB));
        addDrop(ModBlocks.BEECH_SLAB, slabDrops(ModBlocks.BEECH_SLAB));

        addDrop(ModBlocks.CHESTNUT_STAIRS);
        addDrop(ModBlocks.MAPLE_STAIRS);
        addDrop(ModBlocks.BEECH_STAIRS);

        addDrop(ModBlocks.CHESTNUT_FENCE);
        addDrop(ModBlocks.MAPLE_FENCE);
        addDrop(ModBlocks.BEECH_FENCE);

        addDrop(ModBlocks.CHESTNUT_FENCE_GATE);
        addDrop(ModBlocks.MAPLE_FENCE_GATE);
        addDrop(ModBlocks.BEECH_FENCE_GATE);

        addDrop(ModBlocks.CHESTNUT_DOOR, doorDrops(ModBlocks.CHESTNUT_DOOR));
        addDrop(ModBlocks.MAPLE_DOOR, doorDrops(ModBlocks.MAPLE_DOOR));
        addDrop(ModBlocks.BEECH_DOOR, doorDrops(ModBlocks.BEECH_DOOR));

        addDrop(ModBlocks.CHESTNUT_TRAPDOOR);
        addDrop(ModBlocks.MAPLE_TRAPDOOR);
        addDrop(ModBlocks.BEECH_TRAPDOOR);

        addDrop(ModBlocks.CHESTNUT_BUTTON);
        addDrop(ModBlocks.MAPLE_BUTTON);
        addDrop(ModBlocks.BEECH_BUTTON);

        addDrop(ModBlocks.CHESTNUT_PRESSURE_PLATE);
        addDrop(ModBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.BEECH_PRESSURE_PLATE);

        addDrop(ModBlocks.CHESTNUT_SIGN, drops(ModItems.CHESTNUT_SIGN));
        addDrop(ModBlocks.MAPLE_SIGN, drops(ModItems.MAPLE_SIGN));
        addDrop(ModBlocks.BEECH_SIGN, drops(ModItems.BEECH_SIGN));

        addDrop(ModBlocks.CHESTNUT_HANGING_SIGN, drops(ModItems.CHESTNUT_HANGING_SIGN));
        addDrop(ModBlocks.MAPLE_HANGING_SIGN, drops(ModItems.MAPLE_HANGING_SIGN));
        addDrop(ModBlocks.BEECH_HANGING_SIGN, drops(ModItems.BEECH_HANGING_SIGN));

        addDrop(ModBlocks.CHESTNUT_SAPLING);
        addDrop(ModBlocks.MAPLE_SAPLING);
        addDrop(ModBlocks.BEECH_SAPLING);

        addDrop(ModBlocks.CHESTNUT_LEAVES, chestnutLeavesDrops(ModBlocks.CHESTNUT_LEAVES, ModBlocks.CHESTNUT_SAPLING));
        addDrop(ModBlocks.MAPLE_LEAVES, leavesDrops(ModBlocks.MAPLE_LEAVES, ModBlocks.MAPLE_SAPLING, 0.0625f));
        addDrop(ModBlocks.BEECH_LEAVES, leavesDrops(ModBlocks.BEECH_LEAVES, ModBlocks.BEECH_SAPLING, 0.0625f));
    }

    private LootTable.Builder chestnutLeavesDrops(net.minecraft.block.Block leaves, net.minecraft.block.Block sapling) {
        var fortuneEnchantment = registries.getOrThrow(RegistryKeys.ENCHANTMENT).getOrThrow(Enchantments.FORTUNE);

        return leavesDrops(leaves, sapling, 0.0625f).pool(
                LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1.0f))
                        .conditionally(createWithoutShearsOrSilkTouchCondition())
                        .with(addSurvivesExplosionCondition(ModItems.CHESTNUT,
                                ItemEntry.builder(ModItems.CHESTNUT).conditionally(
                                        TableBonusLootCondition.builder(
                                                fortuneEnchantment,
                                                0.0075f,
                                                0.008333334f,
                                                0.009375f,
                                                0.0125f,
                                                0.0375f
                                        )
                                )))
        );
    }
}
