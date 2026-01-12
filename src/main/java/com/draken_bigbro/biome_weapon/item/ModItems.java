package com.draken_bigbro.biome_weapon.item;

import com.draken_bigbro.biome_weapon.BiomeWeapon;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item FLAME_GEM = registerItem("flame_gem", new Item(new Item.Settings()));
    public static final Item FROST_GEM = registerItem("frost_gem", new Item(new Item.Settings()));

    private static Item registerItem(String name , Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BiomeWeapon.MOD_ID, name),item );
    }


    public static void registerModItems(){
        BiomeWeapon.LOGGER.info("Registering Mod Items for"+ BiomeWeapon.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(FLAME_GEM);
            entries.add(FROST_GEM);
        } );
    }
}
