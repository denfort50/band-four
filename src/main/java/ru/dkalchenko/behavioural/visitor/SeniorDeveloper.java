package ru.dkalchenko.behavioural.visitor;

public class SeniorDeveloper implements Developer {
    @Override
    public void create(Project project) {
        System.out.println("Rewriting class after Jun ...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
