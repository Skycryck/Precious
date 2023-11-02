package net.skycryck.precious.datagen.loot;

import net.skycryck.precious.block.ModBlocks;
import net.skycryck.precious.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //When a Mithril Block is destroyed, a Mithril Block is dropped.
        this.dropSelf(ModBlocks.MITHRIL_BLOCK.get());

        //When a Mithril Ore is destroyed, some Raw Mithril are dropped.
        this.add(ModBlocks.MITHRIL_ORE.get(),
                block -> createOreDrop(ModBlocks.MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));

        //When a Deepslate Mithril Ore is destroyed, some Raw Mithril are dropped.
        this.add(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_MITHRIL_ORE.get(), ModItems.RAW_MITHRIL.get()));
    }

    //Get all the blocks created from ModBlocks, every block from ModBlocks need to be added above.
    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}