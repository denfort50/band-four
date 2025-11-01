package ru.dkalchenko.creational.factory;

public class JavascriptDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavascriptDeveloper();
    }
}
