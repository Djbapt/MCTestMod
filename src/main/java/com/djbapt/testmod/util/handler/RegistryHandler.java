package com.djbapt.testmod.util.handler;

import com.djbapt.testmod.init.ModBlocks;
import com.djbapt.testmod.init.ModItems;
import com.djbapt.testmod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistryHandler {

	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Item i : ModItems.ITEMS) {
			if(i instanceof IHasModel) {
				((IHasModel) i).registerModels();
			}
		}
		
		for(Block b : ModBlocks.BLOCKS) {
			if(b instanceof IHasModel) {
				((IHasModel) b).registerModels();
			}
		}
	}
}
