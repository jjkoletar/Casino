package com.koletar.jj.casino;

import java.util.logging.Logger;

/**
 * @author jjkoletar
 */
public class CasinoLogger {
    private static CasinoLogger ourInstance = new CasinoLogger();
    private Logger logger = Logger.getLogger("Minecraft");
    private static String logPrefix = "[Casino] ";
    public static CasinoLogger getInstance() {
        return ourInstance;
    }

    private CasinoLogger() {

    }
    public void info(String info) {
        logger.info(logPrefix + info);
    }
    public void warning(String warn) {
        logger.warning(logPrefix + warn);
    }
    public void severe(String severity) {
        logger.severe(logPrefix + severity);
    }
}
