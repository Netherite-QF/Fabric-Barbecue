package com.netheriteqf.barbecue.blockentities;

import com.netheriteqf.barbecue.registry.FBBQEntityTypes;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class GrillBlockEntity extends BlockEntity {
    public GrillBlockEntity(BlockPos pos, BlockState state) {
        super(FBBQEntityTypes.GRILL_BLOCK_ENTITY, pos, state);
    }
}
