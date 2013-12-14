package net.cortexmodders.rift;

import net.cortexmodders.rift.block.ModBlocks;
import net.cortexmodders.rift.lib.BlockIds;
import net.cortexmodders.rift.lib.ItemIds;
import net.cortexmodders.rift.lib.ModInfo;
import net.cortexmodders.rift.proxy.CommonProxy;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION, useMetadata = true)
@NetworkMod(clientSideRequired = true, serverSideRequired = false, channels = {"RIFT"})//, packetHandler = PacketHandler.class)
public class RuptureInvokedFieldTransporter
{

    @Instance
    public static RuptureInvokedFieldTransporter instance;
    
    @SidedProxy(clientSide = ModInfo.CLIENT_PROXY, serverSide = ModInfo.COMMON_PROXY)
    public static CommonProxy proxy;
    
    public static Configuration config;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();
        
        BlockIds.init(config);
        ItemIds.init(config);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModBlocks.init();
        proxy.setupBlocks();
        proxy.setupItems();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
       
    }
    
    
}
