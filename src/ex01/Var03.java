package ex01;

public class Var03 {
    public static void main(String[] args) {
        // 업 캐스팅, 묵시적 형변환
        int n1 = 10;
        double d1 = n1;
        System.out.println(d1);

        // 다운 캐스팅, 명시적 형변환
        double d2 = 10.5;
        int n2 = (int)d2;
        System.out.println(n2);

        // 문자 형변환 (아스키코드)
        // 010101111011 -> 65
        byte ch = 65;
        char data = (char)ch;
        System.out.println(data);
    }
}
