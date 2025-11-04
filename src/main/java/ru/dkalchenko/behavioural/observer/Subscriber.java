package ru.dkalchenko.behavioural.observer;

import java.util.List;

public class Subscriber implements Observer {
    String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear " + this.name + ", we have some changes in vacancies: " + vacancies
        + "\n=========================================================\n");
    }
}
