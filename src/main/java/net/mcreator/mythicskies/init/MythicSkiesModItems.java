
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicskies.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.mythicskies.MythicSkiesMod;

public class MythicSkiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MythicSkiesMod.MODID);
	public static final RegistryObject<Item> SITARA_WYVERN_SPAWN_EGG = REGISTRY.register("sitara_wyvern_spawn_egg", () -> new ForgeSpawnEggItem(MythicSkiesModEntities.SITARA_WYVERN, -1, -1, new Item.Properties()));
}
