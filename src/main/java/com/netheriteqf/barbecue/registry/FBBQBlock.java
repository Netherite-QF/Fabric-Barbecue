package com.netheriteqf.barbecue.registry;

import com.netheriteqf.barbecue.FBBQMod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FBBQBlock implements ModInitializer{
    public static Block GRILL;

    public static final void FBBQBlock() {
        Registry.register(Registries.BLOCK,new Identifier(FBBQMod.MODID, "grill"), GRILL);
        Registry.register(Registries.ITEM, new Identifier(FBBQMod.MODID, "grill"), new BlockItem(GRILL, new FabricItemSettings()));
    }

    @Override
    public void onInitialize() {

    }
}
