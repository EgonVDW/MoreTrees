package net.egon.moretrees.util;

import net.egon.moretrees.MoreTreesCommon;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> CHESTNUT_LOGS = createTag("chestnut_logs");
        public static final TagKey<Item> MAPLE_LOGS = createTag("maple_logs");
        public static final TagKey<Item> BEECH_LOGS = createTag("beech_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MoreTreesCommon.MOD_ID, name));
        }
    }
}
