package ru.ibs.project.aos.test;

abstract public class Employee {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String department() {
        return null;
    }

    public void greeting() {

    }
}
