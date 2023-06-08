package ex02;

import java.util.Scanner;

public class CalTime {
    public static void main(String[] args) {
        int n1 = 310;
        int n2 = 60;
        int min = n1/n2;
        int sec = n1%n2;
        System.out.println(min+"분 "+sec+"초");
    }
}
