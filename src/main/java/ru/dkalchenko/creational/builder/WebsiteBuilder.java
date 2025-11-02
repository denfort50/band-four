package ru.dkalchenko.creational.builder;

public abstract class WebsiteBuilder {
    Website website;

    void createWebsite() {
        website = new Website();
    }

    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();

    public Website getWebsite() {
        return website;
    }
}
