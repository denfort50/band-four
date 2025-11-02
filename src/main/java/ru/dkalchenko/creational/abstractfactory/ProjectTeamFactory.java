package ru.dkalchenko.creational.abstractfactory;

public interface ProjectTeamFactory {

    Developer getDeveloper();
    Tester getTester();
    Manager getManager();
}
