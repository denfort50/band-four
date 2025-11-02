package ru.dkalchenko.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        InMemoryLogger log = InMemoryLogger.getInstance();
        log.info("First log");
        log.info("Second log");
        log.info("Third log");
        log.error("Something went wrong");
        log.showLogFile();
    }
}
