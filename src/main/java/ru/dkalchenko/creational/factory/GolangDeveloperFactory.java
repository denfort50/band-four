package ru.dkalchenko.creational.factory;

public class GolangDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new GolangDeveloper();
    }
}
