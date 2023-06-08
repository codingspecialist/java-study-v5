package ex04;

class Cal02 {
    void add(int n1, int n2) {
        System.out.println("더하기 : " + (n1 + n2));
    } // 스택을 종료하고, 복귀주소를 확인하고 복귀한다.

    // minus
    void minus() {
        System.out.println("minus 호출됨");
    }

    // multi
    void multi() {
        System.out.println("multi 호출됨");
    }

    // divide
    void divide() {
        System.out.println("multi 호출됨");
    }
}

public class Meth02 {
    public static void main(String[] args) {
        Cal02 c1 = new Cal02();
        c1.add(10, 5);
        // c1.minus();
        // c1.multi();
        // c1.divide();
    }
}
