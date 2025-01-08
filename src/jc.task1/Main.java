package jc.task1;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // Примеры сравнения
        System.out.println(employee.compareDates(2025, 12, 31, 2024, 1, 1));  // Положительное число
        System.out.println(employee.compareDates(2024, 1, 1, 2025, 12, 31));  // Отрицательное число
        System.out.println(employee.compareDates(2025, 12, 31, 2024, 12, 31)); // 0
    }
}
