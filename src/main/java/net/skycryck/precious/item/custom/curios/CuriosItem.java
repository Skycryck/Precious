package net.skycryck.precious.item.custom.curios;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class CuriosItem extends Item {

    protected static final List<MobEffect> EFFECTS_LIST = new ArrayList<>();

    public CuriosItem(Properties pProperties) {
        super(pProperties);
    }

    public boolean addEffect(MobEffect effect) {
        return EFFECTS_LIST.add(effect);
    }

    public boolean removeEffect(MobEffect effect) {
        return EFFECTS_LIST.remove(effect);
    }

    public void addEffectsToPlayer(LivingEntity player) {
        for(MobEffect effect : EFFECTS_LIST) {
            player.addEffect(new MobEffectInstance(effect, -1, 0, false, false, false));
        }
    }

    public void removeEffectsToPlayer(LivingEntity player) {
        for(MobEffect effect : EFFECTS_LIST) {
            player.removeEffect(effect);
        }
    }
}
