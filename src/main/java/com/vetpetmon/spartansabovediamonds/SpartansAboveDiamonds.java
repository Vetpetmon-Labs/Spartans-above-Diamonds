package com.vetpetmon.spartansabovediamonds;

import com.vetpetmon.spartansabovediamonds.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = Constants.modID, name = Constants.modName, version = Constants.version, dependencies = Constants.modDeps, acceptedMinecraftVersions = Constants.mcVer/*, guiFactory = Reference.GuiFactoryClass*/)
public class SpartansAboveDiamonds
{

	@Instance(Constants.modID)
	public static SpartansAboveDiamonds instance;
	
	@SidedProxy(clientSide = Constants.ProxyClientClass, serverSide = Constants.ProxyServerClass)
	public static CommonProxy proxy;

	public static Logger logger;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent ev)
	{
		logger = ev.getModLog();
		logger.info("Initiating SAD");
		
		//ModHelper.preInit();

		proxy.preInit(ev);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent ev)
	{
		//NetworkHandler.init();

		proxy.init(ev);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent ev)
	{

		proxy.postInit(ev);
	}
}
