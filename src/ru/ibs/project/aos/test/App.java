package ru.ibs.project.aos.test;

import java.util.ArrayList;
import java.util.HashSet;

public class App {

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        TeamLeader teamLeader = new TeamLeader();
        Trainee trainee = new Trainee();

        HashSet<Employee> hsEmployees = new HashSet<>();
        hsEmployees.add(developer1);
        hsEmployees.add(teamLeader);
        hsEmployees.add(trainee);

        ArrayList<Employee> listEmployees = new ArrayList<>(hsEmployees);



    }
}
