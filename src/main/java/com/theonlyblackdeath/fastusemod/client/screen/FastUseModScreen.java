package com.theonlyblackdeath.fastusemod.client.screen;

import com.theonlyblackdeath.fastusemod.FastUseMod;
import com.theonlyblackdeath.fastusemod.config.FastUseModConfig;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class FastUseModScreen extends Screen {
    private final Screen parent;

    public FastUseModScreen(Screen parent) {
        super(Component.translatable("config.fastusemod.title"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        addRenderableWidget(Button.builder(Component.translatable("config.fastusemod.hold_mode"), button -> {
            FastUseModConfig.holdModeEnabled = !FastUseModConfig.holdModeEnabled;
            button.setMessage(Component.literal("Hold Mode: " + (FastUseModConfig.holdModeEnabled ? "Enabled" : "Disabled")));
        }).bounds(width / 2 - 100, height / 2 - 30, 200, 20).build());

        addRenderableWidget(Button.builder(Component.translatable("config.fastusemod.toggle_mode"), button -> {
            FastUseModConfig.toggleModeEnabled = !FastUseModConfig.toggleModeEnabled;
            button.setMessage(Component.literal("Toggle Mode: " + (FastUseModConfig.toggleModeEnabled ? "Enabled" : "Disabled")));
        }).bounds(width / 2 - 100, height / 2, 200, 20).build());

        addRenderableWidget(Button.builder(Component.translatable("config.fastusemod.smart_mode"), button -> {
            FastUseModConfig.smartModeEnabled = !FastUseModConfig.smartModeEnabled;
            button.setMessage(Component.literal("Smart Mode: " + (FastUseModConfig.smartModeEnabled ? "Enabled" : "Disabled")));
        }).bounds(width / 2 - 100, height / 2 + 30, 200, 20).build());

        addRenderableWidget(Button.builder(Component.translatable("gui.done"), button -> {
            onClose();
        }).bounds(width / 2 - 100, height / 2 + 60, 200, 20).build());
    }

    @Override
    public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float delta) {
        renderBackground(guiGraphics, mouseX, mouseY, delta);
        super.render(guiGraphics, mouseX, mouseY, delta);
    }

    @Override
    public void onClose() {
        minecraft.setScreen(parent);
    }
}
