package ex04;

class Elis {
    int height = 160;
    int x = 0;

    void eat() {
        height = height + 10;
    }

    void walk() {
        x = x + 1;
    }
}

class Cal01 {
    void add() {
        System.out.println("add 호출됨");
    }

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

public class Meth01 {
    public static void main(String[] args) {
        Cal01 c1 = new Cal01();
        c1.add();
        c1.minus();
        c1.multi();
        c1.divide();

        Cal01 c2 = new Cal01();
        c2.add();
        c2.minus();
        c2.multi();
        c2.divide();
    }
}
