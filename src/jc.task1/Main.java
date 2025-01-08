package jc.task1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println(employee.compareDates(2025, 12, 31, 2024, 1, 1)); 
        System.out.println(employee.compareDates(2024, 1, 1, 2025, 12, 31));  
        System.out.println(employee.compareDates(2025, 12, 31, 2024, 12, 31)); 
    }
}
