package ru.dkalchenko.behavioural.visitor;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(Project project) {
        System.out.println("Writing poor class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Dropping database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating not reliable test...");
    }
}
