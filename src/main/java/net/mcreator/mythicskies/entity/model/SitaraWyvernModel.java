package net.mcreator.mythicskies.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.mythicskies.entity.SitaraWyvernEntity;

public class SitaraWyvernModel extends GeoModel<SitaraWyvernEntity> {
	@Override
	public ResourceLocation getAnimationResource(SitaraWyvernEntity entity) {
		return new ResourceLocation("mythic_skies", "animations/sitara_female2.0.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SitaraWyvernEntity entity) {
		return new ResourceLocation("mythic_skies", "geo/sitara_female2.0.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SitaraWyvernEntity entity) {
		return new ResourceLocation("mythic_skies", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(SitaraWyvernEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("gHead");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
