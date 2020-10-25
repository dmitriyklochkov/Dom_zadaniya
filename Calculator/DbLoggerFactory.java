package Calculator;

public class DbLoggerFactory extends LoggerFactory {

    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
