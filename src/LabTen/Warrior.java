package LabTen;

public class Warrior extends Character implements Fighter{
    private int strength;

    public Warrior(String name, int health, int strength) {
        super(name, health);  // Call to super to initialize parent class fields
        this.strength = strength;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Slashes with his sword! Strength: " + strength);
    }

    @Override
    public void defend() {
        System.out.println(getName() + " Blocks with his shield!");
    }
}
