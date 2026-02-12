package net.egon.moretrees;

import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.entity.ModEntities;
import net.egon.moretrees.item.ModItemGroups;
import net.egon.moretrees.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreTrees implements ModInitializer {
	public static final String MOD_ID = "moretrees";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModEntities.registerModEntities();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();

		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_LOG, ModBlocks.STRIPPED_CHESTNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.BEECH_LOG, ModBlocks.STRIPPED_BEECH_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_WOOD);
		StrippableBlockRegistry.register(ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_WOOD);
		StrippableBlockRegistry.register(ModBlocks.BEECH_WOOD, ModBlocks.STRIPPED_BEECH_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BEECH_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_BEECH_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_SLAB, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_STAIRS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_FENCE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_FENCE_GATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_DOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_DOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_DOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_TRAPDOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_TRAPDOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_TRAPDOOR, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_BUTTON, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_BUTTON, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_BUTTON, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PRESSURE_PLATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_PRESSURE_PLATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_PRESSURE_PLATE, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_LEAVES, 30, 60);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BEECH_LEAVES, 30, 60);
	}
}
