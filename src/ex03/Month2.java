package ex03;

import java.util.Calendar;
import java.util.Scanner;

public class Month2 {
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
        Calendar ca = Calendar.getInstance();

        if (b.equals("year")) {
            aaa[0] += c;
        } else if (b.equals("month")) {
            aaa[1] += c;
        } else if (b.equals("day")) {
            aaa[2] += c;
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
        ca.set(aaa[0], aaa[1], aaa[2]);

        System.out.println(ca.get(Calendar.YEAR) + "-" + ca.get(Calendar.MONTH) + "-" + ca.get(Calendar.DATE));

        sc.close();
    }
}