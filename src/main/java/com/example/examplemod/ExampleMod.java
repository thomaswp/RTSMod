package com.example.examplemod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION, name="RTS")
public class ExampleMod {
    public static final String MODID = "rts";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerBlock(new TestBlock(), TestBlockItem.class, "Test Block");
		//GameRegistry.registerItem(new TestBlockItem(), "Special Block (item)");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    }
}
