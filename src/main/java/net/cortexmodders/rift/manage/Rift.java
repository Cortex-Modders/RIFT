package net.cortexmodders.rift.manage;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Rift extends BlockContainer
{

    public BlockContainer emulatingBlock;
    
    private static String tileClass = "";
    
    public Rift(int id)
    {
        super(id, Material.rock);
    }

    @Override
    public TileEntity createNewTileEntity(World world)
    {
        return emulatingBlock.createNewTileEntity(world);
    }

    @Override
    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8, int par9)
    {
        return par9;
    }
}
