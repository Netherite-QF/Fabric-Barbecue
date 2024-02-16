package com.netheriteqf.barbecue;

import com.netheriteqf.barbecue.registry.FBBQBlocks;
import com.netheriteqf.barbecue.registry.FBBQEntityTypes;
import com.netheriteqf.barbecue.registry.FBBQItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FBBQMod implements ModInitializer {
	public final static String MODID = "fabric_barbecue";
	public static final Logger LOGGER = LoggerFactory.getLogger(FBBQMod.class);

	@Override
	public void onInitialize() {
		FBBQItems.registerModItems();
		FBBQBlocks.registerModBlocks();
		FBBQEntityTypes.registerModEntityTypes();
		LOGGER.info("Hello World");
	}

	public static Identifier asID(String id){
		return new Identifier(MODID, id);
	}
}