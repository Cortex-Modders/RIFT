package net.cortexmodders.rift.lib;

import net.minecraftforge.common.Configuration;

public class ItemIds
{

    public static int DEBUG_WAND;
    
    public static int DEBUG_WAND_DEFAULT = 1337;
    
    public static void init(Configuration config)
    {
        DEBUG_WAND = config.getBlock("blocks", "rift", DEBUG_WAND_DEFAULT).getInt();
    }
}
