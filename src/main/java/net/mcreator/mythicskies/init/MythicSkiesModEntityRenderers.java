
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mythicskies.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.mythicskies.client.renderer.SitaraWyvernRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MythicSkiesModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MythicSkiesModEntities.SITARA_WYVERN.get(), SitaraWyvernRenderer::new);
	}
}
