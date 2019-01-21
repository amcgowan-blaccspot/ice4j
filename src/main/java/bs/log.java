package bs;

import java.util.logging.Logger;

public class log {
    public static void info(Logger logger, String msg) {
        logger.info("[FMDB] - " + msg);
    }
    public static void printProperty(Logger logger, String property, String value) {
        log.info(logger, property + ": " + value);
    }
}
