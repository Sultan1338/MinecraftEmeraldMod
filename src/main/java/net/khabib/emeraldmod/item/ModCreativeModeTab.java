package net.khabib.emeraldmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab EMERALDMOD_TAB = new CreativeModeTab("emeraldmodtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.EXCELSIOR.get());
        }
    };
}
