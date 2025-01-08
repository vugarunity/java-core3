package jc.task2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John", "Michael", "Doe", "12345", "Developer", 50000, 1985),
                new Manager("Anna", "Maria", "Smith", "67890", "CEO", 100000, 1975)
        };

        System.out.println("Before salary increase:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Manager.increaser(employees, 30, 5000);

        System.out.println("\nAfter salary increase:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}