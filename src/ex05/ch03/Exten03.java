package ex05.ch03;

import javax.print.DocFlavor.BYTE_ARRAY;

abstract class Animal { // 추상클래스
    abstract void speak();
    // 추상메서드 (구체적 행위를 알지 못할 때)
}

class Bird extends Animal {

    void speak() {
        System.out.println("짹짹");
    }

}

class Cow extends Animal {
    void speak() {
        System.out.println("음메");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("야옹");
    }
}

public class Exten03 {

    static void start(Animal u) {
        u.speak();
    }

    public static void main(String[] args) {

        Animal d = new Dog();
        start(d);

        Animal c = new Cat();
        start(c);

        Animal a = new Cow();
        start(a);

        Animal b = new Bird();
        start(b);
    }
}
