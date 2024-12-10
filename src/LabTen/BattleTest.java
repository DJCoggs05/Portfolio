package LabTen;

public class BattleTest {
    public static void main(String[] args) {
        // Creates two characters for the battle
        Fighter warrior = new Warrior("Thor", 100, 30);
        Fighter mage = new Mage("Gandalf", 80, 50);

        System.out.println("Battle Start!");

        // Game loops: Continue the battle until one character's health reaches 0
        while (((Character) warrior).isAlive() && ((Character) mage).isAlive()) {
            // Warrior attacks Mage
            warrior.attack();
            ((Character) mage).setHealth(((Character) mage).getHealth() - 10);

            if (!((Character) mage).isAlive()) {
                System.out.println("\nMage: "+((Character)mage).getName() + " has been defeated!");
                break;
            }

            // Mage attacks Warrior
            mage.attack();
            ((Character) warrior).setHealth(((Character) warrior).getHealth() - 15);

            if (!((Character) warrior).isAlive()) {
                System.out.println("\nWarrior: "+((Character)warrior).getName() + " has been defeated!");
                break;
            }
        }

        // Prints the winner
        if (((Character) warrior).isAlive()) {
            System.out.println("\nWarrior: "+((Character)warrior).getName() + " wins the battle!");
        } else {
            System.out.println("\nMage: "+((Character)mage).getName() + " wins the battle!");
        }
    }
}
