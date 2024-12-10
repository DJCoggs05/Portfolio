package AuthorGuide;

import java.util.ArrayList;
import java.util.Scanner;

public class MainMenu {
    // Keep track of created characters
    private static ArrayList<Character> characters = new ArrayList<>();
    // Keep track of created plot points
    private static ArrayList<Plot> plotPoints = new ArrayList<>();

    // Getter for characters
    public static ArrayList<Character> getCharacters() {
        return characters;
    }

    // Getter for plot points
    public static ArrayList<Plot> getPlotPoints() {
        return plotPoints;
    }

    public static void addDefaultTraits() {
        TraitManager.addDefaultTraits(); // Call the TraitManager to add default traits
    }

    // Display Main Menu
    public static void displayMenu() {
        Scanner scan = new Scanner(System.in);
        boolean go = true;

        while (go) {
            // Print Menu
            System.out.println("1. Create Character");
            System.out.println("2. Kill Character");
            System.out.println("3. Edit Character");
            System.out.println("4. Create Plot Point");
            System.out.println("5. Delete Plot Point");
            System.out.println("6. Edit Plot Point");
            System.out.println("7. Save Data");
            System.out.println("8. Load Data");
            System.out.println("9. View Characters");
            System.out.println("10. View Plot Points"); // New option to view plot points
            System.out.println("Press Q to quit. Progress will not be automatically saved.");

            String input = scan.nextLine(); // Read user input as a string

            switch (input.toUpperCase()) { // Convert input to uppercase for easy comparison
                case "1":
                    createCharacter();
                    break;
                case "2":
                    killCharacter();
                    break;
                case "3":
                    editCharacter(); // Call the new edit character method
                    break;
                case "4":
                    createPlotPoint(); // Call the method to create a plot point
                    break;
                case "5":
                    deletePlotPoint(); // Call the method to delete a plot point
                    break;
                case "6":
                    editPlotPoint(); // Call the method to edit a plot point
                    break;
                case "9":
                    viewCharacters(); // Call the new view characters method
                    break;
                case "10": // New case for viewing plot points
                    viewPlotPoints();
                    break;
                case "Q":
                    go = false; // Exit the loop if user presses Q
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Please enter a valid number.");
                    break;
            }
            // Display the menu again after each action, except when quitting
            if (go) {
                System.out.println();
            }
        }
    }

    // Create a new character
    public static void createCharacter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter character name:");
        String name = scan.nextLine();
        Character newCharacter = new Character(name);
        characters.add(newCharacter); // Add the character to the list
        newCharacter.displayTraits(); // Display traits after creation

