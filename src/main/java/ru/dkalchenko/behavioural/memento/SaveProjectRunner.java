package ru.dkalchenko.behavioural.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        GitHubRepository gitHubRepository = new GitHubRepository();

        System.out.println("Creating new project. Version 1.0");
        project.setVersionAndDate("Version 1.0");

        System.out.println(project);

        System.out.println("Saving current version to GitHub");
        gitHubRepository.setSave(project.save());

        System.out.println("Updating project to Version 1.1");

        System.out.println("Writing bad code...");
        Thread.sleep(1000);

        project.setVersionAndDate("Version 1.1");

        System.out.println(project);

        System.out.println("Something went wrong!");

        System.out.println("Rolling back to Version 1.0");

        project.load(gitHubRepository.getSave());

        System.out.println("Project after rollback");

        System.out.println(project);
    }
}
