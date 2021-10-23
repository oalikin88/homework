package ru.ibs.project.aos.test;

public class Developer extends Employee {


    private String project;
    private String skill;

    public String getProject() {
        return project;
    }

    public void setProject() {
        this.project = project;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill() {
        this.skill = skill;
    }

    public void startProject() {
        System.out.println("The project is starting");
    }

    public void processDevelopment(int percents) {
        System.out.println("Разработка выполнена на " + percents + "%");
    }

    @Override
    public String department() {
        return "Development";
    }
}
