package Project2;

import java.util.Scanner;
import java.util.Random;

public class TestScores {
    public static void main(String[] args) {

        Random random = new Random();
        final int SIZE = random.nextInt(8) + 3;  // Random number between 3 and 10

        int[] testScores = new int[SIZE];

        char[] letterGrades = new char[SIZE];

        System.out.println("Number of test scores to be entered: " + SIZE);

        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Enter test score " + (i + 1) + ": ");
            testScores[i] = scn.nextInt();
        }

        for (int i = 0; i < SIZE; i++) {
            letterGrades[i] = getLetterGrade(testScores[i]);
        }
        printGrades(testScores, letterGrades);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
        scn.close();
    }

    // II. getLetterGrade() method
    public static char getLetterGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // III. printGrades() method
    public static void printGrades(int[] scores, char[] grades) {
        System.out.println("\nScore\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i] + "\t" + grades[i]);
        }
    }

    // IV. printHighestScore() method
    public static void printHighestScore(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        System.out.println("Highest score: " + highest);
    }

    // V. printLowestScore() method
    public static void printLowestScore(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        System.out.println("Lowest score: " + lowest);
    }

    // VI. printAverageScore() method
    public static void printAverageScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        double average = (double) total / scores.length;
        System.out.printf("Average score: %.2f\n", average);
    }
}
