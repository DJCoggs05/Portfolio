package weekFour;

import javax.swing.*;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int rand_int = random.nextInt(101);  // Random number between 0 and 100
        String guess;
        int guessNumber = -1;  // Initialize with a value outside the range

        System.out.println(rand_int);  // Debugging line to show the random number

        while (guessNumber != rand_int) {
            guess = JOptionPane.showInputDialog("Guess a number between 0 and 100 (or enter 'q' to quit)");

            // Check if the user wants to quit
            if (guess != null && guess.equals("q")) {
                JOptionPane.showMessageDialog(null, "The number was " + rand_int);
                return;  // Exit the program
            }

            try {
                guessNumber = Integer.parseInt(guess);  // Convert the input to an integer
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter a valid number or 'q' to quit.");
                continue;  // Skip to the next iteration of the loop
            }

            if (guessNumber != rand_int) {
                JOptionPane.showMessageDialog(null, "Incorrect! Try again.");
            }
        }

        JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number!");
    }
}
