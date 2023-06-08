package ex04;

public class DeskLampTest {
    public static void main(String[] args) {
        DeskLamp myLamp = new DeskLamp();
        myLamp.turnOn();
        String result1 = myLamp.print();
        System.out.println(result1);
        myLamp.turnOff();
        String result2 = myLamp.print();
        System.out.println(result2);
    }
}
