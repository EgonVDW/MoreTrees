package net.egon.moretrees.util;

import net.egon.moretrees.MoreTreesCommon;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> CHESTNUT_LOGS = createTag("chestnut_logs");
        public static final TagKey<Item> MAPLE_LOGS = createTag("maple_logs");
        public static final TagKey<Item> BEECH_LOGS = createTag("beech_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(MoreTreesCommon.MOD_ID, name));
        }
    }
}
