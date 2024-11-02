package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public abstract class WorldGenAbstractTree extends WorldGenerator
{
    public WorldGenAbstractTree(boolean notify)
    {
        super(notify);
    }

    protected boolean func_150523_a(Block p_150523_1_)
    {
        Material material = p_150523_1_.getMaterial();
        return material == Material.air || material == Material.leaves || p_150523_1_ == Blocks.grass || p_150523_1_ == Blocks.dirt || p_150523_1_ == Blocks.log || p_150523_1_ == Blocks.log2 || p_150523_1_ == Blocks.sapling || p_150523_1_ == Blocks.vine;
    }

    public void func_180711_a(World worldIn, Random p_180711_2_, BlockPos p_180711_3_)
    {
    }

    protected void func_175921_a(World worldIn, BlockPos pos)
    {
        if (worldIn.getBlockState(pos).getBlock() != Blocks.dirt)
        {
            this.setBlockAndNotifyAdequately(worldIn, pos, Blocks.dirt.getDefaultState());
        }
    }
}