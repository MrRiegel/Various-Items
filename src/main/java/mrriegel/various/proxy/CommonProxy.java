package mrriegel.various.proxy;

import mrriegel.various.CraftingRecipes;
import mrriegel.various.VariousItems;
import mrriegel.various.blocks.ModBlocks;
import mrriegel.various.config.ConfigHandler;
import mrriegel.various.handler.GuiHandler;
import mrriegel.various.items.ModItems;
import mrriegel.various.network.PacketHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		ConfigHandler.refreshConfig(event
				.getSuggestedConfigurationFile());
		PacketHandler.init();
		registerRenderers();
	}

	public void init(FMLInitializationEvent event) {
		NetworkRegistry.INSTANCE.registerGuiHandler(VariousItems.instance,
				new GuiHandler());
		ModBlocks.init();
		ModItems.init();
		CraftingRecipes.init();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}

	public void registerRenderers() {

	}
}