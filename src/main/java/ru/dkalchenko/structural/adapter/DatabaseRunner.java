package ru.dkalchenko.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new JavaToDatabaseAdapter();

        database.insert();
        database.update();
        database.select();
        database.delete();

    }
}
