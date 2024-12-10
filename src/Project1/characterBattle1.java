package Project1;

import javax.swing.*;
import java.util.Random;

public class characterBattle1 {
    public static void main(String[] args) {
        int roundNum = getValidIntInput("How many rounds would you like to play (must be an odd number)?", 1, Integer.MAX_VALUE, true);
        int player1Wins = 0;
        int player2Wins = 0;

        while (roundNum > 0) {
            String characterName1 = getValidStringInput("Player one, enter the Name for your character:");
            int characterHP1Int = getValidIntInput("Player one, enter the Health Points for your character (positive number):", 1, Integer.MAX_VALUE, false);
            int characterMP1Int = getValidIntInput("Player one, enter the Move Power for your character (positive number):", 1, Integer.MAX_VALUE, false);
            int characterAS1Int = getValidIntInput("Player one, enter the Attack Speed for your character (positive number):", 1, Integer.MAX_VALUE, false);

            String characterName2 = getValidStringInput("Player two, enter the Name for your character:");
            int characterHP2Int = getValidIntInput("Player two, enter the Health Points for your character (positive number):", 1, Integer.MAX_VALUE, false);
            int characterMP2Int = getValidIntInput("Player two, enter the Move Power for your character (positive number):", 1, Integer.MAX_VALUE, false);
            int characterAS2Int = getValidIntInput("Player two, enter the Attack Speed for your character (positive number):", 1, Integer.MAX_VALUE, false);

            // Determine who attacks first
            boolean player1First = determineFirstAttacker(characterAS1Int, characterAS2Int);

            boolean roundOngoing = true;
            while (roundOngoing) {
                if (player1First) {
                    characterHP2Int -= characterMP1Int;
                    if (characterHP2Int <= 0) {
                        JOptionPane.showMessageDialog(null, characterName1 + " wins this round!");
                        player1Wins++;
                        roundOngoing = false; // End the round
                    } else {
                        characterHP1Int -= characterMP2Int;
                        if (characterHP1Int <= 0) {
                            JOptionPane.showMessageDialog(null, characterName2 + " wins this round!");
                            player2Wins++;
                            roundOngoing = false; // End the round
                        }
                    }
                } else {
                    characterHP1Int -= characterMP2Int;
                    if (characterHP1Int <= 0) {
                        JOptionPane.showMessageDialog(null, characterName2 + " wins this round!");
                        player2Wins++;
                        roundOngoing = false; // End the round
                    } else {
                        characterHP2Int -= characterMP1Int;
                        if (characterHP2Int <= 0) {
                            JOptionPane.showMessageDialog(null, characterName1 + " wins this round!");
                            player1Wins++;
                            roundOngoing = false; // End the round
                        }
                    }
                }
            }

            // Display round summary
            JOptionPane.showMessageDialog(null, "Round results:\n" +
                    characterName1 + " HP: " + characterHP1Int + "\n" +
                    characterName2 + " HP: " + characterHP2Int + "\n" +
                    "Player 1 wins: " + player1Wins + "\n" +
                    "Player 2 wins: " + player2Wins);

            roundNum--;
        }

        // Final score announcement
        String winnerMessage = player1Wins > player2Wins ?
                "Player 1 is the winner with " + player1Wins + " wins!" :
                "Player 2 is the winner with " + player2Wins + " wins!";
        JOptionPane.showMessageDialog(null, "Game over! Final scores:\n" +
                "Player 1 wins: " + player1Wins + "\n" +
                "Player 2 wins: " + player2Wins + "\n" +
                winnerMessage);

        // Ask for confirmation before quitting the game
        confirmAndExit();
    }

    private static boolean determineFirstAttacker(int speed1, int speed2) {
        if (speed1 > speed2) {
            return true;
        } else if (speed2 > speed1) {
            return false;
        } else {
            // Randomize if speeds are equal
            return new Random().nextBoolean();
        }
    }

    private static int getValidIntInput(String message, int min, int max, boolean requireOdd) {
        String input;
        int value = 0;
        boolean valid = false;

        while (!valid) {
            input = JOptionPane.showInputDialog(message);
            if (input.equalsIgnoreCase("q")) {
                confirmAndExit();
            }
            try {
                value = Integer.parseInt(input);
                if (value < min || value > max || (requireOdd && value % 2 == 0)) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number between " + min + " and " + max + (requireOdd ? " (and an odd number)" : "") + ".");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a number.");
            }
        }
        return value;
    }

    private static String getValidStringInput(String message) {
        String input = "";
        boolean valid = false;

        while (!valid) {
            input = JOptionPane.showInputDialog(message);
            if (input.equalsIgnoreCase("q")) {
                confirmAndExit();
            }
            if (!input.trim().isEmpty()) {
                valid = true;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid name.");
            }
        }
        return input;
    }

    private static void confirmAndExit() {
        int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to quit?", "Confirm Quit", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Game has been quit.");
            System.exit(0);
        }
    }
}
