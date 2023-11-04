package net.skycryck.precious.datagen;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.skycryck.precious.PreciousMod;
import net.skycryck.precious.block.ModBlocks;
import net.skycryck.precious.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.Consumer;

//Provide the recipe to the game for all the blocks and items the mod add
public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    //List of all the Mithril items/blocks that you can smelt.
    private static final List<ItemLike> MITHRIL_SMELTABLES = List.of(ModItems.RAW_MITHRIL.get(), ModBlocks.MITHRIL_ORE.get(), ModBlocks.DEEPSLATE_MITHRIL_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(@NotNull Consumer<FinishedRecipe> pWriter) {

        //Temporary recipe for The One, just to test datagen ;)
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.THE_ONE.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("MMM")
                .define('M', ModItems.MITHRIL_INGOT.get())
                .unlockedBy("has_mithril", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.MITHRIL_INGOT.get()).build()))
                .save(pWriter);

        //Mithril Tools :
        //MITHRIL_SWORD
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_SWORD.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .define('S', Items.STICK)
                .pattern(" M ")
                .pattern(" M ")
                .pattern(" S ")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //MITHRIL_PICKAXE
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_PICKAXE.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .define('S', Items.STICK)
                .pattern("MMM")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //MITHRIL_AXE
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_AXE.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .define('S', Items.STICK)
                .pattern("MM ")
                .pattern("MS ")
                .pattern(" S ")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //MITHRIL_SHOVEL
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_SHOVEL.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .define('S', Items.STICK)
                .pattern(" M ")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //MITHRIL_HOE
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_HOE.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .define('S', Items.STICK)
                .pattern("MM ")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //Mithril Armor
        //MITHRIL_HELMET
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_HELMET.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("   ")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //MITHRIL_CHESTPLATE
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_CHESTPLATE.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .pattern("M M")
                .pattern("MMM")
                .pattern("MMM")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //MITHRIL_LEGGINGS
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_LEGGINGS.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .pattern("MMM")
                .pattern("M M")
                .pattern("M M")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //MITHRIL_BOOTS
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.MITHRIL_BOOTS.get())
                .define('M', ModItems.MITHRIL_INGOT.get())
                .pattern("   ")
                .pattern("M M")
                .pattern("M M")
                .unlockedBy("has_mithril", has(ModItems.MITHRIL_INGOT.get()))
                .save(pWriter);

        //Mithril Blocks
        //Mithril Slab
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHRIL_SLAB.get(), 6)
                .define('#', ModItems.MITHRIL_INGOT.get())
                .pattern("###")
                .unlockedBy("has_mithril", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.MITHRIL_INGOT.get()).build()))
                .save(pWriter);

        //Mithril Stairs
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MITHRIL_STAIRS.get(), 4)
                .define('#', ModItems.MITHRIL_INGOT.get())
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .unlockedBy("has_mithril", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.MITHRIL_INGOT.get()).build()))
                .save(pWriter);

        //Pre-made recipe 9 ingots (Mithril Ingot) into 1 block (Mithril Block).
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), RecipeCategory.MISC, ModBlocks.MITHRIL_BLOCK.get(),
                "precious:mithril_ingot", "mithril",
                "precious:mithril_block", "mithril");

        //Pre-made recipe 9 raw (Raw Mithril) into 1 block (Raw Mithril Block).
        nineBlockStorageRecipes(pWriter, RecipeCategory.MISC, ModItems.RAW_MITHRIL.get(), RecipeCategory.MISC, ModBlocks.RAW_MITHRIL_BLOCK.get(),
                "precious:raw_mithril", "mithril",
                "precious:raw_mithril_block", "mithril");

        //Build a smelting recipe for Raw Mithril
        oreSmelting(pWriter, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 0.5f, 300, "mithril");

        //Build a blasting recipe for Raw Mithril
        oreBlasting(pWriter, MITHRIL_SMELTABLES, RecipeCategory.MISC, ModItems.MITHRIL_INGOT.get(), 0.5f, 150, "mithril");
    }

    protected static void oreSmelting(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult,
                                      float pExperience, int pCookingTIme, @NotNull String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult,
                                      float pExperience, int pCookingTime, @NotNull String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(@NotNull Consumer<FinishedRecipe> pFinishedRecipeConsumer, @NotNull RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer,
                                     List<ItemLike> pIngredients, @NotNull RecipeCategory pCategory, @NotNull ItemLike pResult, float pExperience, int pCookingTime, @NotNull String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime,
                            pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, PreciousMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

}