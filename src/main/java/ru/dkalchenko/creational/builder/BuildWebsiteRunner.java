package ru.dkalchenko.creational.builder;

public class BuildWebsiteRunner {
    public static void main(String[] args) {
        Director visitCardWebsiteDirector = new Director();
        Director enterpriseWebsiteDirector = new Director();
        visitCardWebsiteDirector.setBuilder(new VisitCardWebsiteBuilder());
        enterpriseWebsiteDirector.setBuilder(new EnterpriseWebsiteBuilder());

        Website visitCardWebsite = visitCardWebsiteDirector.buildWebsite();
        Website enterpriseWebsite = enterpriseWebsiteDirector.buildWebsite();
        
        System.out.println(visitCardWebsite);
        System.out.println(enterpriseWebsite);
    }
}
