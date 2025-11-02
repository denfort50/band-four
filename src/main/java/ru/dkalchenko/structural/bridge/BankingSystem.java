package ru.dkalchenko.structural.bridge;

public class BankingSystem extends Program {
    public BankingSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void develop() {
        System.out.println("Banking system development in progress...");
        developer.writeCode();
    }
}
