package Calculator;

public class FileLogger implements Logger {

    @Override
    public void log(String message) {

        System.out.println("Log into file: " + message);
    }
}
