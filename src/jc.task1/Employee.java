package jc.task1;

public class Employee {

    // Метод для преобразования даты в "число"
    private int dateToInt(int year, int month, int day) {
        return year * 10000 + month * 100 + day;
    }

    // Метод для сравнения двух дат
    public int compareDates(int year1, int month1, int day1, int year2, int month2, int day2) {
        return dateToInt(year1, month1, day1) - dateToInt(year2, month2, day2);
    }
}