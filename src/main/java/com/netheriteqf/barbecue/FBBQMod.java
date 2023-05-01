package com.netheriteqf.barbecue;

import com.netheriteqf.barbecue.registry.FBBQBlock;
import com.netheriteqf.barbecue.registry.FBBQBlockEntity;
import com.netheriteqf.barbecue.registry.FBBQItem;

import net.fabricmc.api.ModInitializer;

public class FBBQMod implements ModInitializer {
	public static String MODID = "fabric_barbecue";

	@Override
	public void onInitialize() {
		FBBQItem.FBBQItem();
		FBBQBlock.FBBQBlock();
		FBBQBlockEntity.FBBQBlockEntity();
	}
}