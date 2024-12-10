package Project1;

import javax.swing.*;
import java.util.Random;

public class characterBattle {
    public static void main(String[] args) {
        String rounds = "";
        int roundNum = 0;
        boolean isEven = true;

        // Ask for the number of rounds and handle invalid input
        while (isEven) {
            rounds = JOptionPane.showInputDialog("How many rounds would you like to play? (Enter an odd number or 'q' to quit)");
            if (rounds.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Game has been quit.");
                System.exit(0);
            }
            try {
                roundNum = Integer.parseInt(rounds);
                if (roundNum % 2 == 1) { // Check if the number of rounds is odd
                    isEven = false; // Valid input, break the loop
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter an odd number of rounds.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }

        int player1Wins = 0;
        int player2Wins = 0;

        // Loop through the rounds
        for (int i = 1; i <= roundNum; i++) {
            String characterName1 = JOptionPane.showInputDialog("Player one, enter the Name for your character: ");
            if (characterName1.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Game has been quit.");
                System.exit(0);
            }

            int characterHP1Int = getValidIntInput("Player one, enter the Health Points for your character: ");
            int characterMP1Int = getValidIntInput("Player one, enter the Move Power for your character: ");
            int characterAS1Int = getValidIntInput("Player one, enter the Attack Speed for your character: ");
            //int characterM1Int = getValidIntInput("Player one, enter the move for your character: ");

            String characterName2 = JOptionPane.showInputDialog("Player two, enter the Name for your character: ");
            if (characterName2.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Game has been quit.");
                System.exit(0);
            }

            int characterHP2Int = getValidIntInput("Player two, enter the Health Points for your character: ");
            int characterMP2Int = getValidIntInput("Player two, enter the Move Power for your character: ");
            int characterAS2Int = getValidIntInput("Player two, enter the Attack Speed for your character: ");
            //int characterM2Int = getValidIntInput("Player two, enter the move for your character: ");
            boolean roundOver = false;

            // Determine which character strikes first
            while (!roundOver && characterHP1Int > 0 && characterHP2Int > 0) {
                if (characterAS1Int > characterAS2Int) { // Player 1 strikes first
                    characterHP2Int -= characterMP1Int; // Player 1 attacks Player 2
                    if (characterHP2Int <= 0) {
                        JOptionPane.showMessageDialog(null, "Player 1 wins the round!");
                        player1Wins++;
                        roundOver = true;
                    } else {
                        characterHP1Int -= characterMP2Int; // Player 2 attacks Player 1
                        if (characterHP1Int <= 0) {
                            JOptionPane.showMessageDialog(null, "Player 2 wins the round!");
                            player2Wins++;
                            roundOver = true;
                        }
                    }
                } else if (characterAS2Int > characterAS1Int) { // Player 2 strikes first
                    characterHP1Int -= characterMP2Int; // Player 2 attacks Player 1
                    if (characterHP1Int <= 0) {
                        JOptionPane.showMessageDialog(null, "Player 2 wins the round!");
                        player2Wins++;
                        roundOver = true;
                    } else {
                        characterHP2Int -= characterMP1Int; // Player 1 attacks Player 2
                        if (characterHP2Int <= 0) {
                            JOptionPane.showMessageDialog(null, "Player 1 wins the round!");
                            player1Wins++;
                            roundOver = true;
                        }
                    }
                } else { // Speeds are equal, use random number to decide
                    Random random = new Random();
                    if (random.nextBoolean()) { // Player 1 strikes first
                        characterHP2Int -= characterMP1Int;
                        if (characterHP2Int <= 0) {
                            JOptionPane.showMessageDialog(null, "Player 1 wins the round!");
                            player1Wins++;
                            roundOver = true;
                        } else {
                            characterHP1Int -= characterMP2Int; // Player 2 attacks Player 1
                            if (characterHP1Int <= 0) {
                                JOptionPane.showMessageDialog(null, "Player 2 wins the round!");
                                player2Wins++;
                                roundOver = true;
                            }
                        }
                    } else { // Player 2 strikes first
                        characterHP1Int -= characterMP2Int;
                        if (characterHP1Int <= 0) {
                            JOptionPane.showMessageDialog(null, "Player 2 wins the round!");
                            player2Wins++;
                            roundOver = true;
                        } else {
                            characterHP2Int -= characterMP1Int; // Player 1 attacks Player 2
                            if (characterHP2Int <= 0) {
                                JOptionPane.showMessageDialog(null, "Player 1 wins the round!");
                                player1Wins++;
                                roundOver = true;
                            }
                        }
                    }
                }
            }
        }

        // Display the final scores
        JOptionPane.showMessageDialog(null, "Final Scores:\nPlayer 1: " + player1Wins + " wins\nPlayer 2: " + player2Wins + " wins");

        // Determine the overall winner
        if (player1Wins > player2Wins) {
            JOptionPane.showMessageDialog(null, "Player 1 wins the battle!");
        } else {
            JOptionPane.showMessageDialog(null, "Player 2 wins the battle!");
        }
    }

    // Helper method to get valid integer input from the user
    private static int getValidIntInput(String message) {
        String input;
        int value = 0;
        boolean valid = false;

        while (!valid) {
            input = JOptionPane.showInputDialog(message);
            if (input.equalsIgnoreCase("q")) {
                JOptionPane.showMessageDialog(null, "Game has been quit.");
                System.exit(0);
            }
            try {
                value = Integer.parseInt(input);
                valid = true; // Input is valid
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }
        return value;
    }
}
