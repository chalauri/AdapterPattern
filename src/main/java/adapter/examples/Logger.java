package adapter.examples;

/**
 * Created by Chalauri-G on 9/24/2017.
 */
public interface Logger {

    void debug(String message);
    void trace(String message);
    void log(String message);

    static Logger create(){
        //return new LoggerImpl();
        return new ApacheCommonsLogAdapter();
    }
}
