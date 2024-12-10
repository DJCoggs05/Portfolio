package AuthorGuide;

import java.util.ArrayList;

public class TraitManager {
    // Shared list of traits
    private static ArrayList<String> sharedTraits = new ArrayList<>();
    // List for killed characters
    private static ArrayList<Character> killedCharacters = new ArrayList<>();

    // Add default traits
    public static void addDefaultTraits() {
        sharedTraits.add("Name");
        sharedTraits.add("Age");
        sharedTraits.add("Gender");
    }

    // Add a new trait to the shared list
    public static void addSharedTrait(String trait) {
        if (!sharedTraits.contains(trait)) {
            sharedTraits.add(trait);
        } else {
            System.out.println("Trait already exists.");
        }
    }

    // Method to remove a shared trait
    public static boolean removeSharedTrait(String trait) {
        if (sharedTraits.contains(trait)) {
            sharedTraits.remove(trait);
            // Remove the trait from all characters
            for (Character character : MainMenu.getCharacters()) {
                character.setTraitValue(trait, null); // Remove the trait for this character
            }
            return true; // Return true if the trait was removed
        }
        return false; // Return false if the trait was not found
    }

    // Method to add a killed character to the list
    public static void addKilledCharacter(Character character) {
        killedCharacters.add(character); // Add the character to the killed characters list
    }

    // Method to get the list of killed characters
    public static ArrayList<Character> getKilledCharacters() {
        return killedCharacters;
    }

    // Other methods can be added here as needed
}
