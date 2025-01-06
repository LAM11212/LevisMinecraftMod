package net.levi.levismod.item;

import net.levi.levismod.Levismod;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPotions {

    public static Potion SAKE;

    public static Potion registerPotion(String name) {
        return Registry.register(Registries.POTION, new Identifier(Levismod.MOD_ID, name),
                new Potion(new StatusEffectInstance(StatusEffects.NAUSEA, 500),
                        new StatusEffectInstance(StatusEffects.STRENGTH, 400)));
    }

    public static void registerPotions() {
        SAKE = registerPotion("sake");
    }

    public static ItemStack createSakePotion() {
        ItemStack potion = PotionUtil.setPotion(new ItemStack(Items.POTION), ModPotions.SAKE);
        potion.getOrCreateNbt().putInt("CustomModelData", 1);
        return potion;
    }
}
