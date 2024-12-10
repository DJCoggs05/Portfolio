package weekSeven;
import java.util.Random;
import java.util.Scanner;

public class MovieSimulatorThree {
    // Constants for seat availability array
    static final int ROWS = 5;
    static final int COLUMNS = 10;

    public static void main(String[] args) {
        try {
            // Predefined arrays for movie details
            String[] movieNames = {"Inception", "The Matrix", "Avengers", "Interstellar"};
            String[] movieTypes = {"Sci-Fi", "Action", "Superhero", "Sci-Fi"};
            double[] moviePrices = {10.0, 9.0, 12.5, 11.0};

            // Display the movie details
            displayMovieDetails(movieNames, movieTypes, moviePrices);

            // Step 1a: Call selectMovie() and store the returned index
            int index = selectMovie(movieNames);

            // Step 1b: Call displaySelectedMovie() to display the selected movie's details
            displaySelectedMovie(movieNames[index], movieTypes[index], moviePrices[index]);

            // Initialize seat availability (2D array)
            int[][] movieAvailability = new int[ROWS][COLUMNS];

            // Set initial seat availability
            setSeatAvailability(movieAvailability);

            // Display initial seat availability
            System.out.println("\nInitial Seat Availability:");
            displaySeatAvailability(movieAvailability);

            // Randomize seat availability
            randomizeAvailability(movieAvailability);

            // Display randomized seat availability
            System.out.println("\nRandomized Seat Availability:");
            displaySeatAvailability(movieAvailability);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Step 2: Method to select a movie and return its index
    public static int selectMovie(String[] movieNames) {
        Scanner scanner = new Scanner(System.in);
        int index = -1;
        boolean found = false;

        // Loop until a valid movie is selected
        while (!found) {
            System.out.print("Enter the name of the movie you'd like to select: ");
            String selectedMovie = scanner.nextLine();

            // Check if the selected movie exists in the movieNames array
            for (int i = 0; i < movieNames.length; i++) {
                if (movieNames[i].equalsIgnoreCase(selectedMovie)) {
                    index = i;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Movie not found. Try again.");
            }
        }
        return index;
    }

    // Step 3: Method to display the selected movie's details
    public static void displaySelectedMovie(String name, String type, double price) {
        System.out.println("\nSelected Movie:");
        System.out.printf("%-20s %-15s %-10s\n", "Movie Name", "Movie Type", "Price ($)");
        System.out.printf("%-20s %-15s $%-10.2f\n", name, type, price);
    }


    // Step 4: Initialize seat availability (all seats are available = 0)
    public static void setSeatAvailability(int[][] availability) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                availability[i][j] = 0;  // 0 means the seat is available
            }
        }
    }

    // Step 4: Randomize seat availability (0 = empty, 1 = occupied)
    public static void randomizeAvailability(int[][] availability) {
        Random rand = new Random();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                availability[i][j] = rand.nextInt(2);  // Randomly assign 0 or 1
            }
        }
    }

    // Step 5: Display movie details
    public static void displayMovieDetails(String[] names, String[] types, double[] prices) {
        System.out.println("Movie Details:");
        System.out.printf("%-20s %-15s %-10s\n", "Movie Name", "Movie Type", "Price ($)");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s %-15s $%-10.2f\n", names[i], types[i], prices[i]);
        }
    }

    // Step 5: Display seat availability with theater-style labels
    public static void displaySeatAvailability(int[][] availability) {
        System.out.println("Seat Availability (0 = Available, 1 = Occupied):");

        // Print column headers (seats numbered from 1 to 10)
        System.out.print("  ");
        for (int i = 1; i <= COLUMNS; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Print rows labeled A to E and the seat availability
        char rowLabel = 'A';
        for (int i = 0; i < ROWS; i++) {
            System.out.print(rowLabel + " ");
            rowLabel++;
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(availability[i][j] + " ");
            }
            System.out.println();  // Newline after each row
        }
    }
}
