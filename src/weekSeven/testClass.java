package weekSeven;

public class testClass {
    // Instance variables
    private String title;
    private String genre;
    private double rating;

    // Constructor
    public testClass(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    // Method to print movie details
    public void printMovieDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
    }
}
