import pracownik.Employee;
import pracownik.Manager;

import java.time.LocalDate;
import java.time.*;
import static java.lang.System.*;


public class Start {
    public static void main(String[] args) {

//        Object obj = new Employee("Henryk");

        out.println("Test");
        Manager cezary = new Manager("Cezary",5000,2023,3,16);

        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Tomasz", 7500, 2020, 3, 16);
        staff[1] = new Employee("Jakub", 6500, 2021, 6, 12);
        staff[2] = new Employee("Asia", 8500, 2022, 4, 10);
        staff[3] = cezary;

        cezary.setBonus(2000);


//        pracownik.Employee harry = new pracownik.Employee("Harry",2500,2023,2,1);
        double percent = 10;
        var harry = new Employee("Harry", 2500, 2023, 2, 1);
        var megan = new Employee("Megan");
        var jozek = new Employee();

        harry.setId();
        int n = Employee.getNextId();
        Employee.tripleValue(harry);
        harry.raiseSalary(percent);
        System.out.println(n);



        for (Employee e : staff)
            e.raiseSalary(5); // tomasz.raiseSalary, jakub.raiseSalary, asia.raiseSalary

        for (Employee e : staff)
            System.out.println("imie=" + e.getName() + " pensja=" + e.getSalary() + " data zatrudnienia=" + e.getHireDay());

        System.out.println("Pensja Harrego= " + harry.getSalary());


        double m = max(4.3,40.5,6.6);
        out.println(m);


    }

    public static double max(double... values){
        double largest = Double.NEGATIVE_INFINITY;
        for (double v: values) if (v > largest) largest = v;
        return largest;
    }
}