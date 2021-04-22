package com.company.abstractfactory;

public class Main {

    public static void main(String[] args) {

        ProjectTeamFactory projectTeamFactory = new CppTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        projectManager.manageProject();
        tester.testCode();

    }

}
