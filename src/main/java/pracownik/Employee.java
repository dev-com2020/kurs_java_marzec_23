package pracownik;

import java.time.LocalDate;

/**
 * Obiekt <code>Employee</code> reprezentuje pracownika firmy
 *
 * @author TK
 * @version 1.0
 * @link www.comarch.pl
 */
public class Employee {
    //    private final String name;
    private String name = "";
    private double salary;
    /**
     * Data zatrudnienia pracownika
     */
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

    public Employee() {
        this.name = "Nieznany";
        this.salary = 3200;
        this.hireDay = LocalDate.now();
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        Employee other = (Employee) otherObject;
        return name.equals(other.name) && salary == other.salary;
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
     *
     * @param byPercent określa o ile procent podnosi pensję
     * @return kwota podwyżki
     * @throws java.io.IOError
     */
    public double raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
        return raise;
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

