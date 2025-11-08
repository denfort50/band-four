package ru.dkalchenko.behavioural.visitor;

public class Project implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
