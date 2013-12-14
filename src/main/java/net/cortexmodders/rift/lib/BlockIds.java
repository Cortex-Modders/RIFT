package net.cortexmodders.rift.lib;

import net.minecraftforge.common.Configuration;

public class BlockIds
{

    public static int RIFT_BLOCK;
    
    public static int RIFT_BLOCK_DEFAULT = 765;
    
    public static void init(Configuration config)
    {
        RIFT_BLOCK = config.getBlock("blocks", "rift", RIFT_BLOCK_DEFAULT).getInt();
    }

}
