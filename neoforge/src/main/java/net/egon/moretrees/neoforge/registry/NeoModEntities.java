package net.egon.moretrees.neoforge.registry;

import net.egon.moretrees.neoforge.MoreTreesNeoForge;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public final class NeoModEntities {
    public static final DeferredRegister.Entities ENTITY_TYPES = DeferredRegister.createEntities(MoreTreesNeoForge.MOD_ID);

    public static final DeferredHolder<EntityType<?>, EntityType<Boat>> MAPLE_BOAT = registerBoat("maple_boat", "maple_boat");
    public static final DeferredHolder<EntityType<?>, EntityType<ChestBoat>> MAPLE_CHEST_BOAT = registerChestBoat("maple_chest_boat", "maple_chest_boat");

    public static final DeferredHolder<EntityType<?>, EntityType<Boat>> CHESTNUT_BOAT = registerBoat("chestnut_boat", "chestnut_boat");
    public static final DeferredHolder<EntityType<?>, EntityType<ChestBoat>> CHESTNUT_CHEST_BOAT = registerChestBoat("chestnut_chest_boat", "chestnut_chest_boat");

    public static final DeferredHolder<EntityType<?>, EntityType<Boat>> BEECH_BOAT = registerBoat("beech_boat", "beech_boat");
    public static final DeferredHolder<EntityType<?>, EntityType<ChestBoat>> BEECH_CHEST_BOAT = registerChestBoat("beech_chest_boat", "beech_chest_boat");

    private NeoModEntities() {
    }

    private static DeferredHolder<EntityType<?>, EntityType<Boat>> registerBoat(String name, String itemName) {
        Supplier<Item> itemSupplier = itemSupplier(itemName);
        return ENTITY_TYPES.registerEntityType(name,
                (entityType, level) -> new Boat(entityType, level, itemSupplier),
                MobCategory.MISC,
                builder -> builder
                        .noLootTable()
                        .sized(1.375F, 0.5625F)
                        .eyeHeight(0.5625F)
                        .clientTrackingRange(10)
                        .updateInterval(1));
    }

    private static DeferredHolder<EntityType<?>, EntityType<ChestBoat>> registerChestBoat(String name, String itemName) {
        Supplier<Item> itemSupplier = itemSupplier(itemName);
        return ENTITY_TYPES.registerEntityType(name,
                (entityType, level) -> new ChestBoat(entityType, level, itemSupplier),
                MobCategory.MISC,
                builder -> builder
                        .noLootTable()
                        .sized(1.375F, 0.5625F)
                        .eyeHeight(0.5625F)
                        .clientTrackingRange(10)
                        .updateInterval(1));
    }

    private static Supplier<Item> itemSupplier(String itemName) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreTreesNeoForge.MOD_ID, itemName);
        return () -> BuiltInRegistries.ITEM.getValue(id);
    }

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
