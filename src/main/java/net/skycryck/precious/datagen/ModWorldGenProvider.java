package net.skycryck.precious.datagen;

import net.skycryck.precious.PreciousMod;
import net.skycryck.precious.worldgen.ModBiomeModifiers;
import net.skycryck.precious.worldgen.ModConfiguredFeatures;
import net.skycryck.precious.worldgen.ModPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModWorldGenProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
//            .add(Registries.BIOME, ModBiomes::boostrap)
//            .add(Registries.LEVEL_STEM, ModDimensions::bootstrapStem)
//            .add(Registries.DIMENSION_TYPE, ModDimensions::bootstrapType)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, ModBiomeModifiers::bootstrap);

    public ModWorldGenProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(PreciousMod.MOD_ID));
    }
}
