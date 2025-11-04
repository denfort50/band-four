package ru.dkalchenko.behavioural.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
        jobSite.addVacancy("Java Position");
        jobSite.addVacancy("C++ Position");

        Observer subscriberOne = new Subscriber("Denis K");
        Observer subscriberTwo = new Subscriber("Nastya A");

        jobSite.addObserver(subscriberOne);
        jobSite.addObserver(subscriberTwo);

        jobSite.addVacancy("Golang position");

        jobSite.removeVacancy("Java Position");
    }
}
