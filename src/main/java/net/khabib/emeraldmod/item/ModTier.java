package net.khabib.emeraldmod.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class ModTier {
    // Определяем нашу кастомную Tier для меча изумруда
    public static final Tier EMERALD = new Tier() {
        // Устанавливаем характеристики нашего меча изумруда
        @Override
        public int getUses() {
            return 4000; // Примерно как у железа
        }

        @Override
        public float getSpeed() {
            return 5.0F; // Примерно как у железа
        }

        @Override
        public float getAttackDamageBonus() {
            return 3.0F; // Лучше чем алмаз
        }

        @Override
        public int getLevel() {
            return 3; // Уровень в инвентаре
        }

        @Override
        public int getEnchantmentValue() {
            return 10; // Уровень зачарования
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.of(Items.EMERALD); // Материал для починки
        }
    };
}
