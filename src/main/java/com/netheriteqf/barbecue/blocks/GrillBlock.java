package com.netheriteqf.barbecue.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockEntityProvider;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class GrillBlock extends Block implements BlockEntityProvider{

    public GrillBlock(Settings settings) {
        super(settings);
        //TODO Auto-generated constructor stub
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos arg0, BlockState arg1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createBlockEntity'");
    }
    
}
