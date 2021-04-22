package com.company.factorymethod;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = getDeveloperFactoryBySpeciality(DeveloperSpeciality.JAVA);
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    private static DeveloperFactory getDeveloperFactoryBySpeciality(DeveloperSpeciality speciality) {
        switch (speciality) {
            case JAVA:
                return new JavaDeveloperFactory();
            case CPP:
                return new CppDeveloperFactory();
            default:
                throw new UnsupportedOperationException("Unsupported developer speciality");
        }
    }

}
