package com.theonlyblackdeath.fastusemod.config;

import com.theonlyblackdeath.fastusemod.FastUseMod;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.KeyMapping;
import org.lwjgl.glfw.GLFW;

public class FastUseModConfig {
    public static KeyMapping activationKey;
    public static boolean holdModeEnabled = true;
    public static boolean toggleModeEnabled = false;
    public static boolean smartModeEnabled = false;
    public static int useDelay = 0;

    public static void registerKeyBindings() {
        activationKey = KeyBindingHelper.registerKeyBinding(new KeyMapping(
                "key.fastusemod.activation",
                GLFW.GLFW_KEY_R,
                "category.fastusemod.keybindings"
        ));
        FastUseMod.LOGGER.info("Registered FastUseMod Key Bindings");
    }
}
