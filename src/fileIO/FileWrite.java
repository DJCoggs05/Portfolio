package fileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        String filePath = "courses.txt"; // Adjust path if needed
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath, false))) {
            // Writing header
            writer.printf("%-20s %-20s %-17s %-20s %-20s%n", "User Name", "Password", "Score", "Player Character", "Winning Percentage");

            // Getting user input
            System.out.print("Enter User Name: ");
            String userName = scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();
            System.out.print("Enter Score: ");
            String score = scanner.nextLine();
            System.out.print("Enter Player Character: ");
            String character = scanner.nextLine();
            System.out.print("Enter Winning Percentage: ");
            String percentage = scanner.nextLine();

            // Writing user data under header
            writer.printf("%-20s %-20s %-17s %-20s %-20s%n", userName, password, score, character, percentage);

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
