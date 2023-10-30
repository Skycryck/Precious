package net.skycryck.precious.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skycryck.precious.PreciousMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PreciousMod.MOD_ID);

    public static final RegistryObject<Item> THE_ONE = ITEMS.register("the_one",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
