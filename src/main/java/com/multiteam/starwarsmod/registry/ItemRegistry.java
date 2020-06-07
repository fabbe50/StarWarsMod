package com.multiteam.starwarsmod.registry;

import com.multiteam.starwarsmod.Reference;
import com.multiteam.starwarsmod.StarWarsMod;
import com.multiteam.starwarsmod.StarWarsGroup;
import com.multiteam.starwarsmod.items.ItemBase;
import com.multiteam.starwarsmod.items.ItemLaserGun;
import com.multiteam.starwarsmod.items.ItemLightSaber;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabbe on 09/12/2017 - 1:09 AM.
 */
public class ItemRegistry {
    private static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Reference.MOD_ID);

    public static final RegistryObject<Item> KYBER_CRYSTAL_BLUE = ITEMS.register("kybercrystal_blue", () -> new BlockItem(BlockRegistry.KYBER_CRYSTAL_BLUE.get(), new Item.Properties().group(StarWarsGroup.group)));
    public static final RegistryObject<Item> KYBER_CRYSTAL_GREEN = ITEMS.register("kybercrystal_green", () -> new BlockItem(BlockRegistry.KYBER_CRYSTAL_BLUE.get(), new Item.Properties().group(StarWarsGroup.group)));
    public static final RegistryObject<Item> KYBER_CRYSTAL_PURPLE = ITEMS.register("kybercrystal_purple", () -> new BlockItem(BlockRegistry.KYBER_CRYSTAL_BLUE.get(), new Item.Properties().group(StarWarsGroup.group)));
    public static final RegistryObject<Item> KYBER_CRYSTAL_RED = ITEMS.register("kybercrystal_red", () -> new BlockItem(BlockRegistry.KYBER_CRYSTAL_BLUE.get(), new Item.Properties().group(StarWarsGroup.group)));
    public static final RegistryObject<Item> SOLAR_GENERATOR = ITEMS.register("solar_generator", () -> new BlockItem(BlockRegistry.SOLAR_GENERATOR.get(), new Item.Properties().group(StarWarsGroup.group)));

    public static final RegistryObject<Item> LIGHT_SABER_BLUE = ITEMS.register("lightsaber_blue", () -> new ItemLightSaber(ItemTier.DIAMOND, 4, -2.4F, (new Item.Properties().group(StarWarsGroup.group))));
    public static final RegistryObject<Item> LIGHT_SABER_GREEN = ITEMS.register("lightsaber_green", () -> new ItemLightSaber(ItemTier.DIAMOND, 4, -2.4F, (new Item.Properties().group(StarWarsGroup.group))));
    public static final RegistryObject<Item> LIGHT_SABER_PURPLE = ITEMS.register("lightsaber_purple", () -> new ItemLightSaber(ItemTier.DIAMOND, 4, -2.4F, (new Item.Properties().group(StarWarsGroup.group))));
    public static final RegistryObject<Item> LIGHT_SABER_RED = ITEMS.register("lightsaber_red", () -> new ItemLightSaber(ItemTier.DIAMOND, 4, -2.4F, (new Item.Properties().group(StarWarsGroup.group))));

    public ItemRegistry() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
