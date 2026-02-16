package net.egon.moretrees.item;

import net.egon.moretrees.MoreTreesCommon;
import net.egon.moretrees.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup MORE_TREES_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(MoreTreesCommon.MOD_ID, "moretrees_item_group"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.CHESTNUT_SAPLING))
                    .displayName(Text.translatable("itemgroup.moretrees_item_group"))
                    .entries((context, entries) -> {
                        entries.add(ModBlocks.CHESTNUT_LOG);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
                        entries.add(ModBlocks.CHESTNUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);
                        entries.add(ModBlocks.CHESTNUT_PLANKS);
                        entries.add(ModItems.CHESTNUT_SIGN);
                        entries.add(ModItems.CHESTNUT_HANGING_SIGN);
                        entries.add(ModBlocks.CHESTNUT_SLAB);
                        entries.add(ModBlocks.CHESTNUT_STAIRS);
                        entries.add(ModBlocks.CHESTNUT_FENCE);
                        entries.add(ModBlocks.CHESTNUT_FENCE_GATE);
                        entries.add(ModBlocks.CHESTNUT_DOOR);
                        entries.add(ModBlocks.CHESTNUT_TRAPDOOR);
                        entries.add(ModBlocks.CHESTNUT_BUTTON);
                        entries.add(ModBlocks.CHESTNUT_PRESSURE_PLATE);
                        entries.add(ModBlocks.CHESTNUT_LEAVES);
                        entries.add(ModBlocks.CHESTNUT_SAPLING);
                        entries.add(ModItems.CHESTNUT_BOAT);
                        entries.add(ModItems.CHESTNUT_CHEST_BOAT);

                        entries.add(ModBlocks.MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModItems.MAPLE_SIGN);
                        entries.add(ModItems.MAPLE_HANGING_SIGN);
                        entries.add(ModBlocks.MAPLE_SLAB);
                        entries.add(ModBlocks.MAPLE_STAIRS);
                        entries.add(ModBlocks.MAPLE_FENCE);
                        entries.add(ModBlocks.MAPLE_FENCE_GATE);
                        entries.add(ModBlocks.MAPLE_DOOR);
                        entries.add(ModBlocks.MAPLE_TRAPDOOR);
                        entries.add(ModBlocks.MAPLE_BUTTON);
                        entries.add(ModBlocks.MAPLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAPLE_LEAVES);
                        entries.add(ModBlocks.MAPLE_SAPLING);
                        entries.add(ModItems.MAPLE_BOAT);
                        entries.add(ModItems.MAPLE_CHEST_BOAT);

                        entries.add(ModBlocks.BEECH_LOG);
                        entries.add(ModBlocks.STRIPPED_BEECH_LOG);
                        entries.add(ModBlocks.BEECH_WOOD);
                        entries.add(ModBlocks.STRIPPED_BEECH_WOOD);
                        entries.add(ModBlocks.BEECH_PLANKS);
                        entries.add(ModItems.BEECH_SIGN);
                        entries.add(ModItems.BEECH_HANGING_SIGN);
                        entries.add(ModBlocks.BEECH_SLAB);
                        entries.add(ModBlocks.BEECH_STAIRS);
                        entries.add(ModBlocks.BEECH_FENCE);
                        entries.add(ModBlocks.BEECH_FENCE_GATE);
                        entries.add(ModBlocks.BEECH_DOOR);
                        entries.add(ModBlocks.BEECH_TRAPDOOR);
                        entries.add(ModBlocks.BEECH_BUTTON);
                        entries.add(ModBlocks.BEECH_PRESSURE_PLATE);
                        entries.add(ModBlocks.BEECH_LEAVES);
                        entries.add(ModBlocks.BEECH_SAPLING);
                        entries.add(ModItems.BEECH_BOAT);
                        entries.add(ModItems.BEECH_CHEST_BOAT);
                    })
                    .build());

    public static void registerItemGroups() {
        MoreTreesCommon.LOGGER.info("Registering ModItemGroups for " + MoreTreesCommon.MOD_ID);
    }
}
