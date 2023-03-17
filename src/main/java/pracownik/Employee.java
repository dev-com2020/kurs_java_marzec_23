package pracownik;

import java.time.LocalDate;

public class Employee {
    //    private final String name;
    private String name = "";
    private double salary;
    private LocalDate hireDay;
    private static int nextId;
    private int id = assignId();

    private int assignId() {
        int r = nextId;
        nextId++;
        return r;
    }

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String name) {
        this.name = name;
    }
//    public pracownik.Employee(double s) {
//        this("Pracownik " + nextId, s);
//        nextId++;
//    }

    public Employee() {
        this.name = "Nieznany";
        this.salary = 3200;
        this.hireDay = LocalDate.now();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /**
     * Podnosi pensje o wskazany procent
     */
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void setId() {
        id = nextId; // harry.id
        nextId++; // pracownik.Employee.nextId++
    }

    public static int getNextId() {
        return nextId;
    }

    public static void tripleValue(Employee x) {
        x.raiseSalary(200);
    }
}