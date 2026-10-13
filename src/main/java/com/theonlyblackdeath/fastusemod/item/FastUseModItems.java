package com.theonlyblackdeath.fastusemod.item;

import com.theonlyblackdeath.fastusemod.FastUseMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class FastUseModItems {
    public static final Item ENDER_PEARL = register("ender_pearl", new FastUseItem(new Item.Properties()));
    public static final Item WIND_CHARGE = register("wind_charge", new FastUseItem(new Item.Properties()));
    public static final Item SNOWBALL = register("snowball", new FastUseItem(new Item.Properties()));
    public static final Item EGG = register("egg", new FastUseItem(new Item.Properties()));
    public static final Item SPLASH_POTION = register("splash_potion", new FastUseItem(new Item.Properties()));
    public static final Item LINGERING_POTION = register("lingering_potion", new FastUseItem(new Item.Properties()));
    public static final Item EXPERIENCE_BOTTLE = register("experience_bottle", new FastUseItem(new Item.Properties()));

    private static Item register(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(FastUseMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        FastUseMod.LOGGER.info("Registering FastUseMod Items");
    }
}
