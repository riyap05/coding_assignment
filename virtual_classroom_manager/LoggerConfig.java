import java.util.logging.Logger;

public class LoggerConfig {
    private static final Logger logger = Logger.getLogger(LoggerConfig.class.getName());

    public static Logger getLogger() {
        return logger;
    }
}
