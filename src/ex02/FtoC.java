package ex02;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨온도를 입력하시오: ");
        double hasi = sc.nextInt();
        double subsi = (5.0/9.0)*(hasi-32);
        System.out.println("섭씨온도는 "+subsi);
    }
}
