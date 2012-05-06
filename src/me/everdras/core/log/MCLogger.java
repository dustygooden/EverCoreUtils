/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.everdras.core.log;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joshua
 */
public class MCLogger {

    private static final Logger log = Logger.getLogger("Minecraft");
    private static String PREFIX;
    private static boolean DEBUGGING;

    public MCLogger() {
        PREFIX = "";
        DEBUGGING = false;
    }

    public MCLogger(String prefix) {
        PREFIX = prefix;
        DEBUGGING = false;
    }

    public void setDebugging(boolean debugging) {
        DEBUGGING = debugging;
    }

    public static void logAssert(boolean bool, String desc) {
        if (!bool) {
            logDebug("WARNING: ASSERTION FAILED: " + desc);
        }
    }

    public static void logSevere(String msg) {
        log.log(Level.SEVERE, "[MCTowns]: " + msg);
    }

    public static void logInfo(String msg) {
        log.log(Level.INFO, "[MCTowns]: " + msg);
    }

    public static void logDebug(String msg) {
        if (DEBUGGING) {
            logInfo("[DEBUG]:" + msg);
        }
    }
}
