package net.khabib.emeraldmod.block;

import net.khabib.emeraldmod.EmeraldMod;
import net.khabib.emeraldmod.item.ModCreativeModeTab;
import net.khabib.emeraldmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BlOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, EmeraldMod.MOD_ID);

    public static final RegistryObject<Block> ZIRTIT_ORE = registryBlock("zirtit_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f)
                    .requiresCorrectToolForDrops(), UniformInt.of(3, 7)),
                    ModCreativeModeTab.EMERALDMOD_TAB);
    public static final RegistryObject<Block> DEEPSLATE_ZIRTIT_ORE = registryBlock("deepslate_zirtit_ore",
            ()-> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(3f)
                    .requiresCorrectToolForDrops(), UniformInt.of(3,7)),
                    ModCreativeModeTab.EMERALDMOD_TAB);

    public static <T extends Block>RegistryObject<T> registryBlock(String name, Supplier<T> block, CreativeModeTab tab){

        RegistryObject<T> toReturn = BlOCKS.register(name, block);
        registerBlockItem(name,toReturn,tab);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab){
        return ModItems.ITEMS.register(name, ()-> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }


    public static void register(IEventBus eventBus) {
        BlOCKS.register(eventBus);
    }
}
