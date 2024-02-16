package com.netheriteqf.barbecue.blocks;

import com.netheriteqf.barbecue.blockentities.GrillBlockEntity;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.Nullable;

public class GrillBlock extends BlockWithEntity {

    public GrillBlock(Settings settings) {
        super(settings);
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GrillBlockEntity(pos, state);
    }
}
