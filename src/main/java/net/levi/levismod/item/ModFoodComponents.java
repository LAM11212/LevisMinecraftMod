package net.levi.levismod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RAMEN = new FoodComponent.Builder().hunger(5).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 200), 0.50f).build();
    public static final FoodComponent WEED = new FoodComponent.Builder().hunger(1).saturationModifier(0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 800), 1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 1000), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 800), 0.8f).build();

    public static final FoodComponent JOINT = new FoodComponent.Builder().hunger(5).saturationModifier(.50f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2000, 2), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2000, 3), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 1000), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOW_FALLING, 500), 1.0f).build();
}
