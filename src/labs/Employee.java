package labs;

public class Employee {
    // Employee class is something that each employee shares in common so that we can instantiate to create variables that each
    // variable can pull from employee class rather than keep having to write methods over and over
    String first;
    String last;
    String email;
    int pay;

    public Employee(String first, String last, int pay) {
        this.first = first;
        this.last = last;
        this.email = first + "." + last + "@gmail.com";
        this.pay = pay;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Raymond", "An", 50000); // instantiated, and created a new object for employee one
        Employee employee2 = new Employee("Kin", "Ly", 100000); // instantiated from employee to create new object for employee two

        // vs
        // employee1.first = "Raymond";
        // employee.last = "An";
        // employee.email = "raymondan@gmail.com";
        // employee.pay = 50000;

        System.out.println(employee1.email);
        System.out.println(employee2.email);

    }
}
