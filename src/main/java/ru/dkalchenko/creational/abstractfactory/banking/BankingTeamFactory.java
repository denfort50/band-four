package ru.dkalchenko.creational.abstractfactory.banking;

import ru.dkalchenko.creational.abstractfactory.Developer;
import ru.dkalchenko.creational.abstractfactory.Manager;
import ru.dkalchenko.creational.abstractfactory.ProjectTeamFactory;
import ru.dkalchenko.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public Manager getManager() {
        return new BankingPM();
    }
}
