package adapter.examples;


/**
 * Created by Chalauri-G on 9/24/2017.
 */
public class LoggerImpl implements Logger {

    @Override
    public void debug(String message) {
        System.out.println("DEBUG : I am debug method");
        System.out.println("DEBUG : " + message);
    }

    @Override
    public void trace(String message) {
        System.out.println("TRACE : I am trace method");
        System.out.println("TRACE : " + message);
    }

    @Override
    public void log(String message) {
        System.out.println("LOG : I am log method");
        System.out.println("LOG : " + message);
    }
}
