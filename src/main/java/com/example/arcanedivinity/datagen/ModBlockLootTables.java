package com.example.arcanedivinity.datagen;

import com.example.arcanedivinity.block.ModBlocks;
import com.example.arcanedivinity.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ARCANIUM_BLOCK.get());
        add(ModBlocks.ARCANIUM_ORE_BLOCK.get(),
                (block) -> createOreDrop(ModBlocks.ARCANIUM_ORE_BLOCK.get(), ModItems.RAW_ARCANIUM_ORE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
