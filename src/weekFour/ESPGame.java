package weekFour;
import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String[] args) {
        // Array of colors
        String[] colors = {"red", "green", "blue", "orange", "yellow"};

        // Variables to keep track of correct guesses
        int correctGuesses = 0;

        // Random number generator
        Random random = new Random();

        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Repeat the guessing game 10 times
        for (int i = 0; i < 10; i++) {
            // Randomly select a color
            int randomColorIndex = random.nextInt(5);
            String selectedColor = colors[randomColorIndex];

            // Ask user to guess the color
            System.out.println("Guess the color (red, green, blue, orange, yellow): ");
            String userGuess = scanner.nextLine().toLowerCase();

            // Display the randomly selected color
            System.out.println("Computer selected: " + selectedColor);

            // Check if the user guessed correctly
            if (userGuess.equals(selectedColor)) {
                System.out.println("Correct guess!");
                correctGuesses++;
            } else {
                System.out.println("Incorrect guess.");
            }

            System.out.println(); // Print a blank line for readability
        }

        // Display the number of correct guesses
        System.out.println("You guessed correctly " + correctGuesses + " out of 10 times.");

        // Close the scanner
        scanner.close();
    }
}
