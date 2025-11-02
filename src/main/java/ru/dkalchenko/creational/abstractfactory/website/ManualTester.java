package ru.dkalchenko.creational.abstractfactory.website;

import ru.dkalchenko.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code manually");
    }
}
