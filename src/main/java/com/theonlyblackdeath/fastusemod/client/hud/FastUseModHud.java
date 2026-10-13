package com.theonlyblackdeath.fastusemod.client.hud;

import com.theonlyblackdeath.fastusemod.FastUseMod;
import com.theonlyblackdeath.fastusemod.config.FastUseModConfig;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;

public class FastUseModHud implements HudRenderCallback {
    @Override
    public void onHudRender(GuiGraphics guiGraphics, float tickDelta) {
        Minecraft client = Minecraft.getInstance();
        if (client.player != null) {
            String mode = "Mode: ";
            if (FastUseModConfig.holdModeEnabled) {
                mode += "Hold";
            } else if (FastUseModConfig.toggleModeEnabled) {
                mode += "Toggle";
            } else if (FastUseModConfig.smartModeEnabled) {
                mode += "Smart";
            }

            guiGraphics.drawString(client.font, Component.literal(mode), 10, 10, 0xFFFFFF);
        }
    }

    public static void registerHud() {
        FastUseMod.LOGGER.info("Registering FastUseMod HUD");
        HudRenderCallback.EVENT.register(new FastUseModHud());
    }
}
