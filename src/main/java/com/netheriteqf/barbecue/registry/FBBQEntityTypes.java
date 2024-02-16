package com.netheriteqf.barbecue.registry;

import com.netheriteqf.barbecue.FBBQMod;
import com.netheriteqf.barbecue.blockentities.GrillBlockEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class FBBQEntityTypes {
    public static final BlockEntityType<GrillBlockEntity> GRILL_BLOCK_ENTITY = Registry.register(
            Registries.BLOCK_ENTITY_TYPE,
            FBBQMod.asID("grill_block_entity"),
            FabricBlockEntityTypeBuilder.create(GrillBlockEntity::new, FBBQBlocks.GRILL_BLOCK).build());

    public static void registerModEntityTypes(){
        FBBQMod.LOGGER.debug("Registering Mod EntityTypes For" + FBBQMod.MODID);
    }
}
