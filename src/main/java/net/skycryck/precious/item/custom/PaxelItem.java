package net.skycryck.precious.item.custom;

import net.minecraft.world.item.DiggerItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Vanishable;
import net.skycryck.precious.util.ModTags;

public class PaxelItem extends DiggerItem implements Vanishable {
    public PaxelItem(Tier pTier, float pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pAttackDamageModifier, pAttackSpeedModifier, pTier, ModTags.Blocks.PAXEL_MINEABLE, pProperties);
    }
}
