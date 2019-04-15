package com.djbapt.testmod;

import static com.djbapt.testmod.util.Reference.CLIENT_PROXY_CLASS;
import static com.djbapt.testmod.util.Reference.COMMON_PROXY_CLASS;
import static com.djbapt.testmod.util.Reference.MOD_ID;
import static com.djbapt.testmod.util.Reference.NAME;
import static com.djbapt.testmod.util.Reference.VERSION;

import com.djbapt.testmod.init.ModSmelting;
import com.djbapt.testmod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=MOD_ID, name=NAME, version=VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide=CLIENT_PROXY_CLASS, serverSide=COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModSmelting.init();
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
