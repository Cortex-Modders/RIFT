package net.cortexmodders.rift.proxy;

import net.cortexmodders.rift.block.ModBlocks;

public class CommonProxy
{

    public void setupBlocks()
    {
       ModBlocks.init();
       ModBlocks.registerBlocks();
    }
    
    public void setupItems()
    {
        
    }
}
