package weekSix;

import java.util.Scanner;

public class MovieSimulationOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 2: Prompt user to enter how many movies they want to enter
        System.out.print("How many movie details would you like to enter? ");
        final int numMovies = sc.nextInt();
        sc.nextLine();  // Consume newline

        // Step 1: Create arrays for movie details
        String[] movieNames = new String[numMovies];
        String[] movieTypes = new String[numMovies];
        boolean[] movieAvailability = new boolean[numMovies];
        double[] moviePrices = new double[numMovies];

        // Step 2b: Input details for each array using user input
        for (int i = 0; i < numMovies; i++) {
            System.out.println("Enter details for movie " + (i + 1) + ":");

            System.out.print("Movie Name: ");
            movieNames[i] = sc.nextLine();

            System.out.print("Movie Type: ");
            movieTypes[i] = sc.nextLine();

            System.out.print("Is the movie available (true/false): ");
            movieAvailability[i] = sc.nextBoolean();

            System.out.print("Movie Price: ");
            moviePrices[i] = sc.nextDouble();
            sc.nextLine();  // Consume newline
        }

        // Step 3: Call the method to output all movie details
        printMovieDetails(movieNames, movieTypes, movieAvailability, moviePrices);

        // Close the scanner
        sc.close();
    }

    // Step 3a: Output method for all movie details using printf or String.format()
    public static void printMovieDetails(String[] names, String[] types, boolean[] availability, double[] prices) {
        System.out.println("\nMovie Details:");
        System.out.printf("%-20s %-20s %-15s %-10s\n", "Movie Name", "Movie Type", "Available", "Price");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s %-20s %-15s $%-10.2f\n",
                    names[i], types[i], availability[i] ? "Yes" : "No", prices[i]);
        }
    }
}
