package ru.dkalchenko.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DeveloperFactory {
    private static final Map<String, Developer> DEVELOPERS = new HashMap<>();

    public Developer getDeveloperBySpecialty(String specialty) {
        Developer developer = DEVELOPERS.get(specialty);
        if (Objects.isNull(developer)) {
            developer = switch (specialty) {
                case "java" -> {
                    System.out.println("Hiring Java developer...");
                    yield new JavaDeveloper();
                }
                case "c++" -> {
                    System.out.println("Hiring C++ developer...");
                    yield new CppDeveloper();
                }
                default -> developer;
            };
            DEVELOPERS.put(specialty, developer);
        }
        return developer;
    }
}
