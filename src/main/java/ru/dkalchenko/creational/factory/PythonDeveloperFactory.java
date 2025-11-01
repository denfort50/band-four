package ru.dkalchenko.creational.factory;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}
