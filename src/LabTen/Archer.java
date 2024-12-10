package LabTen;

public class Archer extends Character implements Fighter {
    private int agility;

    public Archer(String name, int health, int agility) {
        super(name, health);  // Call to super to initialize parent class fields
        this.agility = agility;
    }

    @Override
    public void attack() {
        System.out.println(getName() + " Has shot an arrow! Agility: " + agility);
    }

    @Override
    public void defend() {
        System.out.println(getName() + " Swiftly dodges!");
    }
}
