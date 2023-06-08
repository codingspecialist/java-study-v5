package ex04.access.room1;

public class Cal01 {
    void add() {
        System.out.println("디폴트 더하기");
    }

    public void minus() {
        System.out.println("퍼블릭 빼기");
    }

    private void multi() {
        System.out.println("프라이베이트 곱하기");
    }

    public static void main(String[] args) {
        Cal01 c1 = new Cal01();
        c1.add();
        c1.minus();
        c1.multi();
    }
}
