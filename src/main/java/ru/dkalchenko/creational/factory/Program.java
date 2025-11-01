package ru.dkalchenko.creational.factory;

public class Program {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactory("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    static DeveloperFactory createDeveloperFactory(String language) {
        return switch (language) {
            case "javascript" -> new JavascriptDeveloperFactory();
            case "python" -> new PythonDeveloperFactory();
            case "golang" -> new GolangDeveloperFactory();
            case "java" -> new JavaDeveloperFactory();
            default -> throw new IllegalArgumentException("Invalid language specified");
        };
    }

}
