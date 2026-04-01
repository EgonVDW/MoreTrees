package net.egon.moretrees.item;

import net.egon.moretrees.MoreTreesCommon;
import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.entity.ModEntities;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BoatItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.component.Consumable;

import java.util.function.Function;

public class ModItems {
    private static final FoodProperties CHESTNUT_FOOD = new FoodProperties(2, 1.2f, false);
    private static final FoodProperties ROASTED_CHESTNUT_FOOD = new FoodProperties(5, 4.0f, false);
    private static final FoodProperties MAPLE_SYRUP_FOOD = new FoodProperties(6, 12.0f, true);

    public static final Item MAPLE_BOAT = registerItem("maple_boat",
            properties -> new BoatItem(ModEntities.MAPLE_BOAT, properties.stacksTo(1)));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat",
            properties -> new BoatItem(ModEntities.MAPLE_CHEST_BOAT, properties.stacksTo(1)));

    public static final Item CHESTNUT_BOAT = registerItem("chestnut_boat",
            properties -> new BoatItem(ModEntities.CHESTNUT_BOAT, properties.stacksTo(1)));
    public static final Item CHESTNUT_CHEST_BOAT = registerItem("chestnut_chest_boat",
            properties -> new BoatItem(ModEntities.CHESTNUT_CHEST_BOAT, properties.stacksTo(1)));

    public static final Item BEECH_BOAT = registerItem("beech_boat",
            properties -> new BoatItem(ModEntities.BEECH_BOAT, properties.stacksTo(1)));
    public static final Item BEECH_CHEST_BOAT = registerItem("beech_chest_boat",
            properties -> new BoatItem(ModEntities.BEECH_CHEST_BOAT, properties.stacksTo(1)));

    public static final Item CHESTNUT_SIGN = registerItem("chestnut_sign",
            properties -> new SignItem(ModBlocks.CHESTNUT_SIGN, ModBlocks.CHESTNUT_WALL_SIGN, properties.stacksTo(16)));
    public static final Item CHESTNUT_HANGING_SIGN = registerItem("chestnut_hanging_sign",
            properties -> new HangingSignItem(ModBlocks.CHESTNUT_HANGING_SIGN, ModBlocks.CHESTNUT_WALL_HANGING_SIGN, properties.stacksTo(16)));

    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            properties -> new SignItem(ModBlocks.MAPLE_SIGN, ModBlocks.MAPLE_WALL_SIGN, properties.stacksTo(16)));
    public static final Item MAPLE_HANGING_SIGN = registerItem("maple_hanging_sign",
            properties -> new HangingSignItem(ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN, properties.stacksTo(16)));

    public static final Item BEECH_SIGN = registerItem("beech_sign",
            properties -> new SignItem(ModBlocks.BEECH_SIGN, ModBlocks.BEECH_WALL_SIGN, properties.stacksTo(16)));
    public static final Item BEECH_HANGING_SIGN = registerItem("beech_hanging_sign",
            properties -> new HangingSignItem(ModBlocks.BEECH_HANGING_SIGN, ModBlocks.BEECH_WALL_HANGING_SIGN, properties.stacksTo(16)));

    public static final Item CHESTNUT = registerItem("chestnut",
            properties -> new Item(properties.food(CHESTNUT_FOOD)));
    public static final Item ROASTED_CHESTNUT = registerItem("roasted_chestnut",
            properties -> new Item(properties.food(ROASTED_CHESTNUT_FOOD)));
    public static final Item MAPLE_SAP_BOTTLE = registerItem("maple_sap_bottle",
            properties -> new Item(properties.stacksTo(16)));
    public static final Item MAPLE_SYRUP_BOTTLE = registerItem("maple_syrup_bottle",
            properties -> new MapleSyrupBottleItem(properties.stacksTo(16)
                    .food(MAPLE_SYRUP_FOOD, Consumable.builder()
                            .animation(ItemUseAnimation.DRINK)
                            .sound(SoundEvents.HONEY_DRINK)
                            .hasConsumeParticles(false)
                            .build())
                    .usingConvertsTo(Items.GLASS_BOTTLE)));

    private static Item registerItem(String name, Function<Item.Properties, Item> factory) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, name);
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, id);
        Item item = factory.apply(new Item.Properties().setId(key));
        return Registry.register(BuiltInRegistries.ITEM, id, item);
    }

    public static void registerModItems() {
        MoreTreesCommon.LOGGER.info("Registering ModItems for " + MoreTreesCommon.MOD_ID);
    }
}
