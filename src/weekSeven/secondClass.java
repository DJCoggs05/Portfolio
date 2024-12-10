package weekSeven;

public class secondClass {
    public static void main(String[] args) {
        // Create an instance of Movie
        testClass movie1 = new testClass("Inception", "Sci-Fi", 8.8);
        testClass movie2 = new testClass("The Godfather", "Crime", 9.2);

        // Call methods from Movie class
        System.out.println("Movie Details:");
        movie1.printMovieDetails();
        System.out.println();
        movie2.printMovieDetails();
        System.out.println();
    }
}