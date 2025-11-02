package ru.dkalchenko.creational.abstractfactory;

import ru.dkalchenko.creational.abstractfactory.website.WebsiteTeamFactory;

public class InternetShopProject {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new WebsiteTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        Manager manager = factory.getManager();

        System.out.println("Creating Internet Shop...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
