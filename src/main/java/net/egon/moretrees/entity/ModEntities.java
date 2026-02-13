package net.egon.moretrees.entity;

import net.egon.moretrees.MoreTrees;
import net.egon.moretrees.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.entity.vehicle.ChestBoatEntity;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ModEntities {
    public static final EntityType<BoatEntity> MAPLE_BOAT = registerBoat("maple_boat", () -> ModItems.MAPLE_BOAT);
    public static final EntityType<ChestBoatEntity> MAPLE_CHEST_BOAT = registerChestBoat("maple_chest_boat", () -> ModItems.MAPLE_CHEST_BOAT);

    public static final EntityType<BoatEntity> CHESTNUT_BOAT = registerBoat("chestnut_boat", () -> ModItems.CHESTNUT_BOAT);
    public static final EntityType<ChestBoatEntity> CHESTNUT_CHEST_BOAT = registerChestBoat("chestnut_chest_boat", () -> ModItems.CHESTNUT_CHEST_BOAT);

    public static final EntityType<BoatEntity> BEECH_BOAT = registerBoat("beech_boat", () -> ModItems.BEECH_BOAT);
    public static final EntityType<ChestBoatEntity> BEECH_CHEST_BOAT = registerChestBoat("beech_chest_boat", () -> ModItems.BEECH_CHEST_BOAT);

    private static EntityType<BoatEntity> registerBoat(String name, Supplier<Item> itemSupplier) {
        Identifier id = Identifier.of(MoreTrees.MOD_ID, name);
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, id);
        EntityType<BoatEntity> type = EntityType.Builder.<BoatEntity>create(
                        (entityType, world) -> new BoatEntity(entityType, world, itemSupplier),
                        SpawnGroup.MISC)
                .dropsNothing()
                .dimensions(1.375f, 0.5625f)
                .eyeHeight(0.5625f)
                .maxTrackingRange(10)
                .trackingTickInterval(1)
                .build(key);
        return Registry.register(Registries.ENTITY_TYPE, id, type);
    }

    private static EntityType<ChestBoatEntity> registerChestBoat(String name, Supplier<Item> itemSupplier) {
        Identifier id = Identifier.of(MoreTrees.MOD_ID, name);
        RegistryKey<EntityType<?>> key = RegistryKey.of(RegistryKeys.ENTITY_TYPE, id);
        EntityType<ChestBoatEntity> type = EntityType.Builder.<ChestBoatEntity>create(
                        (entityType, world) -> new ChestBoatEntity(entityType, world, itemSupplier),
                        SpawnGroup.MISC)
                .dropsNothing()
                .dimensions(1.375f, 0.5625f)
                .eyeHeight(0.5625f)
                .maxTrackingRange(10)
                .trackingTickInterval(1)
                .build(key);
        return Registry.register(Registries.ENTITY_TYPE, id, type);
    }

    public static void registerModEntities() {
        MoreTrees.LOGGER.info("Registering ModEntities for " + MoreTrees.MOD_ID);
    }
}
