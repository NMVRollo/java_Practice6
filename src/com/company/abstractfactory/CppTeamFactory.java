package com.company.abstractfactory;

public class CppTeamFactory implements ProjectTeamFactory{
    @Override
    public Developer getDeveloper() {
        return new CppDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QUCPPTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new CppPM();
    }
}
