package ru.ibs.project.aos.test;

public class TeamLeader extends Employee implements Manager {

    private double salary;
    private int employees;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public void checkProcess() {
        System.out.println("Process is checked");
    }

    public Developer manageDeveloper(Developer developer) {
        return new Developer();
    }

    @Override
    public double bonusSalary(double bonus) {
        double salary = getSalary();
        return salary + bonus;
    }

    @Override
    public boolean isWorking() {
        return false;
    }

    @Override
    public void greeting() {
        System.out.println("Hi i am team leader");
    }
}
