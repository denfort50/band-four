package ru.dkalchenko.creational.abstractfactory.website;

import ru.dkalchenko.creational.abstractfactory.Developer;
import ru.dkalchenko.creational.abstractfactory.Manager;
import ru.dkalchenko.creational.abstractfactory.ProjectTeamFactory;
import ru.dkalchenko.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getManager() {
        return new WebsitePM();
    }
}
