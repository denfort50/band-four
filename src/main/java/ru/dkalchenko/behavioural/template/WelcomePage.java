package ru.dkalchenko.behavioural.template;

public class WelcomePage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}
