package com.netheriteqf.barbecue.registry;

import com.netheriteqf.barbecue.FBBQMod;
import com.netheriteqf.barbecue.blockentities.GrillBlockEntity;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class FBBQBlockEntity implements ModInitializer{
    public static BlockEntityType<GrillBlockEntity> GRILL_BLOCK_ENTITY;

    public static final void FBBQBlockEntity() {
        GRILL_BLOCK_ENTITY = Registry.register(Registries.BLOCK_ENTITY_TYPE, new Identifier(FBBQMod.MODID, "grill_block_entity"),
        FabricBlockEntityTypeBuilder.create(GrillBlockEntity::new, FBBQBlock.GRILL)
        .build()       
        );
    }

    @Override
    public void onInitialize() {
    }    
}
