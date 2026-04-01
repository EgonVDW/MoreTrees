package net.egon.moretrees.neoforge;

import net.egon.moretrees.neoforge.client.NeoModClientEvents;
import net.egon.moretrees.neoforge.registry.NeoModBlocks;
import net.egon.moretrees.neoforge.registry.NeoModCreativeTabs;
import net.egon.moretrees.neoforge.registry.NeoModEntities;
import net.egon.moretrees.neoforge.registry.NeoModItems;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.event.BlockEntityTypeAddBlocksEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(MoreTreesNeoForge.MOD_ID)
public final class MoreTreesNeoForge {
    public static final String MOD_ID = "moretrees";
    private static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public MoreTreesNeoForge(IEventBus modEventBus) {
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
}
