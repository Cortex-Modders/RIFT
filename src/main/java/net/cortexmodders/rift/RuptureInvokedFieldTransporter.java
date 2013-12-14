package net.cortexmodders.rift;

import net.cortexmodders.rift.lib.RIFTModInfo;
import net.cortexmodders.rift.proxy.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = RIFTModInfo.MOD_ID, name = RIFTModInfo.MOD_NAME, version = RIFTModInfo.MOD_VERSION, useMetadata = true)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = {"RIFT"})//, packetHandler = PacketHandler.class)
public class RuptureInvokedFieldTransporter
{

    @Instance
    public static RuptureInvokedFieldTransporter instance;
    
    @SidedProxy(clientSide = RIFTModInfo.CLIENT_PROXY, serverSide = RIFTModInfo.COMMON_PROXY)
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        
    }
    
}
