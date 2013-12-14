package net.cortexmodders.rift.block;

import net.cortexmodders.rift.lib.BlockIds;

public class ModBlocks
{
    public static Rift RIFT;
    
    public static void init()
    {
        RIFT = new Rift(BlockIds.RIFT_BLOCK);
    }
}
