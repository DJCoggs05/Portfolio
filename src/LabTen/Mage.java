package LabTen;

public class Mage extends Character implements Fighter {
    private int magicPower;

    public Mage(String name, int health, int magicPower) {
        super(name, health);  // Call to super to initialize parent class fields
        this.magicPower = magicPower;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Has cast a fireball! Magic Power: " + magicPower);
    }

    @Override
    public void defend() {
        System.out.println(getName() + " Has conjured a defensive barrier!");
    }
}
