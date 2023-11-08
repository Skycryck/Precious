package net.skycryck.precious.item.custom.curios;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;

public class TheOneItem extends CuriosItem implements ICurioItem {

    public TheOneItem(Properties pProperties) {
        super(pProperties);
        this.addEffect(MobEffects.INVISIBILITY);
        this.addEffect(MobEffects.NIGHT_VISION);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack pStack, @Nullable Level pLevel, @NotNull List<Component> pTooltipComponents, @NotNull TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.precious.the_one.tooltip.shift"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.precious.the_one.tooltip"));
        }

        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    @Override
    public void onEquip(SlotContext slotContext, ItemStack prevStack, ItemStack stack) {
        LivingEntity player = slotContext.entity();
        this.addEffectsToPlayer(player);
        ICurioItem.super.onEquip(slotContext, prevStack, stack);
    }

    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        LivingEntity player = slotContext.entity();
        this.removeEffectsToPlayer(player);
        ICurioItem.super.onUnequip(slotContext, newStack, stack);
    }
}
