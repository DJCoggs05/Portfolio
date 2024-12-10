package weekFive;
import java.util.Scanner;

public class arrayFromInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create three arrays
        String[] names = new String[3];
        int[] ages = new int[3];
        String[] cities = new String[3];

        // Populate the arrays with user input
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            scanner.nextLine();  // consume the leftover newline character

            System.out.print("Enter city for " + names[i] + ": ");
            cities[i] = scanner.nextLine();
        }

        // Print the table header
        System.out.printf("%-15s %-10s %-15s%n", "Name", "Age", "City");

        // Print each element in the arrays as a row in the table
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %-10d %-15s%n", names[i], ages[i], cities[i]);
        }

        // Close the scanner
        scanner.close();
    }
}
