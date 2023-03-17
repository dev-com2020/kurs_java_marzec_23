import java.time.LocalDate;

/**
 * Ten program sprawdza działanie klasy Employee
 *
 * @author TK
 * @version 1.1
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tomasz", 7500, 2020, 3, 16);
        staff[1] = new Employee("Jakub", 6500, 2021, 6, 12);
        staff[2] = new Employee("Asia", 8500, 2022, 4, 10);

//        Employee harry = new Employee("Harry",2500,2023,2,1);
        double percent = 10;
        var harry = new Employee("Harry",2500,2023,2,1);
        harry.setId();
        int n = Employee.getNextId();
        Employee.tripleValue(harry);
        harry.raiseSalary(percent);
        System.out.println(n);

        for (Employee e: staff)
            e.raiseSalary(5); // tomasz.raiseSalary, jakub.raiseSalary, asia.raiseSalary

        for (Employee e: staff)
            System.out.println("imie=" + e.getName() + " pensja=" + e.getSalary() + " data zatrudnienia=" + e.getHireDay());

        System.out.println("Pensja Harrego= " +harry.getSalary());



    }
}

class Employee {
    private final String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextId = 1;
    private int id;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);

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
        nextId++; // Employee.nextId++
    }

    public static int getNextId() {
        return nextId;
    }

    public static void tripleValue(Employee x){
        x.raiseSalary(200);
    }
}