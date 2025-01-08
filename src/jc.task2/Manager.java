package jc.task2;

public class Manager extends Employee {

    public Manager(String name, String midName, String surName, String phone, String position, int salary, int birth) {
        super(name, midName, surName, phone, position, salary, birth);
    }

    @Override
    public boolean isManager() {
        return true;
    }

    public static void increaser(Employee[] emp, int age, int increment) {
        for (Employee e : emp) {
            if (e.getAge() > age && !e.isManager()) {
                e.increaseSalary(increment);
            }
        }
    }
}