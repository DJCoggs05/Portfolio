package weekSix;
import java.util.Random;

public class MovieSimulationTwo {
    // Constants for seat availability array
    static final int ROWS = 5;
    static final int COLUMNS = 10;

    public static void main(String[] args) {
        try {
            // Step 1a: Predefined arrays for movie details
            String[] movieNames = {"Inception", "The Matrix", "Avengers", "Interstellar"};
            String[] movieTypes = {"Sci-Fi", "Action", "Superhero", "Sci-Fi"};
            double[] moviePrices = {10.0, 9.0, 12.5, 11.0};

            // Display the movie details
            displayMovieDetails(movieNames, movieTypes, moviePrices);

            // Step 1b: Initialize seat availability (2D array)
            int[][] movieAvailability = new int[ROWS][COLUMNS];

            // Step 1c: Set initial seat availability
            setSeatAvailability(movieAvailability);

            // Step 1d: Display initial seat availability
            System.out.println("\nInitial Seat Availability:");
            displaySeatAvailability(movieAvailability);

            // Step 1e: Randomize the seat availability
            randomizeAvailability(movieAvailability);

            // Step 1f: Display randomized seat availability
            System.out.println("\nRandomized Seat Availability:");
            displaySeatAvailability(movieAvailability);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Step 2: Initialize seat availability (all seats are available = 0)
    public static void setSeatAvailability(int[][] availability) {
        try{
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLUMNS; j++) {
                    availability[i][j] = 0;  // 0 means the seat is available
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Step 3: Randomize seat availability (0 = empty, 1 = occupied)
    public static void randomizeAvailability(int[][] availability) {
        try {
            Random rand = new Random();
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLUMNS; j++) {
                    availability[i][j] = rand.nextInt(2);  // Randomly assign 0 or 1
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Step 4: Display movie details
    public static void displayMovieDetails(String[] names, String[] types, double[] prices) {
        try {
            System.out.println("Movie Details:");
            System.out.printf("%-20s %-15s %-10s\n", "Movie Name", "Movie Type", "Price ($)");
            System.out.println("----------------------------------------------------------");

            for (int i = 0; i < names.length; i++) {
                System.out.printf("%-20s %-15s $%-10.2f\n", names[i], types[i], prices[i]);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }

    // Step 5: Display seat availability
    public static void displaySeatAvailability(int[][] availability) {
        try {
            System.out.println("Seat Availability (0 = Available, 1 = Occupied):");
            for (int i = 0; i < ROWS; i++) {
                for (int j = 0; j < COLUMNS; j++) {
                    System.out.print(availability[i][j] + " ");
                }
                System.out.println();  // Newline after each row
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
