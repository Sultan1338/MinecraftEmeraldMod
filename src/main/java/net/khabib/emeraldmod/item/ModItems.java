package net.khabib.emeraldmod.item;

import net.khabib.emeraldmod.EmeraldMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EmeraldMod.MOD_ID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    //WEAPONS AND TOOLS
    public static final RegistryObject<Item> EXCELSIOR = ITEMS.register("excelsior",
            ()-> new Excelsior(ModTier.EMERALD, 4, -2.4F,
                    new Item.Properties().tab(ModCreativeModeTab.EMERALDMOD_TAB).stacksTo(1)));


    //ITEMS
    public static final RegistryObject<Item> ZIRTIT = ITEMS.register("zirtit",()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EMERALDMOD_TAB).stacksTo(64)));
    public static final RegistryObject<Item> RAW_ZIRTIT = ITEMS.register("raw_zirtit",()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EMERALDMOD_TAB).stacksTo(64)));
    public static final RegistryObject<Item> ZIRTIT_SHARD = ITEMS.register("zirtit_shard",()-> new Item(new Item.Properties().tab(ModCreativeModeTab.EMERALDMOD_TAB).stacksTo(64)));
}
