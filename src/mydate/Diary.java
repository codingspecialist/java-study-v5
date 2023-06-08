package mydate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Diary {
    int[] lastDay = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    int year;
    int month;
    int day;

    // 2023-01-30 -> 3
    public void addDay(int value) {
        day = day + value;
        calculate();
    }

    // 2023-01-30 -> 3
    public void addMonth(int value) {
        month = month + value;
        calculate();
    }

    // 2023-01-30 -> 3
    public void addYear(int value) {
        year = year + value;
        calculate();
    }

    public void calculate() {

        // 윤달 계산
        boolean isLeap = checkLeapYear(year);
        if (isLeap) {
            lastDay[1] = 29;
        } else {
            lastDay[1] = 28;
        }

        // 월 계산
        if (month > 12) {
            addYear(month / 12);
            month = month % 12;
        }

        // 일 계산
        while (true) {
            if (day > lastDay[month - 1]) {
                day = day - lastDay[month - 1];
                addMonth(1); // 재귀
            } else {
                break;
            }
        }
    }

    public boolean checkLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else if (year % 400 != 0) {
            return false;
        } else {
            return true;
        }
    }

    public void parseDate(String dateString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, formatter);

        this.year = date.getYear();
        this.month = date.getMonthValue();
        this.day = date.getDayOfMonth();
    }
}
