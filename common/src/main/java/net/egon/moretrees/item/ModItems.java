package net.egon.moretrees.item;

import net.egon.moretrees.MoreTreesCommon;
import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.entity.ModEntities;
import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.BoatItem;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.SignItem;
import net.minecraft.item.consume.UseAction;
import net.minecraft.sound.SoundEvents;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    private static final FoodComponent CHESTNUT_FOOD = new FoodComponent(2, 1.2f, false);
    private static final FoodComponent ROASTED_CHESTNUT_FOOD = new FoodComponent(5, 4.0f, false);
    private static final FoodComponent MAPLE_SYRUP_FOOD = new FoodComponent(6, 12.0f, true);

    public static final Item MAPLE_BOAT = registerItem("maple_boat",
            settings -> new BoatItem(ModEntities.MAPLE_BOAT, settings.maxCount(1)));
    public static final Item MAPLE_CHEST_BOAT = registerItem("maple_chest_boat",
            settings -> new BoatItem(ModEntities.MAPLE_CHEST_BOAT, settings.maxCount(1)));

    public static final Item CHESTNUT_BOAT = registerItem("chestnut_boat",
            settings -> new BoatItem(ModEntities.CHESTNUT_BOAT, settings.maxCount(1)));
    public static final Item CHESTNUT_CHEST_BOAT = registerItem("chestnut_chest_boat",
            settings -> new BoatItem(ModEntities.CHESTNUT_CHEST_BOAT, settings.maxCount(1)));

    public static final Item BEECH_BOAT = registerItem("beech_boat",
            settings -> new BoatItem(ModEntities.BEECH_BOAT, settings.maxCount(1)));
    public static final Item BEECH_CHEST_BOAT = registerItem("beech_chest_boat",
            settings -> new BoatItem(ModEntities.BEECH_CHEST_BOAT, settings.maxCount(1)));

    public static final Item CHESTNUT_SIGN = registerItem("chestnut_sign",
            settings -> new SignItem(ModBlocks.CHESTNUT_SIGN, ModBlocks.CHESTNUT_WALL_SIGN, settings.maxCount(16)));
    public static final Item CHESTNUT_HANGING_SIGN = registerItem("chestnut_hanging_sign",
            settings -> new HangingSignItem(ModBlocks.CHESTNUT_HANGING_SIGN, ModBlocks.CHESTNUT_WALL_HANGING_SIGN, settings.maxCount(16)));

    public static final Item MAPLE_SIGN = registerItem("maple_sign",
            settings -> new SignItem(ModBlocks.MAPLE_SIGN, ModBlocks.MAPLE_WALL_SIGN, settings.maxCount(16)));
    public static final Item MAPLE_HANGING_SIGN = registerItem("maple_hanging_sign",
            settings -> new HangingSignItem(ModBlocks.MAPLE_HANGING_SIGN, ModBlocks.MAPLE_WALL_HANGING_SIGN, settings.maxCount(16)));

    public static final Item BEECH_SIGN = registerItem("beech_sign",
            settings -> new SignItem(ModBlocks.BEECH_SIGN, ModBlocks.BEECH_WALL_SIGN, settings.maxCount(16)));
    public static final Item BEECH_HANGING_SIGN = registerItem("beech_hanging_sign",
            settings -> new HangingSignItem(ModBlocks.BEECH_HANGING_SIGN, ModBlocks.BEECH_WALL_HANGING_SIGN, settings.maxCount(16)));

    public static final Item CHESTNUT = registerItem("chestnut",
            settings -> new Item(settings.food(CHESTNUT_FOOD)));
    public static final Item ROASTED_CHESTNUT = registerItem("roasted_chestnut",
            settings -> new Item(settings.food(ROASTED_CHESTNUT_FOOD)));
    public static final Item MAPLE_SAP_BOTTLE = registerItem("maple_sap_bottle",
            settings -> new Item(settings.maxCount(16)));
    public static final Item MAPLE_SYRUP_BOTTLE = registerItem("maple_syrup_bottle",
            settings -> new MapleSyrupBottleItem(settings.maxCount(16)
                    .food(MAPLE_SYRUP_FOOD, ConsumableComponent.builder()
                            .useAction(UseAction.DRINK)
                            .sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK)
                            .consumeParticles(false)
                            .build())
                    .useRemainder(Items.GLASS_BOTTLE)));

    private static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        Identifier id = Identifier.of(MoreTreesCommon.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item item = factory.apply(new Item.Settings().registryKey(key));
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems() {
        MoreTreesCommon.LOGGER.info("Registering ModItems for " + MoreTreesCommon.MOD_ID);
    }
}
