package ru.dkalchenko.creational.abstractfactory;

import ru.dkalchenko.creational.abstractfactory.banking.BankingTeamFactory;

public class WorldBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory factory = new BankingTeamFactory();
        Developer developer = factory.getDeveloper();
        Tester tester = factory.getTester();
        Manager manager = factory.getManager();

        System.out.println("Creating World Bank...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}
