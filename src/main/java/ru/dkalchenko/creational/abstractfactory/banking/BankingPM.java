package ru.dkalchenko.creational.abstractfactory.banking;

import ru.dkalchenko.creational.abstractfactory.Manager;

public class BankingPM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Banking project manager manages project");
    }
}
