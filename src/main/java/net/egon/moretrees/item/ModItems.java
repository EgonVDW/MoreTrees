package net.egon.moretrees.item;

import net.egon.moretrees.MoreTrees;
import net.egon.moretrees.entity.ModEntities;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
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

    private static Item registerItem(String name, Function<Item.Settings, Item> factory) {
        Identifier id = Identifier.of(MoreTrees.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        Item item = factory.apply(new Item.Settings().registryKey(key));
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems() {
        MoreTrees.LOGGER.info("Registering ModItems for " + MoreTrees.MOD_ID);
    }
}
