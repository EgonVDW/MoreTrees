package net.egon.moretrees.neoforge.registry;

import net.egon.moretrees.neoforge.MoreTreesNeoForge;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public final class NeoModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreTreesNeoForge.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MORETREES_ITEM_GROUP = CREATIVE_MODE_TABS.register(
            "moretrees_item_group",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemgroup.moretrees_item_group"))
                    .icon(() -> new ItemStack(NeoModItems.CHESTNUT_SAPLING.get()))
                    .displayItems((parameters, output) -> {
                        output.accept(NeoModItems.CHESTNUT_LOG.get());
                        output.accept(NeoModItems.STRIPPED_CHESTNUT_LOG.get());
                        output.accept(NeoModItems.CHESTNUT_WOOD.get());
                        output.accept(NeoModItems.STRIPPED_CHESTNUT_WOOD.get());
                        output.accept(NeoModItems.CHESTNUT_PLANKS.get());
                        output.accept(NeoModItems.CHESTNUT_SIGN.get());
                        output.accept(NeoModItems.CHESTNUT_HANGING_SIGN.get());
                        output.accept(NeoModItems.CHESTNUT_SLAB.get());
                        output.accept(NeoModItems.CHESTNUT_STAIRS.get());
                        output.accept(NeoModItems.CHESTNUT_FENCE.get());
                        output.accept(NeoModItems.CHESTNUT_FENCE_GATE.get());
                        output.accept(NeoModItems.CHESTNUT_DOOR.get());
                        output.accept(NeoModItems.CHESTNUT_TRAPDOOR.get());
                        output.accept(NeoModItems.CHESTNUT_BUTTON.get());
                        output.accept(NeoModItems.CHESTNUT_PRESSURE_PLATE.get());
                        output.accept(NeoModItems.CHESTNUT_LEAVES.get());
                        output.accept(NeoModItems.CHESTNUT_SAPLING.get());
                        output.accept(NeoModItems.CHESTNUT.get());
                        output.accept(NeoModItems.ROASTED_CHESTNUT.get());
                        output.accept(NeoModItems.CHESTNUT_BOAT.get());
                        output.accept(NeoModItems.CHESTNUT_CHEST_BOAT.get());

                        output.accept(NeoModItems.MAPLE_LOG.get());
                        output.accept(NeoModItems.STRIPPED_MAPLE_LOG.get());
                        output.accept(NeoModItems.MAPLE_WOOD.get());
                        output.accept(NeoModItems.STRIPPED_MAPLE_WOOD.get());
                        output.accept(NeoModItems.MAPLE_PLANKS.get());
                        output.accept(NeoModItems.MAPLE_SAP_COLLECTOR.get());
                        output.accept(NeoModItems.MAPLE_SIGN.get());
                        output.accept(NeoModItems.MAPLE_HANGING_SIGN.get());
                        output.accept(NeoModItems.MAPLE_SLAB.get());
                        output.accept(NeoModItems.MAPLE_STAIRS.get());
                        output.accept(NeoModItems.MAPLE_FENCE.get());
                        output.accept(NeoModItems.MAPLE_FENCE_GATE.get());
                        output.accept(NeoModItems.MAPLE_DOOR.get());
                        output.accept(NeoModItems.MAPLE_TRAPDOOR.get());
                        output.accept(NeoModItems.MAPLE_BUTTON.get());
                        output.accept(NeoModItems.MAPLE_PRESSURE_PLATE.get());
                        output.accept(NeoModItems.MAPLE_LEAVES.get());
                        output.accept(NeoModItems.MAPLE_SAPLING.get());
                        output.accept(NeoModItems.MAPLE_SAP_BOTTLE.get());
                        output.accept(NeoModItems.MAPLE_SYRUP_BOTTLE.get());
                        output.accept(NeoModItems.MAPLE_BOAT.get());
                        output.accept(NeoModItems.MAPLE_CHEST_BOAT.get());

                        output.accept(NeoModItems.BEECH_LOG.get());
                        output.accept(NeoModItems.STRIPPED_BEECH_LOG.get());
                        output.accept(NeoModItems.BEECH_WOOD.get());
                        output.accept(NeoModItems.STRIPPED_BEECH_WOOD.get());
                        output.accept(NeoModItems.BEECH_PLANKS.get());
                        output.accept(NeoModItems.BEECH_SIGN.get());
                        output.accept(NeoModItems.BEECH_HANGING_SIGN.get());
                        output.accept(NeoModItems.BEECH_SLAB.get());
                        output.accept(NeoModItems.BEECH_STAIRS.get());
                        output.accept(NeoModItems.BEECH_FENCE.get());
                        output.accept(NeoModItems.BEECH_FENCE_GATE.get());
                        output.accept(NeoModItems.BEECH_DOOR.get());
                        output.accept(NeoModItems.BEECH_TRAPDOOR.get());
                        output.accept(NeoModItems.BEECH_BUTTON.get());
                        output.accept(NeoModItems.BEECH_PRESSURE_PLATE.get());
                        output.accept(NeoModItems.BEECH_LEAVES.get());
                        output.accept(NeoModItems.BEECH_SAPLING.get());
                        output.accept(NeoModItems.BEECH_BOAT.get());
                        output.accept(NeoModItems.BEECH_CHEST_BOAT.get());
                    })
                    .build());

    private NeoModCreativeTabs() {
    }

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
