package Recursion;

public class Recursion {


    public void countDown(int number) {
        if (number == 0) {
            System.out.println("Blast Off!");
        } else {
            System.out.println(number);
            countDown(number - 1); // Recursive call
        }
    }


    public void alphaBackwards(char letter) {
        if (letter == 'a' || letter == 'A') {
            System.out.println(letter);
        } else {
            System.out.println(letter);
            alphaBackwards((char) (letter - 1)); // Recursive call
        }
    }


    public int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }


    public int sumOfDigits(int number) {
        if (number == 0) return 0;
        return (number % 10) + sumOfDigits(number / 10);
    }
}
