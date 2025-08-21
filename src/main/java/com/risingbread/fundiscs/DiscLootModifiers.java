package com.risingbread.fundiscs;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.IGlobalLootModifier;
import net.neoforged.neoforge.common.loot.LootModifier;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.function.Supplier;

public class DiscLootModifiers {
    public static final DeferredRegister<MapCodec<? extends IGlobalLootModifier>> GLOBAL_LOOT_MODIFIER_SERIALIZERS =
            DeferredRegister.create(NeoForgeRegistries.GLOBAL_LOOT_MODIFIER_SERIALIZERS, FunDiscs.MODID);

    static class FunDiscLootModifier extends LootModifier {
        public static final MapCodec<DiscLootModifiers.FunDiscLootModifier> CODEC = RecordCodecBuilder.mapCodec(inst ->
                LootModifier.codecStart(inst).apply(inst, DiscLootModifiers.FunDiscLootModifier::new)
        );


        public FunDiscLootModifier(LootItemCondition[] conditions) {
            super(conditions);
        }

        @Override
        public MapCodec<? extends IGlobalLootModifier> codec() {
            return CODEC;
        }

        @Override
        protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
            generatedLoot.add(new ItemStack(FunDiscs.FUN_DISC_SHARD.get()));
            return generatedLoot;
        }
    }
    static class VanillaDiscLootModifier extends LootModifier {
        public static final MapCodec<DiscLootModifiers.VanillaDiscLootModifier> CODEC = RecordCodecBuilder.mapCodec(inst ->
                LootModifier.codecStart(inst).apply(inst, DiscLootModifiers.VanillaDiscLootModifier::new)
        );


        public VanillaDiscLootModifier(LootItemCondition[] conditions) {
            super(conditions);
        }

        @Override
        public MapCodec<? extends IGlobalLootModifier> codec() {
            return CODEC;
        }

        @Override
        protected ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
            generatedLoot.add(new ItemStack(FunDiscs.VANILLA_DISC_SHARD.get()));
            return generatedLoot;
        }
    }

    public static void register(IEventBus eventBus) {
        final Supplier<MapCodec<DiscLootModifiers.VanillaDiscLootModifier>> VANILLA_DISC_LOOT_MODIFIER =
                GLOBAL_LOOT_MODIFIER_SERIALIZERS.register("vanilla_disc_shards", () -> DiscLootModifiers.VanillaDiscLootModifier.CODEC);
        final Supplier<MapCodec<DiscLootModifiers.FunDiscLootModifier>> FUN_DISC_LOOT_MODIFIER =
                GLOBAL_LOOT_MODIFIER_SERIALIZERS.register("fun_disc_shards", () -> DiscLootModifiers.FunDiscLootModifier.CODEC);
        GLOBAL_LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}
