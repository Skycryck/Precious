package net.skycryck.precious.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.skycryck.precious.PreciousMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PreciousMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRECIOUS_TAB = CREATIVE_MODE_TABS.register("precious_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.THE_ONE.get()))
                    .title(Component.translatable("creativetab.precious"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.THE_ONE.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
