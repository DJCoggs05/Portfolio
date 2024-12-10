package LabTen;

public class CharacterTest {
    public static void main(String[] args) {
        // Creates characters to test encapsulation
        Warrior warrior = new Warrior("Athena", 100, 35);
        Mage mage = new Mage("Merlin", 80, 60);
        Archer archer = new Archer("Robin", 90, 50);

        // Tests setting and getting health values
        System.out.println("Testing Encapsulation and Health:");

        warrior.setHealth(90);
        System.out.println("\nWarrior: "+warrior.getName() + " Health: " + warrior.getHealth());  // Expected: 90


        mage.setHealth(85);
        System.out.println("\nMage: "+mage.getName() + " Health: " + mage.getHealth());  // Expected: 85


        archer.setHealth(-10);  // Invalid health value
        System.out.println("\nArcher: "+archer.getName() + " Health: " + archer.getHealth());  // Expected: 0 (no negative health)
    }
}
