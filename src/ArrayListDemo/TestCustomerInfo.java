package ArrayListDemo;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCustomerInfo {
    public static void main(String[] args) {
        ArrayList<String> courseNames = new ArrayList<>();
        ArrayList<Double> gpas = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<String> letterGrades = new ArrayList<>();

        Scanner scnr = new Scanner(System.in);
        String input;

        System.out.println("Enter course information: (course name, GPA, score, letter grade), or 'q' to quit:");

        // Read user input
        while (true) {
            input = scnr.next();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            courseNames.add(input);
            gpas.add(scnr.nextDouble());
            scores.add(scnr.nextInt());
            letterGrades.add(scnr.next());
        }

        // Print the course information table
        System.out.println("\nCourse Info Table:");
        for (int i = 0; i < courseNames.size(); i++) {
            System.out.println("Course: " + courseNames.get(i) + ", GPA: " + gpas.get(i) + ", Score: " + scores.get(i) + ", Letter Grade: " + letterGrades.get(i));
        }
    }
}
