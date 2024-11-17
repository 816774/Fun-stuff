package com.sophia.funstuff.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent CAULIFLOWER = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3F).snack().alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 400, 3), 0.5f).build();
}
