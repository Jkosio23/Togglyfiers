package com.sarahk.togglyfiers.proxy;

import com.sarahk.togglyfiers.Main;
import com.sarahk.togglyfiers.blocks.ModBlocks;
import com.sarahk.togglyfiers.gui.GuiHandler;
import com.sarahk.togglyfiers.items.ModItems;
import com.sarahk.togglyfiers.tileentity.TileEntityTogglyfier;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit()
	{
		MinecraftForge.EVENT_BUS.register(ModBlocks.class);
		MinecraftForge.EVENT_BUS.register(ModItems.class);
	}
	
	public void init()
	{
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());

		GameRegistry.registerTileEntity(TileEntityTogglyfier.class, Main.MODID+":togglyfier");
	}
	
	public void postInit()
	{
		
	}
}