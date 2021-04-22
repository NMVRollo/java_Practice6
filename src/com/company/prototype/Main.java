package com.company.prototype;

public class Main {

    public static void main(String[] args) {
        Project project = new Project(1, "HelloWorld", "Java");
        Project copy = (Project) project.copy();
        project.setId(2);

        System.out.println(copy);
    }

}
