package net.skycryck.precious.item.custom.curios;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class CuriosItem extends Item {

    private final List<EffectType> EFFECTS_LIST;

    public CuriosItem(Properties pProperties) {
        super(pProperties);
        this.EFFECTS_LIST = new ArrayList<>();
    }

    public void addEffect(MobEffect effect) {
        this.EFFECTS_LIST.add(new EffectType(effect));
    }

    public void addEffect(MobEffect effect, int amp) {
        this.EFFECTS_LIST.add(new EffectType(effect, amp));
    }

    public void removeEffect(MobEffect effect) {
        for(EffectType e : this.EFFECTS_LIST) {
            if(e.getEffect() == effect) {
                this.EFFECTS_LIST.remove(e);
            }
        }
    }

    public void addEffectsToPlayer(LivingEntity player) {
        for(EffectType effect : this.EFFECTS_LIST) {
            player.addEffect(new MobEffectInstance(effect.getEffect(), -1, effect.getAmplifier(), false, false, false));
        }
    }

    public void removeEffectsToPlayer(LivingEntity player) {
        for(EffectType effect : this.EFFECTS_LIST) {
            player.removeEffect(effect.getEffect());
        }
    }
}
