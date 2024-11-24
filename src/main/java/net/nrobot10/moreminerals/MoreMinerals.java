package net.nrobot10.moreminerals;

import net.fabricmc.api.ModInitializer;

import net.nrobot10.moreminerals.block.ModBlocks;
import net.nrobot10.moreminerals.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreMinerals implements ModInitializer {
	public static final String MOD_ID = "moreminerals";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Starting Mod: " + MoreMinerals.MOD_ID);
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}