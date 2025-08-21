package com.risingbread.fundiscs;

import net.minecraft.advancements.critereon.EntityPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.enchantment.effects.AllOf;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class DiscLootModifierProvider extends GlobalLootModifierProvider {
    public DiscLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, FunDiscs.MODID);
    }

    @Override
    protected void start() {
        add(
                "fun_disc_loot_modifier",
                new DiscLootModifiers.FunDiscLootModifier(new LootItemCondition[]{AnyOfCondition.anyOf(
                        AllOfCondition.allOf(
                                LootItemKilledByPlayerCondition.killedByPlayer(),
                                LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().of(EntityType.ENDERMAN)),
                                LootItemRandomChanceCondition.randomChance(0.05f)
                        ),
                        AllOfCondition.allOf(
                                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chest")),
                                LootItemRandomChanceCondition.randomChance(0.025f)
                        )
                ).build()})
        );
        add(
                "vanilla_disc_loot_modifier",
                new DiscLootModifiers.VanillaDiscLootModifier(new LootItemCondition[]{AnyOfCondition.anyOf(
                        AllOfCondition.allOf(
                                LootItemKilledByPlayerCondition.killedByPlayer(),
                                LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.THIS, EntityPredicate.Builder.entity().of(EntityType.CREEPER)),
                                LootItemRandomChanceCondition.randomChance(0.05f)
                        ),
                        AllOfCondition.allOf(
                                LootTableIdCondition.builder(ResourceLocation.withDefaultNamespace("chest")),
                                LootItemRandomChanceCondition.randomChance(0.025f)
                        )
                ).build()})
        );
    }

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        generator.addProvider(event.includeServer(), new DiscLootModifierProvider(output, lookupProvider));
    }
}
