package net.skycryck.precious.datagen;

import net.skycryck.precious.PreciousMod;
import net.skycryck.precious.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, PreciousMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.MITHRIL_INGOT);
        simpleItem(ModItems.RAW_MITHRIL);
        simpleItem(ModItems.RAW_MITHRIL_ALLOY);

        simpleItem(ModItems.THE_ONE);
        simpleItem(ModItems.TALARIA_SHOES);

        handheldItem(ModItems.MITHRIL_SWORD);
        handheldItem(ModItems.MITHRIL_PICKAXE);
        handheldItem(ModItems.MITHRIL_AXE);
        handheldItem(ModItems.MITHRIL_SHOVEL);
        handheldItem(ModItems.MITHRIL_HOE);
        handheldItem(ModItems.MITHRIL_PAXEL);

        simpleItem(ModItems.MITHRIL_HELMET);
        simpleItem(ModItems.MITHRIL_CHESTPLATE);
        simpleItem(ModItems.MITHRIL_LEGGINGS);
        simpleItem(ModItems.MITHRIL_BOOTS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(PreciousMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(PreciousMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}