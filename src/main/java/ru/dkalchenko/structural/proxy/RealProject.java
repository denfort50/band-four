package ru.dkalchenko.structural.proxy;

public class RealProject implements Project {
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.printf("Loading project from %s...%n", url);
    }

    @Override
    public void run() {
        System.out.printf("Running project %s...%n", url);
    }
}
