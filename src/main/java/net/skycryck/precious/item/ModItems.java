package net.skycryck.precious.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.skycryck.precious.PreciousMod;
import net.skycryck.precious.item.custom.*;
import net.skycryck.precious.item.custom.curios.*;
import net.skycryck.precious.item.custom.curios.quiver.QuiverItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PreciousMod.MOD_ID);

    public static final RegistryObject<Item> THE_ONE = ITEMS.register("the_one",
            () -> new TheOneItem(new Item.Properties().fireResistant().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> TALARIA_SHOES = ITEMS.register("talaria_shoes",
            () -> new TalariaShoesItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> GOLD_RING = ITEMS.register("gold_ring",
            () -> new GoldRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> MITHRIL_RING = ITEMS.register("mithril_ring",
            () -> new MithrilRingItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> GOLD_AMULET = ITEMS.register("gold_amulet",
            () -> new GoldAmuletItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> MITHRIL_AMULET = ITEMS.register("mithril_amulet",
            () -> new MithrilAmuletItem(new Item.Properties().stacksTo(1).rarity(Rarity.RARE)));

    public static final RegistryObject<Item> TOOL_BELT = ITEMS.register("tool_belt",
            () -> new ToolBeltItem(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> QUIVER = ITEMS.register("quiver",
            () -> new QuiverItem(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON)));

    public static final RegistryObject<Item> GOLD_CHAIN = ITEMS.register("gold_chain",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_CHAIN = ITEMS.register("mithril_chain",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MITHRIL = ITEMS.register("raw_mithril",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_MITHRIL_ALLOY = ITEMS.register("raw_mithril_alloy",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new ArmorItem(ModArmorMaterials.MITHRIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ModToolTiers.MITHRIL, 3,-2.4F, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ModToolTiers.MITHRIL, 1,-2.8F, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ModToolTiers.MITHRIL, 5.0F,-3.0F, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ModToolTiers.MITHRIL, 1.5F,-3.0F, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ModToolTiers.MITHRIL, -4,0.0F, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> MITHRIL_PAXEL = ITEMS.register("mithril_paxel",
            () -> new PaxelItem(ModToolTiers.MITHRIL, 3,-2.4F, new Item.Properties().durability(256)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
