package ru.ibs.project.aos.test;

public class Trainee extends Employee {

    private String lastName;
    private String teamLeaderName;

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getTeamLeaderName() {
        return teamLeaderName;
    }

    public void setTeamLeaderName() {
        this.teamLeaderName = teamLeaderName;
    }

    public String newTask(String task) {
        return task;
    }

    public int workTime(int hour) {
        return hour - 1;
    }

    @Override
    public void greeting() {
        System.out.println("Hi i am Trainee");
    }

}
