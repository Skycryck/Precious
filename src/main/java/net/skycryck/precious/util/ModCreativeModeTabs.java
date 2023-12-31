package net.skycryck.precious.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.skycryck.precious.PreciousMod;
import net.skycryck.precious.block.ModBlocks;
import net.skycryck.precious.item.ModItems;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PreciousMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PRECIOUS_TAB = CREATIVE_MODE_TABS.register("precious_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.THE_ONE.get()))
                    .title(Component.translatable("creativetab.precious"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.THE_ONE.get());
                        output.accept(ModItems.TALARIA_SHOES.get());
                        output.accept(ModItems.GOLD_RING.get());
                        output.accept(ModItems.MITHRIL_RING.get());
                        output.accept(ModItems.GOLD_AMULET.get());
                        output.accept(ModItems.MITHRIL_AMULET.get());
                        output.accept(ModItems.TOOL_BELT.get());
                        output.accept(ModItems.QUIVER.get());
                        output.accept(ModBlocks.MITHRIL_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_MITHRIL_ORE.get());
                        output.accept(ModItems.RAW_MITHRIL.get());
                        output.accept(ModItems.RAW_MITHRIL_ALLOY.get());
                        output.accept(ModItems.MITHRIL_INGOT.get());
                        output.accept(ModItems.GOLD_CHAIN.get());
                        output.accept(ModItems.MITHRIL_CHAIN.get());
                        output.accept(ModItems.MITHRIL_NUGGET.get());
                        output.accept(ModBlocks.RAW_MITHRIL_BLOCK.get());
                        output.accept(ModBlocks.MITHRIL_BLOCK.get());
                        output.accept(ModBlocks.MITHRIL_STAIRS.get());
                        output.accept(ModBlocks.MITHRIL_SLAB.get());
                        output.accept(ModItems.MITHRIL_SWORD.get());
                        output.accept(ModItems.MITHRIL_PICKAXE.get());
                        output.accept(ModItems.MITHRIL_AXE.get());
                        output.accept(ModItems.MITHRIL_SHOVEL.get());
                        output.accept(ModItems.MITHRIL_HOE.get());
                        output.accept(ModItems.MITHRIL_PAXEL.get());
                        output.accept(ModItems.MITHRIL_HELMET.get());
                        output.accept(ModItems.MITHRIL_CHESTPLATE.get());
                        output.accept(ModItems.MITHRIL_LEGGINGS.get());
                        output.accept(ModItems.MITHRIL_BOOTS.get());
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
