package net.egon.moretrees.neoforge;

import net.egon.moretrees.neoforge.client.NeoModClientEvents;
import net.egon.moretrees.neoforge.registry.NeoModBlocks;
import net.egon.moretrees.neoforge.registry.NeoModCreativeTabs;
import net.egon.moretrees.neoforge.registry.NeoModEntities;
import net.egon.moretrees.neoforge.registry.NeoModItems;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FireBlock;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(MoreTreesNeoForge.MOD_ID)
public final class MoreTreesNeoForge {
    public static final String MOD_ID = "moretrees";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public MoreTreesNeoForge(IEventBus modEventBus) {
        modEventBus.addListener(this::onCommonSetup);
        modEventBus.addListener(this::onBlockEntityTypeAddBlocks);

        NeoModBlocks.register(modEventBus);
        NeoModEntities.register(modEventBus);
        NeoModItems.register(modEventBus);
        NeoModCreativeTabs.register(modEventBus);
        if ("CLIENT".equals(FMLEnvironment.getDist().name())) {
            NeoModClientEvents.register(modEventBus);
        }

        LOGGER.info("Loaded More Trees NeoForge module");
    }

    private void onCommonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            FireBlock fire = (FireBlock) Blocks.FIRE;
            addFlammables(fire);
        });
    }

    private void onBlockEntityTypeAddBlocks(BlockEntityTypeAddBlocksEvent event) {
        event.modify(BlockEntityType.SIGN,
                NeoModBlocks.CHESTNUT_SIGN.get(),
                NeoModBlocks.CHESTNUT_WALL_SIGN.get(),
                NeoModBlocks.MAPLE_SIGN.get(),
                NeoModBlocks.MAPLE_WALL_SIGN.get(),
                NeoModBlocks.BEECH_SIGN.get(),
                NeoModBlocks.BEECH_WALL_SIGN.get());

        event.modify(BlockEntityType.HANGING_SIGN,
                NeoModBlocks.CHESTNUT_HANGING_SIGN.get(),
                NeoModBlocks.CHESTNUT_WALL_HANGING_SIGN.get(),
                NeoModBlocks.MAPLE_HANGING_SIGN.get(),
                NeoModBlocks.MAPLE_WALL_HANGING_SIGN.get(),
                NeoModBlocks.BEECH_HANGING_SIGN.get(),
                NeoModBlocks.BEECH_WALL_HANGING_SIGN.get());
    }

    private static void addFlammables(FireBlock fire) {
        fire.setFlammable(NeoModBlocks.CHESTNUT_LOG.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.MAPLE_LOG.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.BEECH_LOG.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.STRIPPED_CHESTNUT_LOG.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.STRIPPED_MAPLE_LOG.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.STRIPPED_BEECH_LOG.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.STRIPPED_CHESTNUT_WOOD.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.STRIPPED_MAPLE_WOOD.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.STRIPPED_BEECH_WOOD.get(), 5, 5);
        fire.setFlammable(NeoModBlocks.CHESTNUT_PLANKS.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_PLANKS.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_PLANKS.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_SLAB.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_SLAB.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_SLAB.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_STAIRS.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_STAIRS.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_STAIRS.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_FENCE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_FENCE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_FENCE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_FENCE_GATE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_FENCE_GATE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_FENCE_GATE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_DOOR.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_DOOR.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_DOOR.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_TRAPDOOR.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_TRAPDOOR.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_TRAPDOOR.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_BUTTON.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_BUTTON.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_BUTTON.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_PRESSURE_PLATE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.MAPLE_PRESSURE_PLATE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.BEECH_PRESSURE_PLATE.get(), 5, 20);
        fire.setFlammable(NeoModBlocks.CHESTNUT_LEAVES.get(), 30, 60);
        fire.setFlammable(NeoModBlocks.MAPLE_LEAVES.get(), 30, 60);
        fire.setFlammable(NeoModBlocks.BEECH_LEAVES.get(), 30, 60);
    }
}
