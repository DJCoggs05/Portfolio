package Recursion;
public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();


        System.out.println("Testing countDown:");
        recursion.countDown(5);

        System.out.println("\nTesting countDown with edge case:");
        recursion.countDown(0);

        System.out.println("\nTesting countDown with a large number:");
        recursion.countDown(10);


        System.out.println("\nTesting alphaBackwards:");
        recursion.alphaBackwards('z');

        System.out.println("\nTesting alphaBackwards with edge case:");
        recursion.alphaBackwards('a');

        System.out.println("\nTesting alphaBackwards with uppercase letters:");
        recursion.alphaBackwards('Z');


        System.out.println("\nTesting factorial:");
        System.out.println("Factorial of 5: " + recursion.factorial(5)); // Example: 120
        System.out.println("Factorial of 0: " + recursion.factorial(0)); // Edge case: 1


        System.out.println("\nTesting sumOfDigits:");
        System.out.println("Sum of digits in 1234: " + recursion.sumOfDigits(1234)); // Example: 10
        System.out.println("Sum of digits in 0: " + recursion.sumOfDigits(0)); // Edge case: 0
    }
}
