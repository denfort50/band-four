package ru.dkalchenko.structural.bridge;

public abstract class Program {
    Developer developer;

    public Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void develop();
}
