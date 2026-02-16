package net.egon.moretrees.neoforge.registry;

import net.egon.moretrees.neoforge.MoreTreesNeoForge;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public final class NeoModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreTreesNeoForge.MOD_ID);

    public static final DeferredItem<Item> CHESTNUT_LOG = registerBlockItem("chestnut_log", NeoModBlocks.CHESTNUT_LOG);
    public static final DeferredItem<Item> MAPLE_LOG = registerBlockItem("maple_log", NeoModBlocks.MAPLE_LOG);
    public static final DeferredItem<Item> BEECH_LOG = registerBlockItem("beech_log", NeoModBlocks.BEECH_LOG);

    public static final DeferredItem<Item> STRIPPED_CHESTNUT_LOG = registerBlockItem("stripped_chestnut_log", NeoModBlocks.STRIPPED_CHESTNUT_LOG);
    public static final DeferredItem<Item> STRIPPED_MAPLE_LOG = registerBlockItem("stripped_maple_log", NeoModBlocks.STRIPPED_MAPLE_LOG);
    public static final DeferredItem<Item> STRIPPED_BEECH_LOG = registerBlockItem("stripped_beech_log", NeoModBlocks.STRIPPED_BEECH_LOG);

    public static final DeferredItem<Item> CHESTNUT_WOOD = registerBlockItem("chestnut_wood", NeoModBlocks.CHESTNUT_WOOD);
    public static final DeferredItem<Item> MAPLE_WOOD = registerBlockItem("maple_wood", NeoModBlocks.MAPLE_WOOD);
    public static final DeferredItem<Item> BEECH_WOOD = registerBlockItem("beech_wood", NeoModBlocks.BEECH_WOOD);

    public static final DeferredItem<Item> STRIPPED_CHESTNUT_WOOD = registerBlockItem("stripped_chestnut_wood", NeoModBlocks.STRIPPED_CHESTNUT_WOOD);
    public static final DeferredItem<Item> STRIPPED_MAPLE_WOOD = registerBlockItem("stripped_maple_wood", NeoModBlocks.STRIPPED_MAPLE_WOOD);
    public static final DeferredItem<Item> STRIPPED_BEECH_WOOD = registerBlockItem("stripped_beech_wood", NeoModBlocks.STRIPPED_BEECH_WOOD);

    public static final DeferredItem<Item> CHESTNUT_PLANKS = registerBlockItem("chestnut_planks", NeoModBlocks.CHESTNUT_PLANKS);
    public static final DeferredItem<Item> MAPLE_PLANKS = registerBlockItem("maple_planks", NeoModBlocks.MAPLE_PLANKS);
    public static final DeferredItem<Item> BEECH_PLANKS = registerBlockItem("beech_planks", NeoModBlocks.BEECH_PLANKS);

    public static final DeferredItem<Item> CHESTNUT_SLAB = registerBlockItem("chestnut_slab", NeoModBlocks.CHESTNUT_SLAB);
    public static final DeferredItem<Item> MAPLE_SLAB = registerBlockItem("maple_slab", NeoModBlocks.MAPLE_SLAB);
    public static final DeferredItem<Item> BEECH_SLAB = registerBlockItem("beech_slab", NeoModBlocks.BEECH_SLAB);

    public static final DeferredItem<Item> CHESTNUT_STAIRS = registerBlockItem("chestnut_stairs", NeoModBlocks.CHESTNUT_STAIRS);
    public static final DeferredItem<Item> MAPLE_STAIRS = registerBlockItem("maple_stairs", NeoModBlocks.MAPLE_STAIRS);
    public static final DeferredItem<Item> BEECH_STAIRS = registerBlockItem("beech_stairs", NeoModBlocks.BEECH_STAIRS);

    public static final DeferredItem<Item> CHESTNUT_FENCE = registerBlockItem("chestnut_fence", NeoModBlocks.CHESTNUT_FENCE);
    public static final DeferredItem<Item> MAPLE_FENCE = registerBlockItem("maple_fence", NeoModBlocks.MAPLE_FENCE);
    public static final DeferredItem<Item> BEECH_FENCE = registerBlockItem("beech_fence", NeoModBlocks.BEECH_FENCE);

    public static final DeferredItem<Item> CHESTNUT_FENCE_GATE = registerBlockItem("chestnut_fence_gate", NeoModBlocks.CHESTNUT_FENCE_GATE);
    public static final DeferredItem<Item> MAPLE_FENCE_GATE = registerBlockItem("maple_fence_gate", NeoModBlocks.MAPLE_FENCE_GATE);
    public static final DeferredItem<Item> BEECH_FENCE_GATE = registerBlockItem("beech_fence_gate", NeoModBlocks.BEECH_FENCE_GATE);

    public static final DeferredItem<Item> CHESTNUT_DOOR = registerBlockItem("chestnut_door", NeoModBlocks.CHESTNUT_DOOR,
            props -> new DoubleHighBlockItem(NeoModBlocks.CHESTNUT_DOOR.get(), props));
    public static final DeferredItem<Item> MAPLE_DOOR = registerBlockItem("maple_door", NeoModBlocks.MAPLE_DOOR,
            props -> new DoubleHighBlockItem(NeoModBlocks.MAPLE_DOOR.get(), props));
    public static final DeferredItem<Item> BEECH_DOOR = registerBlockItem("beech_door", NeoModBlocks.BEECH_DOOR,
            props -> new DoubleHighBlockItem(NeoModBlocks.BEECH_DOOR.get(), props));

    public static final DeferredItem<Item> CHESTNUT_TRAPDOOR = registerBlockItem("chestnut_trapdoor", NeoModBlocks.CHESTNUT_TRAPDOOR);
    public static final DeferredItem<Item> MAPLE_TRAPDOOR = registerBlockItem("maple_trapdoor", NeoModBlocks.MAPLE_TRAPDOOR);
    public static final DeferredItem<Item> BEECH_TRAPDOOR = registerBlockItem("beech_trapdoor", NeoModBlocks.BEECH_TRAPDOOR);

    public static final DeferredItem<Item> CHESTNUT_BUTTON = registerBlockItem("chestnut_button", NeoModBlocks.CHESTNUT_BUTTON);
    public static final DeferredItem<Item> MAPLE_BUTTON = registerBlockItem("maple_button", NeoModBlocks.MAPLE_BUTTON);
    public static final DeferredItem<Item> BEECH_BUTTON = registerBlockItem("beech_button", NeoModBlocks.BEECH_BUTTON);

    public static final DeferredItem<Item> CHESTNUT_PRESSURE_PLATE = registerBlockItem("chestnut_pressure_plate", NeoModBlocks.CHESTNUT_PRESSURE_PLATE);
    public static final DeferredItem<Item> MAPLE_PRESSURE_PLATE = registerBlockItem("maple_pressure_plate", NeoModBlocks.MAPLE_PRESSURE_PLATE);
    public static final DeferredItem<Item> BEECH_PRESSURE_PLATE = registerBlockItem("beech_pressure_plate", NeoModBlocks.BEECH_PRESSURE_PLATE);

    public static final DeferredItem<Item> CHESTNUT_LEAVES = registerBlockItem("chestnut_leaves", NeoModBlocks.CHESTNUT_LEAVES);
    public static final DeferredItem<Item> MAPLE_LEAVES = registerBlockItem("maple_leaves", NeoModBlocks.MAPLE_LEAVES);
    public static final DeferredItem<Item> BEECH_LEAVES = registerBlockItem("beech_leaves", NeoModBlocks.BEECH_LEAVES);

    public static final DeferredItem<Item> CHESTNUT_SAPLING = registerBlockItem("chestnut_sapling", NeoModBlocks.CHESTNUT_SAPLING);
    public static final DeferredItem<Item> MAPLE_SAPLING = registerBlockItem("maple_sapling", NeoModBlocks.MAPLE_SAPLING);
    public static final DeferredItem<Item> BEECH_SAPLING = registerBlockItem("beech_sapling", NeoModBlocks.BEECH_SAPLING);

    public static final DeferredItem<Item> CHESTNUT_SIGN = registerItem("chestnut_sign",
            props -> new SignItem(NeoModBlocks.CHESTNUT_SIGN.get(), NeoModBlocks.CHESTNUT_WALL_SIGN.get(), props.stacksTo(16)));
    public static final DeferredItem<Item> MAPLE_SIGN = registerItem("maple_sign",
            props -> new SignItem(NeoModBlocks.MAPLE_SIGN.get(), NeoModBlocks.MAPLE_WALL_SIGN.get(), props.stacksTo(16)));
    public static final DeferredItem<Item> BEECH_SIGN = registerItem("beech_sign",
            props -> new SignItem(NeoModBlocks.BEECH_SIGN.get(), NeoModBlocks.BEECH_WALL_SIGN.get(), props.stacksTo(16)));

    public static final DeferredItem<Item> CHESTNUT_HANGING_SIGN = registerItem("chestnut_hanging_sign",
            props -> new HangingSignItem(NeoModBlocks.CHESTNUT_HANGING_SIGN.get(), NeoModBlocks.CHESTNUT_WALL_HANGING_SIGN.get(), props.stacksTo(16)));
    public static final DeferredItem<Item> MAPLE_HANGING_SIGN = registerItem("maple_hanging_sign",
            props -> new HangingSignItem(NeoModBlocks.MAPLE_HANGING_SIGN.get(), NeoModBlocks.MAPLE_WALL_HANGING_SIGN.get(), props.stacksTo(16)));
    public static final DeferredItem<Item> BEECH_HANGING_SIGN = registerItem("beech_hanging_sign",
            props -> new HangingSignItem(NeoModBlocks.BEECH_HANGING_SIGN.get(), NeoModBlocks.BEECH_WALL_HANGING_SIGN.get(), props.stacksTo(16)));

    public static final DeferredItem<Item> CHESTNUT_BOAT = registerItem("chestnut_boat",
            props -> new BoatItem(NeoModEntities.CHESTNUT_BOAT.get(), props.stacksTo(1)));
    public static final DeferredItem<Item> CHESTNUT_CHEST_BOAT = registerItem("chestnut_chest_boat",
            props -> new BoatItem(NeoModEntities.CHESTNUT_CHEST_BOAT.get(), props.stacksTo(1)));
    public static final DeferredItem<Item> MAPLE_BOAT = registerItem("maple_boat",
            props -> new BoatItem(NeoModEntities.MAPLE_BOAT.get(), props.stacksTo(1)));
    public static final DeferredItem<Item> MAPLE_CHEST_BOAT = registerItem("maple_chest_boat",
            props -> new BoatItem(NeoModEntities.MAPLE_CHEST_BOAT.get(), props.stacksTo(1)));
    public static final DeferredItem<Item> BEECH_BOAT = registerItem("beech_boat",
            props -> new BoatItem(NeoModEntities.BEECH_BOAT.get(), props.stacksTo(1)));
    public static final DeferredItem<Item> BEECH_CHEST_BOAT = registerItem("beech_chest_boat",
            props -> new BoatItem(NeoModEntities.BEECH_CHEST_BOAT.get(), props.stacksTo(1)));

    private NeoModItems() {
    }

    private static DeferredItem<Item> registerBlockItem(String name, DeferredBlock<? extends Block> block) {
        return registerBlockItem(name, props -> new BlockItem(block.get(), props));
    }

    private static DeferredItem<Item> registerBlockItem(String name, Function<Item.Properties, Item> itemFactory) {
        return ITEMS.registerItem(name, props -> itemFactory.apply(props.useBlockDescriptionPrefix()));
    }

    private static DeferredItem<Item> registerBlockItem(String name,
                                                        DeferredBlock<? extends Block> block,
                                                        Function<Item.Properties, Item> itemFactory) {
        return ITEMS.registerItem(name, props -> itemFactory.apply(props.useBlockDescriptionPrefix()));
    }

    private static DeferredItem<Item> registerItem(String name, Function<Item.Properties, Item> itemFactory) {
        return ITEMS.registerItem(name, itemFactory);
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
