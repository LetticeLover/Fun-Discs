package com.risingbread.fundiscs;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

import static com.risingbread.fundiscs.FunDiscs.*;

public class DiscRecipeProvider extends RecipeProvider {
    public DiscRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        // FUN DISC RECIPES
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MERRY_GO_ROUND_DISC)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', FUN_DISC_SHARD)
                .define('#', Items.BLUE_ORCHID)
                .group("Fun Discs")
                .unlockedBy("has_fun_disc_shard", has(FUN_DISC_SHARD))
                .save(output);

        // VANILLA DISC RECIPES
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_STAL)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.WITHER_ROSE)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_STRAD)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.WHITE_TULIP)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_CHIRP)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.POPPY)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_BLOCKS)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.ORANGE_TULIP)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_MALL)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.ALLIUM)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_MELLOHI)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.PEONY)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_WAIT)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.CORNFLOWER)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_OTHERSIDE)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.CHORUS_FRUIT)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_CAT)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.DANDELION)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_FAR)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.AZURE_BLUET)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_WARD)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.MOSS_BLOCK)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_11)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.OBSIDIAN)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Items.MUSIC_DISC_13)
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .define('X', VANILLA_DISC_SHARD)
                .define('#', Items.OXEYE_DAISY)
                .group("Vanilla Discs")
                .unlockedBy("has_vanilla_disc_shard", has(VANILLA_DISC_SHARD))
                .save(output);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(
                event.includeServer(),
                new DiscRecipeProvider(output, lookupProvider)
        );
    }
}

