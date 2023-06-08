package mydate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Date02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] aaa = new int[3];

        System.out.println("날짜를 입력하세요");
        String a = sc.nextLine(); // 0 - 1 - 2

        System.out.println("년, 월, 일 중 입력");
        String b = sc.nextLine();

        System.out.println("바꾸실(더할) 숫자를 입력");

        int c = sc.nextInt();

        String[] aa = a.split("-");
        for (int i = 0; i < aa.length; i++) {
            aaa[i] = Integer.parseInt(aa[i]);
        }
        LocalDate LDate = LocalDate.of(aaa[0], aaa[1], aaa[2]);
        String DayIn = (LDate.format(DateTimeFormatter.ofPattern("dd")));

        if (b.equals("year")) {
            LocalDate LDateY = LDate.plusYears(c);
            System.out.println(LDateY);
        } else if (b.equals("month")) {
            LocalDate LDateM = LDate.plusMonths(c);
            String DayIn2 = (LDateM.format(DateTimeFormatter.ofPattern("dd")));
            String MonthIn = (LDateM.format(DateTimeFormatter.ofPattern("MM")));
            if (MonthIn.equals("02")) {
                if (DayIn.equals(DayIn2)) {
                    System.out.println(LDateM);
                } else {
                    LocalDate LDateMM = LDateM.plusDays(1);
                    System.out.println(LDateMM);
                }

            } else {
                System.out.println(LDateM);
            }
        } else if (b.equals("day")) {
            LocalDate LDateD = LDate.plusDays(c);
            System.out.println(LDateD);
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        sc.close();

    }
}
