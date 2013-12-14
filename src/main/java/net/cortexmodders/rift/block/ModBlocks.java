package net.cortexmodders.rift.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.cortexmodders.rift.lib.BlockIds;
import net.cortexmodders.rift.manage.Rift;

public class ModBlocks
{
    public static Rift RIFT;
    
    public static void init()
    {
        RIFT = new Rift(BlockIds.RIFT_BLOCK);
    }
    
    public static void registerBlocks()
    {
        GameRegistry.registerBlock(RIFT, "RIFT");
    }
}
