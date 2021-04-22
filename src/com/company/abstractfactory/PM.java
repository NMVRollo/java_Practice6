package com.company.abstractfactory;

public class PM implements ProjectManager{
    @Override
    public void manageProject() {
        System.out.println("Project manager manage project.");
    }
}
