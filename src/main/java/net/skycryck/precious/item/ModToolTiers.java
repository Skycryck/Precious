package net.skycryck.precious.item;

import net.skycryck.precious.PreciousMod;
import net.skycryck.precious.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier MITHRIL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 3000, 10f, 5.0f, 26,
                    ModTags.Blocks.NEEDS_MITHRIL_TOOL, () -> Ingredient.of(ModItems.MITHRIL_INGOT.get())),
            new ResourceLocation(PreciousMod.MOD_ID, "mithril"), List.of(Tiers.NETHERITE), List.of());
}