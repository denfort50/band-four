package ru.dkalchenko.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/denfort50");
        project.run();
    }
}
