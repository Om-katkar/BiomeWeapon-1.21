package com.draken_bigbro.biome_weapon;

import com.draken_bigbro.biome_weapon.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiomeWeapon implements ModInitializer {
	public static final String MOD_ID = "biome-weapon";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}