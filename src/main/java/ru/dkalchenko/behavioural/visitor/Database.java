package ru.dkalchenko.behavioural.visitor;

import ru.dkalchenko.behavioural.template.WebsiteTemplate;

public class Database implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
