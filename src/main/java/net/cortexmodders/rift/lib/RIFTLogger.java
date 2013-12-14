package net.cortexmodders.rift.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

import cpw.mods.fml.common.FMLLog;

public class RIFTLogger
{

    private static Logger logger = Logger.getLogger(ModInfo.MOD_ID);

    public static void init()
    {
        logger.setParent(FMLLog.getLogger());
    }

    public static void log(Level parLevel, String parString)
    {
        logger.log(parLevel, parString);
    }
    
    public static void info(String parString)
    {
        logger.info(parString);
    }
}
