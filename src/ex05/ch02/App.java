package ex05.ch02;

public class App {

    static void attack(ProtossUnit u1, ProtossUnit u2) {
        u2.setHp(u2.getHp() - u1.getAttack());
        System.out.println(u2.getName() + "이 공격당했습니다");
        System.out.println(u2.getName() + "의 남은 hp : " + u2.getHp());

        // u2.hp = u2.hp - u1.attack;
        // System.out.println(u2.name + "이 공격당했습니다");
        // System.out.println(u2.name + "의 남은 hp : " + u2.hp);
    }

    public static void main(String[] args) {
        ProtossUnit z1 = new Zealot("질럿1", 100, 10);
        ProtossUnit z2 = new Zealot("질럿2", 100, 10);
        ProtossUnit d1 = new Dragoon("드라군1", 100, 5);
        ProtossUnit d2 = new Dragoon("드라군2", 100, 5);

        attack(z1, z2);
        attack(z1, d1);
        attack(d1, z2);
        attack(z1, z2);

        ProtossUnit r1 = new River();
        r1.setHp(100);
        r1.setAttack(80);
        r1.setName("리버1");

        attack(r1, z1);
    }
}
