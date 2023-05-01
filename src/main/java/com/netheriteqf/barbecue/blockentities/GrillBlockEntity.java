package com.netheriteqf.barbecue.blockentities;

import com.netheriteqf.barbecue.registry.FBBQBlock;
import com.netheriteqf.barbecue.registry.FBBQBlockEntity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class GrillBlockEntity extends BlockEntity{

    public GrillBlockEntity(BlockPos pos, BlockState state) {
        super(FBBQBlockEntity.GRILL_BLOCK_ENTITY, pos, state);
    }
}
