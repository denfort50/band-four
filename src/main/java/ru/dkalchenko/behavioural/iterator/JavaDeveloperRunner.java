package ru.dkalchenko.behavioural.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills = {"Java", "Spring", "Hibernate", "Maven", "Postgres"};

        JavaDeveloper javaDeveloper = new JavaDeveloper("Denis K", skills);

        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Java Developer: " + javaDeveloper.getName());
        System.out.print("Skills: ");

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
