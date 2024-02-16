package com.netheriteqf.barbecue.registry;

import com.netheriteqf.barbecue.FBBQMod;
import com.netheriteqf.barbecue.blocks.GrillBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class FBBQBlocks {
    public static final Block GRILL_BLOCK = registerBlocks("grill", new GrillBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));

    private static Block registerBlocks(String id, Block block){
        return Registry.register(Registries.BLOCK, FBBQMod.asID(id), block);
    }

    public static void registerModBlocks(){
        FBBQMod.LOGGER.debug("Registering Mod Blocks For" + FBBQMod.MODID);
    }
}
