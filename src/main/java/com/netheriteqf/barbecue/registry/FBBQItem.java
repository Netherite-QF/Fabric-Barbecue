package com.netheriteqf.barbecue.registry;

import com.netheriteqf.barbecue.FBBQMod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FBBQItem implements ModInitializer{
    public static Item BOTTLE_OF_VEGETABLE_OIL;

    public static final void FBBQItem() {
        BOTTLE_OF_VEGETABLE_OIL = Registry.register(Registries.ITEM,
        new Identifier(FBBQMod.MODID, "bottle_of_vegetable"),
        new Item(new FabricItemSettings()));
    }

    @Override
    public void onInitialize() {

    }
}
