package ru.dkalchenko.behavioural.visitor;

public class BusinessRunner {
    public static void main(String[] args) {
        Business business = new Business();
        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();
        System.out.println("Junior in action...");
        business.beWritten(junior);
        System.out.println("===================================");
        System.out.println("Senior in action...");
        business.beWritten(senior);
    }

}
