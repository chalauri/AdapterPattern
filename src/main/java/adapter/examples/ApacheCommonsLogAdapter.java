package adapter.examples;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.impl.Log4JLogger;

/**
 * Created by Chalauri-G on 9/24/2017.
 */
public class ApacheCommonsLogAdapter implements Logger {

    private Log logger = new Log4JLogger();

    @Override
    public void debug(String message) {
        System.out.println("DEBUG FROM ADAPTER");
        logger.debug(message);
    }

    @Override
    public void trace(String message) {
        System.out.println("TRACE FROM ADAPTER");
        logger.trace(message);
    }

    @Override
    public void log(String message) {
        System.out.println("LOG FROM ADAPTER");
        logger.info(message);
    }
}
