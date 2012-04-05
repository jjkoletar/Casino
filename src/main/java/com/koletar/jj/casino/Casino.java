package com.koletar.jj.casino;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author jjkoletar
 */
public class Casino extends JavaPlugin {
    private CasinoLogger logger = CasinoLogger.getInstance();
    public void onEnable() {
        logger.info("Casino enabled!");
    }
}
