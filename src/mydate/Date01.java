package mydate;

import java.util.Scanner;

public class Date01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("날짜를 입력하세요.");
        String date = sc.nextLine();

        String Year = date.split("-")[0];
        String Month = date.split("-")[1];
        String Day = date.split("-")[2];

        System.out.println("year, month, day 중 수정할 항목을 입력하세요.");
        String ymd = sc.next();

        System.out.println("더하거나 뺄 숫자를 입력하세요.");
        int addedNum = sc.nextInt();

        int year = Integer.parseInt(Year);
        int month = Integer.parseInt(Month);
        int day = Integer.parseInt(Day);

        int addedYear = addedNum + year;
        int addedMonth = addedNum + month;
        int addedDay = addedNum + day;

        int[][] ab = {
                { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
                { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
                { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 },
                { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };

        if (ymd.equals("year")) {
            System.out.println(addedYear + "년 " + month + "월 " + day + "일");
        }

        if (ymd.equals("month")) {
            year = year + (addedMonth - 1) / 12;
            System.out.println(year + "년" + ((addedMonth - 1) % 12 + 1) + "월" + day + "일");

        }
        if (ymd.equals("day"))
            for (int i = month, j = year % 4; addedDay > ab[(j)][(i - 1) % 12]; i++) {
                addedDay = addedDay - ab[j][(i - 1) % 12];
                month = month + 1;
                if (i >= 12) {
                    year = year + 1;
                    month = (month - 1) % 12 + 1;
                    j = year % 4;
                    i = i - 12;
                }

            }
        System.out.println(year + "년" + month + "월" + addedDay + "일");

    }
}
