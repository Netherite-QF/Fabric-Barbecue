package com.netheriteqf.barbecue.registry;

import com.netheriteqf.barbecue.FBBQMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;

public class FBBQItems {
    public static final Item GRILL = registerItems("grill", new BlockItem(FBBQBlocks.GRILL_BLOCK, new Item.Settings()));

    private static Item registerItems(String id, Item item){
        return Items.register(FBBQMod.asID(id), item);
    }

    public static void registerModItems(){
        FBBQMod.LOGGER.debug("Registering Mod Items For" + FBBQMod.MODID);
    }
}
