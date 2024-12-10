package weekThree;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int evenOdd = scn.nextInt();
        if (evenOdd % 2 == 0) {
            System.out.println(evenOdd + " is even.");
        } else {
            System.out.println(evenOdd + " is odd.");
        }


    }
}
