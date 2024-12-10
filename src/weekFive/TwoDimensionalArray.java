package weekFive;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Step 1: Create and initialize a 2D int array with 4 inner arrays and at least 3 elements each
        int[][] array1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        // Print array1 elements using a standard for loop
        System.out.println("Array 1 (int) Elements:");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Step 2: Create a 2D double array using the new keyword
        double[][] array2 = new double[4][3];

        // Initialize values for array2
        array2[0][0] = 1.1; array2[0][1] = 1.2; array2[0][2] = 1.3;
        array2[1][0] = 2.1; array2[1][1] = 2.2; array2[1][2] = 2.3;
        array2[2][0] = 3.1; array2[2][1] = 3.2; array2[2][2] = 3.3;
        array2[3][0] = 4.1; array2[3][1] = 4.2; array2[3][2] = 4.3;

        // Print the array2 elements using an enhanced for loop
        System.out.println("\nArray 2 (double) Elements:");
        for (double[] outerArray : array2) {
            for (double value : outerArray) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }

        // Step 3: Create and initialize a 2D String array
        String[][] array3 = {
                {"Hello", "World", "Java"},
                {"Array", "Example", "Strings"}
        };

        // Print the array3 elements using an enhanced for loop
        System.out.println("\nArray 3 (String) Elements:");
        for (String[] outerArray : array3) {
            for (String value : outerArray) {
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
