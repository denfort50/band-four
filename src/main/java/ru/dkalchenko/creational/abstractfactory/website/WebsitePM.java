package ru.dkalchenko.creational.abstractfactory.website;

import ru.dkalchenko.creational.abstractfactory.Manager;

public class WebsitePM implements Manager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project");
    }
}
