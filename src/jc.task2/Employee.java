package jc.task2;

import java.util.Calendar;

public class Employee {
    private static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    private final String name;
    private final String midName;
    private final String surName;
    private final String position;
    private final String phone;
    private int salary;
    private final int birth;

    public Employee(String name, String midName, String surName, String phone, String position, int salary, int birth) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public String getMidName() {
        return midName;
    }

    public String getSurName() {
        return surName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhone() {
        return phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return CURRENT_YEAR - birth;
    }

    public boolean isManager() {
        return false;
    }

    protected void increaseSalary(int increment) {
        this.salary += increment;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s, Position: %s, Salary: %d", name, midName, surName, position, salary);
    }
}