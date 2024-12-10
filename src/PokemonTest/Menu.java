

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private Pokedex pokedex = new Pokedex();
    boolean display = true;

    public void displayMenu(){
        while(display) {


            System.out.println("Enter an input:");
            System.out.println("1. Create a Pokemon");
            System.out.println("2. Delete a Pokemon");
            System.out.println("3. Display a Pokemon's Info");
            System.out.println("4. Display all Pokemon's Info");
            System.out.println("5. Exit");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("1")) {

                System.out.println("Do you want to: ");
                System.out.println("1. Add an already existing Pokemon (file) ");
                System.out.println("2. Add one manually?");
                int manual = scanner.nextInt();
                scanner.nextLine(); //consume new line

                if (manual == 1){
                    FileRead file = new FileRead();
                    ArrayList<String[]> pokemonData = new ArrayList<>();
                    try{
                       pokemonData = file.readPokemonData("CharacterStatsFile.txt");
                        if (pokemonData.isEmpty()){
                            System.out.println("Pokemon not found.");
                            return;
                        }
                        System.out.println("Available Pokémon:");
                        for (int i = 0; i < pokemonData.size(); i++) {
                            // Split each line of data by commas to get the individual elements
                            String[] pokemonInfo = pokemonData.get(i);
                            if (pokemonInfo.length >= 1) {
                                System.out.println((i + 1) + ". " + pokemonInfo[0]);
                            }
                        }
                        // Prompt the user to select a Pokémon
                        System.out.println("Select a Pokémon by entering the corresponding number:");
                        int selectedIndex = scanner.nextInt() - 1; // Adjust for 0-based index
                        scanner.nextLine(); // Consume newline


                        if (selectedIndex >= 0 && selectedIndex < pokemonData.size()) {
                            String[] selectedPokemonData = pokemonData.get(selectedIndex);


                            String name = selectedPokemonData[0];
                            int hp = Integer.parseInt(selectedPokemonData[1]);
                            String moveName = selectedPokemonData[2];
                            int power = Integer.parseInt(selectedPokemonData[3]);
                            int speed = Integer.parseInt(selectedPokemonData[4]);


                            Pokemon pokemon = new Pokemon(name, hp);
                            Move move = new Move(moveName, power, speed);
                            pokemon.addMove(move);


                            pokedex.addPokemon(pokemon);
                            System.out.println("Pokémon " + name + " has been successfully added from file data.");

                        } else {
                            System.out.println("Invalid selection. Please try again.");
                        }

                    }
                    catch(FileNotFoundException e){
                        e.printStackTrace();
                        System.out.println("File not found.");
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        System.out.println("Unexpected Error...");
                    }


                }
                else if (manual == 2){
                    createPokemon();
                }


            }
            else if (response.equalsIgnoreCase("2")) {
                deletePokemon();
            }
            else if (response.equalsIgnoreCase("3")) {
                displayPokemon();
            }
            else if (response.equalsIgnoreCase("4")) {
                displayAllPokemon();
            }
            else if (response.equalsIgnoreCase("5")) {
                display = false;  // Exit the loop if the user types "5"
            }
            else {
                System.out.println("Invalid Response.");
            }
        }
    }


    public void createPokemon() {
        System.out.println("Enter the Pokemon's name:");
        String name = scanner.nextLine();

        System.out.println("Enter the Pokemon's HP:");
        int hp = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create a new Pokemon
        Pokemon pokemon = new Pokemon(name, hp);

        // Add moves to the Pokemon
        while (true) {
            System.out.println("Enter a Move name (or 'q' to finish):");
            String moveName = scanner.nextLine();

            if (moveName.equalsIgnoreCase("q")) {
                break;
            }

            System.out.println("Enter the Move's power:");
            int power = scanner.nextInt();

            System.out.println("Enter the Move's speed:");
            int speed = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            // Create and add a Move to the Pokemon
            Move move = new Move(moveName, power, speed);
            pokemon.addMove(move);
        }

        // Add Pokemon to Pokedex
        pokedex.addPokemon(pokemon);
        System.out.println("Pokemon " + name + " has been added to the Pokedex.");
    }

    public void deletePokemon() {
        System.out.println("Enter the name of the Pokemon to delete:");
        String name = scanner.nextLine();

        Pokemon pokemon = pokedex.getPokemon(name);
        if (pokemon == null) {
            System.out.println("Pokemon not found.");
        } else {
            pokedex.removePokemon(pokemon);
            System.out.println("Pokemon " + name + " has been removed from the Pokedex.");
        }
    }

    public void displayPokemon() {
        System.out.println("Enter the name of the Pokemon to display:");
        String name = scanner.nextLine();

        Pokemon pokemon = pokedex.getPokemon(name);
        if (pokemon == null) {
            System.out.println("Pokemon not found.");
        } else {
            System.out.println(pokemon);
            for (Move move : pokemon.getMoveArrayList()) {
                System.out.println(move);
            }
        }
    }

    public void displayAllPokemon() {
        ArrayList<Pokemon> pokemonList = pokedex.getAllPokemon();
        if (pokemonList.isEmpty()) {
            System.out.println("No Pokemon in the Pokedex.");
        } else {
            for (Pokemon pokemon : pokemonList) {
                System.out.println(pokemon);
                for (Move move : pokemon.getMoveArrayList()) {
                    System.out.println(move);
                }
                System.out.println(); // Blank line between each Pokemon's info
            }
        }
    }
}