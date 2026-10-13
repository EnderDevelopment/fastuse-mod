package com.theonlyblackdeath.fastusemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FastUseMod implements ModInitializer {
    public static final String MOD_ID = "fastusemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing FastUseMod");
        // Initialize your mod here
    }
}
