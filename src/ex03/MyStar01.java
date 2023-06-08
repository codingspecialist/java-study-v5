package ex03;

public class MyStar01 {
    public static void main(String[] args) {
        int end = 0;
        for (int k = 0; k < 5; k++) { // 행을 반복
            end = end + 1;
            for (int i = 0; i < end; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}