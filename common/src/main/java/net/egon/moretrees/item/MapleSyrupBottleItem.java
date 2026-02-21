package net.egon.moretrees.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.consume.UseAction;
import net.minecraft.entity.LivingEntity;
import net.minecraft.world.World;

public class MapleSyrupBottleItem extends Item {
    public MapleSyrupBottleItem(Settings settings) {
        super(settings);
    }

    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.DRINK;
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        ItemStack result = super.finishUsing(stack, world, user);
        return result.isEmpty() ? new ItemStack(Items.GLASS_BOTTLE) : result;
    }
}
