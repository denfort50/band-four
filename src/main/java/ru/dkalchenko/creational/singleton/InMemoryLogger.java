package ru.dkalchenko.creational.singleton;

public class InMemoryLogger {
    private static volatile InMemoryLogger instance;
    private final StringBuffer LOG_FILE = new StringBuffer("This is log file. \n\n");

    public static InMemoryLogger getInstance() {
        if (instance == null) {
            synchronized (InMemoryLogger.class) {
                if (instance == null) {
                    instance = new InMemoryLogger();
                }
            }
        }
        return instance;
    }

    private InMemoryLogger() {

    }

    public void info(String message) {
        log("INFO", message);
    }

    public void error(String message) {
        log("ERROR", message);
    }

    public void warn(String message) {
        log("WARN", message);
    }

    public void debug(String message) {
        log("DEBUG", message);
    }

    public void showLogFile() {
        System.out.println(LOG_FILE);
    }

    private void log(String level, String message) {
        LOG_FILE.append(String.format("[%s] %s%n", level, message));
    }

}
