package weekTwo;

import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your first test score:");
        int Score1 = Integer.parseInt(scn.nextLine());
        System.out.println("Enter your second test score:");
        int Score2 = Integer.parseInt(scn.nextLine());
        System.out.println("Enter your third test score:");
        int Score3 = Integer.parseInt(scn.nextLine());

        int average = (Score1 + Score2 + Score3) / 3;
        String letter;
        if (average >= 90) {
            letter = "A";
        }
        else if (average >= 80) {
            letter = "B";
        }
        else if (average >= 70) {
            letter = "C";
        }
        else if (average >= 60) {
            letter = "D";
        }
        else if (average < 60) {
            letter = "F";
        }
        else {
            letter = "A";
        }

        System.out.println("Your test average is " + average + ". And your letter grade average is " + letter);

    }
}