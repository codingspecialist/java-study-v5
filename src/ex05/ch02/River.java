package ex05.ch02;

public class River extends ProtossUnit {
    String name;
    int hp;
    int attack;

    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAttack(int attack) {
        this.attack = attack;

    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;

    }

    @Override
    public void setName(String name) {
        this.name = name;

    }

}
