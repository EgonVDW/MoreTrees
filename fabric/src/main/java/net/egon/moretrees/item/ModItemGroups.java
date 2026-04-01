package net.egon.moretrees.item;

import net.egon.moretrees.MoreTreesCommon;
import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.item.ModItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemGroups {
    public static final CreativeModeTab MORE_TREES_ITEM_GROUP = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, "moretrees_item_group"),
            CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("itemgroup.moretrees_item_group"))
                    .icon(() -> new ItemStack(ModBlocks.CHESTNUT_SAPLING))
                    .displayItems((parameters, output) -> {
                        output.accept(ModBlocks.CHESTNUT_LOG);
                        output.accept(ModBlocks.STRIPPED_CHESTNUT_LOG);
                        output.accept(ModBlocks.CHESTNUT_WOOD);
                        output.accept(ModBlocks.STRIPPED_CHESTNUT_WOOD);
                        output.accept(ModBlocks.CHESTNUT_PLANKS);
                        output.accept(ModItems.CHESTNUT_SIGN);
                        output.accept(ModItems.CHESTNUT_HANGING_SIGN);
                        output.accept(ModBlocks.CHESTNUT_SLAB);
                        output.accept(ModBlocks.CHESTNUT_STAIRS);
                        output.accept(ModBlocks.CHESTNUT_FENCE);
                        output.accept(ModBlocks.CHESTNUT_FENCE_GATE);
                        output.accept(ModBlocks.CHESTNUT_DOOR);
                        output.accept(ModBlocks.CHESTNUT_TRAPDOOR);
                        output.accept(ModBlocks.CHESTNUT_BUTTON);
                        output.accept(ModBlocks.CHESTNUT_PRESSURE_PLATE);
                        output.accept(ModBlocks.CHESTNUT_LEAVES);
                        output.accept(ModBlocks.CHESTNUT_SAPLING);
                        output.accept(ModItems.CHESTNUT);
                        output.accept(ModItems.ROASTED_CHESTNUT);
                        output.accept(ModItems.CHESTNUT_BOAT);
                        output.accept(ModItems.CHESTNUT_CHEST_BOAT);

                        output.accept(ModBlocks.MAPLE_LOG);
                        output.accept(ModBlocks.STRIPPED_MAPLE_LOG);
                        output.accept(ModBlocks.MAPLE_WOOD);
                        output.accept(ModBlocks.STRIPPED_MAPLE_WOOD);
                        output.accept(ModBlocks.MAPLE_PLANKS);
                        output.accept(ModBlocks.MAPLE_SAP_COLLECTOR);
                        output.accept(ModItems.MAPLE_SIGN);
                        output.accept(ModItems.MAPLE_HANGING_SIGN);
                        output.accept(ModBlocks.MAPLE_SLAB);
                        output.accept(ModBlocks.MAPLE_STAIRS);
                        output.accept(ModBlocks.MAPLE_FENCE);
                        output.accept(ModBlocks.MAPLE_FENCE_GATE);
                        output.accept(ModBlocks.MAPLE_DOOR);
                        output.accept(ModBlocks.MAPLE_TRAPDOOR);
                        output.accept(ModBlocks.MAPLE_BUTTON);
                        output.accept(ModBlocks.MAPLE_PRESSURE_PLATE);
                        output.accept(ModBlocks.MAPLE_LEAVES);
                        output.accept(ModBlocks.MAPLE_SAPLING);
                        output.accept(ModItems.MAPLE_SAP_BOTTLE);
                        output.accept(ModItems.MAPLE_SYRUP_BOTTLE);
                        output.accept(ModItems.MAPLE_BOAT);
                        output.accept(ModItems.MAPLE_CHEST_BOAT);

                        output.accept(ModBlocks.BEECH_LOG);
                        output.accept(ModBlocks.STRIPPED_BEECH_LOG);
                        output.accept(ModBlocks.BEECH_WOOD);
                        output.accept(ModBlocks.STRIPPED_BEECH_WOOD);
                        output.accept(ModBlocks.BEECH_PLANKS);
                        output.accept(ModItems.BEECH_SIGN);
                        output.accept(ModItems.BEECH_HANGING_SIGN);
                        output.accept(ModBlocks.BEECH_SLAB);
                        output.accept(ModBlocks.BEECH_STAIRS);
                        output.accept(ModBlocks.BEECH_FENCE);
                        output.accept(ModBlocks.BEECH_FENCE_GATE);
                        output.accept(ModBlocks.BEECH_DOOR);
                        output.accept(ModBlocks.BEECH_TRAPDOOR);
                        output.accept(ModBlocks.BEECH_BUTTON);
                        output.accept(ModBlocks.BEECH_PRESSURE_PLATE);
                        output.accept(ModBlocks.BEECH_LEAVES);
                        output.accept(ModBlocks.BEECH_SAPLING);
                        output.accept(ModItems.BEECH_BOAT);
                        output.accept(ModItems.BEECH_CHEST_BOAT);
                    })
                    .build()
    );

    public static void registerItemGroups() {
        MoreTreesCommon.LOGGER.info("Registering ModItemGroups for " + MoreTreesCommon.MOD_ID);
    }
}
