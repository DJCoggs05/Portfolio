package weekFour;

public class CFTable {
    public static void main(String[] args) {
        // Print table header
        System.out.println("Celsius\tFahrenheit");
        System.out.println("-------------------");

        // Loop through Celsius temperatures from 0 to 20
        for (int celsius = 0; celsius <= 20; celsius++) {
            // Calculate the Fahrenheit equivalent
            double fahrenheit = (9.0 / 5) * celsius + 32;

            // Print the Celsius and Fahrenheit values
            System.out.printf("%d\t\t%.1f%n", celsius, fahrenheit);
        }
    }
}
