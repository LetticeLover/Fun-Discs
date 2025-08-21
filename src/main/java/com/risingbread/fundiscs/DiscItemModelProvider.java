package com.risingbread.fundiscs;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

public class DiscItemModelProvider extends ItemModelProvider {
    public DiscItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, FunDiscs.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(FunDiscs.FUN_DISC_SHARD.get());
        basicItem(FunDiscs.VANILLA_DISC_SHARD.get());
        basicItem(FunDiscs.MERRY_GO_ROUND_DISC.get());
    }

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(
                event.includeClient(),
                new DiscItemModelProvider(output, existingFileHelper)
        );
    }
}
