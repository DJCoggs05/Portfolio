package weekFive;
import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of elements in the arrays
        System.out.print("Enter the number of elements for the arrays: ");
        final int SIZE = scanner.nextInt();

        // Declare four arrays of the specified size
        int[] array1 = new int[SIZE];
        int[] array2 = new int[SIZE];
        int[] array3 = new int[SIZE];
        int[] array4 = new int[SIZE];

        // Step 1: Initialize and print array1
        System.out.println("Enter the elements for array1:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element at index " + i + ": ");
            array1[i] = scanner.nextInt();
        }

        // Print array1
        System.out.println("Array1:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        // Step 2: Copy array1's elements to array2 and print array2
        for (int i = 0; i < SIZE; i++) {
            array2[i] = array1[i];
        }

        // Print array2
        System.out.println("Array2 (Copy of Array1):");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // Step 3: Copy array1's elements squared to array3 and print array3
        for (int i = 0; i < SIZE; i++) {
            array3[i] = array1[i] * array1[i];
        }

        // Print array3
        System.out.println("Array3 (Array1 elements squared):");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

        // Step 4: Copy array1's elements in reverse order to array4 and print array4
        for (int i = 0; i < SIZE; i++) {
            array4[i] = array1[SIZE - 1 - i];
        }

        // Print array4
        System.out.println("Array4 (Array1 elements in reverse):");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
