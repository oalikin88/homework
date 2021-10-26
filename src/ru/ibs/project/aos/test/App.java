package ru.ibs.project.aos.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) {

        Developer developer1 = new Developer();
        Developer developer2 = new Developer();
        TeamLeader teamLeader = new TeamLeader();
        Trainee trainee = new Trainee();


        developer1.setName("Иван");
        developer1.setLastName("Иванов");
        developer1.setAge(20);

        developer2.setName("Петр");
        developer2.setLastName("Петров");
        developer2.setAge(22);

        teamLeader.setName("Александр");
        teamLeader.setLastName("Александров");
        teamLeader.setAge(35);

        trainee.setName("Людмила");
        trainee.setLastName("Людмилова");
        trainee.setAge(19);

        Employee employee = new Employee() {

            private double salary;
            private String dateOfEmployment;

            public double getSalary() {
                return salary;
            }

            public String getDateOfEmployment() {
                return dateOfEmployment;
            }

            public void setSalary(double salary) {
                this.salary = salary;
            }

            public void setDateOfEmployment(String date) {
                this.dateOfEmployment = date;
            }

            public int Vacation(int day) {
                return day;
            }
        };

        employee.setName("Эрнест");
        employee.setLastName("Эрнестов");
        employee.setAge(29);

        HashSet<Employee> hsEmployees = new HashSet<>();
        hsEmployees.add(developer1);
        hsEmployees.add(developer2);
        hsEmployees.add(teamLeader);
        hsEmployees.add(trainee);
        hsEmployees.add(employee);


        List<Employee> listEmployees = new ArrayList<>(hsEmployees);

        List<Employee> afterFilterList = listEmployees.stream().filter(e -> e.getAge() < 30).collect(Collectors.toList());

        afterFilterList.stream().map(e -> e.getAge()).forEach(e -> System.out.println(e));



    }
}
