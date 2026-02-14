package net.egon.moretrees.block;

import net.minecraft.data.family.BlockFamily;

public class ModBlockFamilies {
    public static final BlockFamily CHESTNUT_FAMILY = new BlockFamily.Builder(ModBlocks.CHESTNUT_PLANKS)
            .slab(ModBlocks.CHESTNUT_SLAB)
            .stairs(ModBlocks.CHESTNUT_STAIRS)
            .fence(ModBlocks.CHESTNUT_FENCE)
            .fenceGate(ModBlocks.CHESTNUT_FENCE_GATE)
            .sign(ModBlocks.CHESTNUT_SIGN, ModBlocks.CHESTNUT_WALL_SIGN)
            .door(ModBlocks.CHESTNUT_DOOR)
            .trapdoor(ModBlocks.CHESTNUT_TRAPDOOR)
            .button(ModBlocks.CHESTNUT_BUTTON)
            .pressurePlate(ModBlocks.CHESTNUT_PRESSURE_PLATE)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily MAPLE_FAMILY = new BlockFamily.Builder(ModBlocks.MAPLE_PLANKS)
            .slab(ModBlocks.MAPLE_SLAB)
            .stairs(ModBlocks.MAPLE_STAIRS)
            .fence(ModBlocks.MAPLE_FENCE)
            .fenceGate(ModBlocks.MAPLE_FENCE_GATE)
            .sign(ModBlocks.MAPLE_SIGN, ModBlocks.MAPLE_WALL_SIGN)
            .door(ModBlocks.MAPLE_DOOR)
            .trapdoor(ModBlocks.MAPLE_TRAPDOOR)
            .button(ModBlocks.MAPLE_BUTTON)
            .pressurePlate(ModBlocks.MAPLE_PRESSURE_PLATE)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();

    public static final BlockFamily BEECH_FAMILY = new BlockFamily.Builder(ModBlocks.BEECH_PLANKS)
            .slab(ModBlocks.BEECH_SLAB)
            .stairs(ModBlocks.BEECH_STAIRS)
            .fence(ModBlocks.BEECH_FENCE)
            .fenceGate(ModBlocks.BEECH_FENCE_GATE)
            .sign(ModBlocks.BEECH_SIGN, ModBlocks.BEECH_WALL_SIGN)
            .door(ModBlocks.BEECH_DOOR)
            .trapdoor(ModBlocks.BEECH_TRAPDOOR)
            .button(ModBlocks.BEECH_BUTTON)
            .pressurePlate(ModBlocks.BEECH_PRESSURE_PLATE)
            .group("wooden")
            .unlockCriterionName("has_planks")
            .build();
}
