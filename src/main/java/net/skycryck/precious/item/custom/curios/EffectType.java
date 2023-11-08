package net.skycryck.precious.item.custom.curios;

import net.minecraft.world.effect.MobEffect;

public class EffectType {
    private final MobEffect effect;
    private final int amplifier;

    public EffectType(MobEffect effect, int amplifier) {
        this.effect = effect;
        this.amplifier = amplifier;
    }

    public EffectType(MobEffect effect) {
        this.effect = effect;
        this.amplifier = 0;
    }

    public int getAmplifier() {
        return amplifier;
    }

    public MobEffect getEffect() {
        return effect;
    }
}
