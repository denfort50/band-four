package ru.dkalchenko.behavioural.visitor;

public interface Developer {
    void create(Project project);
    void create(Database database);
    void create(Test test);
}
