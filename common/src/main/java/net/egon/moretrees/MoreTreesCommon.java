package net.egon.moretrees;

import net.egon.moretrees.block.ModBlocks;
import net.egon.moretrees.entity.ModEntities;
import net.egon.moretrees.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class MoreTreesCommon {
    public static final String MOD_ID = "moretrees";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private MoreTreesCommon() {
    }

    public static void init() {
        ModEntities.registerModEntities();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}
