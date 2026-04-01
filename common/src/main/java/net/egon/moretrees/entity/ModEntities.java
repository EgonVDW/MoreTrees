package net.egon.moretrees.entity;

import net.egon.moretrees.MoreTreesCommon;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.boat.ChestBoat;
import net.minecraft.world.item.Item;

import java.util.function.Supplier;

public final class ModEntities {
    public static final EntityType<Boat> MAPLE_BOAT = registerBoat("maple_boat");
    public static final EntityType<ChestBoat> MAPLE_CHEST_BOAT = registerChestBoat("maple_chest_boat");

    public static final EntityType<Boat> CHESTNUT_BOAT = registerBoat("chestnut_boat");
    public static final EntityType<ChestBoat> CHESTNUT_CHEST_BOAT = registerChestBoat("chestnut_chest_boat");

    public static final EntityType<Boat> BEECH_BOAT = registerBoat("beech_boat");
    public static final EntityType<ChestBoat> BEECH_CHEST_BOAT = registerChestBoat("beech_chest_boat");

    private ModEntities() {
    }

    private static EntityType<Boat> registerBoat(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, name);
        ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, id);
        Supplier<Item> itemSupplier = () -> BuiltInRegistries.ITEM.getValue(id);
        EntityType<Boat> type = EntityType.Builder.<Boat>of(
                        (entityType, level) -> new Boat(entityType, level, itemSupplier),
                        MobCategory.MISC)
                .noLootTable()
                .sized(1.375F, 0.5625F)
                .eyeHeight(0.5625f)
                .clientTrackingRange(10)
                .updateInterval(1)
                .build(key);
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, id, type);
    }

    private static EntityType<ChestBoat> registerChestBoat(String name) {
        Identifier id = Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, name);
        ResourceKey<EntityType<?>> key = ResourceKey.create(Registries.ENTITY_TYPE, id);
        Supplier<Item> itemSupplier = () -> BuiltInRegistries.ITEM.getValue(id);
        EntityType<ChestBoat> type = EntityType.Builder.<ChestBoat>of(
                        (entityType, level) -> new ChestBoat(entityType, level, itemSupplier),
                        MobCategory.MISC)
                .noLootTable()
                .sized(1.375F, 0.5625F)
                .eyeHeight(0.5625f)
                .clientTrackingRange(10)
                .updateInterval(1)
                .build(key);
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, id, type);
    }

    public static void registerModEntities() {
        MoreTreesCommon.LOGGER.info("Registering ModEntities for " + MoreTreesCommon.MOD_ID);
    }
}