        // Display character creation menu immediately after creating the character
        displayCharacterCreateMenu(newCharacter); // Pass the new character
    }

    // Method to create a new plot point
    public static void createPlotPoint() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter plot point name:");
        String name = scan.nextLine();
        Plot newPlotPoint = new Plot(name);
        plotPoints.add(newPlotPoint); // Add the plot point to the list
        System.out.println("Plot point created: " + name);
    }

    // Method to delete a plot point
    public static void deletePlotPoint() {
        Scanner scan = new Scanner(System.in);
        boolean plotFound = false;

        while (!plotFound) {
            System.out.println("Enter the name of the plot point you would like to delete: ");
            String nameToRemove = scan.nextLine();

            // Find and remove the plot point
            Plot plotToRemove = null;
            for (Plot plot : plotPoints) {
                if (plot.getName().equalsIgnoreCase(nameToRemove)) {
                    plotToRemove = plot;
                    break;
                }
            }

            // Check if the plot point was found
            if (plotToRemove != null) {
                plotPoints.remove(plotToRemove); // Remove the plot point from the list
                System.out.println("Plot point " + nameToRemove + " has been deleted.");
                plotFound = true; // Exit the loop
            } else {
                System.out.println("Plot point not found. Please try again.");
            }
        }
    }

    // Method to edit a plot point
    public static void editPlotPoint() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the plot point you would like to edit: ");
        String plotName = scan.nextLine();

        // Find the plot point
        Plot plotToEdit = null;
        for (Plot plot : plotPoints) {
            if (plot.getName().equalsIgnoreCase(plotName)) {
                plotToEdit = plot;
                break;
            }
        }

        // If the plot point is found, allow editing
        if (plotToEdit != null) {
            System.out.println("Current name: " + plotToEdit.getName());
            System.out.println("Enter new name for the plot point (or press Enter to keep it the same):");
            String newName = scan.nextLine();
            if (!newName.isEmpty()) {
                // Update the plot point name if a new name is provided
                plotToEdit = new Plot(newName);
                System.out.println("Plot point updated to: " + newName);
            } else {
                System.out.println("No changes made to the plot point.");
            }
        } else {
            System.out.println("Plot point not found.");
        }
    }

    // Method to kill a character
    public static void killCharacter() {
        Scanner scan = new Scanner(System.in);
        boolean characterFound = false;

        while (!characterFound) {
            System.out.println("Enter the name of the character you would like to kill: ");
            String nameToRemove = scan.nextLine();

            // Find and remove the character
            Character characterToRemove = null;
            for (Character character : characters) {
                if (character.getName().equalsIgnoreCase(nameToRemove)) {
                    characterToRemove = character;
                    break;
                }
            }

            // Check if the character was found
            if (characterToRemove != null) {
                // Remove the character from the main list
                characters.remove(characterToRemove);
                // Add the character to the killed characters list in TraitManager
                TraitManager.addKilledCharacter(characterToRemove);
                System.out.println("Character " + nameToRemove + " has been killed.");
                characterFound = true; // Exit the loop
            } else {
                System.out.println("Character not found. Please try again.");
            }
        }
    }

    // Method to edit a character's traits
    public static void editCharacter() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the character you would like to edit: ");
        String characterName = scan.nextLine();

        // Find the character
        Character characterToEdit = null;
        for (Character character : characters) {
            if (character.getName().equalsIgnoreCase(characterName)) {
                characterToEdit = character;
                break;
            }
        }

        // If the character is found, allow editing
        if (characterToEdit != null) {
            displayCharacterCreateMenu(characterToEdit); // Use the character creation menu to edit traits
        } else {
            System.out.println("Character not found.");
        }
    }

    // Method to view all characters
    public static void viewCharacters() {
        if (characters.isEmpty() && TraitManager.getKilledCharacters().isEmpty()) {
            System.out.println("No characters have been created yet.");
        } else {
            System.out.println("Current Characters:");

            // Display alive characters
            if (!characters.isEmpty()) {
                System.out.println("Alive Characters:");
                for (Character character : characters) {
                    System.out.println("- " + character.getName());
                }
            }

            // Display killed characters
            if (!TraitManager.getKilledCharacters().isEmpty()) {
                System.out.println("Killed Characters:");
                for (Character killedCharacter : TraitManager.getKilledCharacters()) {
                    System.out.println("- " + killedCharacter.getName());
                }
            }
        }
    }


    // Method to view all plot points
    public static void viewPlotPoints() {
        if (plotPoints.isEmpty()) {
            System.out.println("No plot points have been created yet.");
        } else {
            System.out.println("Current Plot Points:");
            for (Plot plot : plotPoints) {
                plot.displayPlotDetails(); // Display each plot point's details
            }
        }
    }

    // Update method to accept a character parameter
    public static void displayCharacterCreateMenu(Character newCharacter) {
        Scanner scan = new Scanner(System.in);
        boolean continueEditing = true;

        while (continueEditing) {
            // Display current traits once at the beginning of each loop
            System.out.println("Traits for " + newCharacter.getName() + ":"); // Use current name
            newCharacter.displayTraits(); // Ensure this method uses the updated name

            System.out.println("1. Add Traits - This will add this trait to ALL CHARACTERS");
            System.out.println("2. Remove Traits - This will delete this trait from ALL CHARACTERS");
            System.out.println("3. Proceed with current Traits");
            System.out.println("4. Edit Current Traits - Change the value of existing traits");

            int input = scan.nextInt();
            scan.nextLine(); // Consume the newline character

            switch (input) {
                case 1:
                    System.out.println("Adding Traits... What trait would you like to add?");
                    String newTrait = scan.nextLine();
                    TraitManager.addSharedTrait(newTrait);
                    newCharacter.setTraitValue(newTrait, "Not Specified");

                    // Ask the user for the value of the new trait
                    System.out.println("Enter value for " + newTrait + ":");
                    String traitValue = scan.nextLine();
                    newCharacter.setTraitValue(newTrait, traitValue);
                    System.out.println("Trait added: " + newTrait + " with value: " + traitValue);
                    break;

                case 2:
                    System.out.println("What trait would you like to remove?");
                    String traitToRemove = scan.nextLine();
                    if (TraitManager.removeSharedTrait(traitToRemove)) {
                        System.out.println("Trait removed: " + traitToRemove);
                        // Clear the trait for the current character
                        newCharacter.setTraitValue(traitToRemove, null);
                    } else {
                        System.out.println("Trait not found in shared traits.");
                    }
                    break;

                case 3:
                    continueEditing = false; // Exit the loop
                    break;

                case 4:
                    System.out.println("Which trait would you like to edit? (Type 'done' to finish editing)");
                    String traitName = scan.nextLine();
                    if (traitName.equalsIgnoreCase("done")) {
                        continueEditing = false; // Exit the editing loop
                    } else {
                        // Check if the trait exists
                        if (newCharacter.getTraits().containsKey(traitName)) {
                            System.out.println("Current value for " + traitName + ": " + newCharacter.getTraitValue(traitName));
                            System.out.println("Enter new value for " + traitName + ":");
                            String newValue = scan.nextLine();
                            newCharacter.setTraitValue(traitName, newValue); // Update the trait value
                            System.out.println("Trait updated: " + traitName + " to " + newValue);
                        } else {
                            System.out.println("Trait not found for this character.");
                        }
                    }
                    break;

                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }

            // Display traits again to show updates
            System.out.println();
        }

        // After exiting the loop, print the final traits for confirmation
        System.out.println("Final Traits for " + newCharacter.getName() + ":"); // Always use getName()
        newCharacter.displayTraits(); // Display the final traits
    }

    // Method to edit the character's traits
    public static void editCharacterTraits(Character character) {
        Scanner scan = new Scanner(System.in);
        boolean editing = true;

        while (editing) {
            System.out.println("Current Traits for " + character.getName() + ": " + character.getTraits());
            System.out.println("Which trait would you like to edit? (Type 'done' to finish editing)");

            String traitName = scan.nextLine();
            if (traitName.equalsIgnoreCase("done")) {
                editing = false; // Exit the editing loop
            } else {
                // Check if the trait exists
                if (character.getTraitValue(traitName) != null) {
                    System.out.println("Enter new value for " + traitName + ":");
                    String newValue = scan.nextLine();
                    character.setTraitValue(traitName, newValue); // Update the trait value
                } else {
                    System.out.println("Trait not found for this character.");
                }
            }
        }
        // Print current traits after editing
        System.out.println("Updated Traits for " + character.getName() + ": " + character.getTraits());
    }
}
