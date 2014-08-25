package com.example.examplemod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TestBlock extends Block {

	protected TestBlock() {
		super(Material.ground);
		setBlockName(ExampleMod.MODID + "_" + "TestBlock");
		setCreativeTab(CreativeTabs.tabBlock);
		setBlockTextureName(ExampleMod.MODID + ":" + "best");
	}
	
	

}
