package ru.dkalchenko.behavioural.visitor;

public class Business implements ProjectElement {
    ProjectElement[] projectElements;

    public Business() {
        this.projectElements = new ProjectElement[] {
                new Project(), new Database(), new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement projectElement : projectElements) {
            projectElement.beWritten(developer);
        }
    }
}
