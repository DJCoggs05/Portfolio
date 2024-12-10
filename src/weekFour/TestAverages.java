package weekFour;
import java.util.Scanner;

public class TestAverages {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Ask how many students there are
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

        // Ask how many test scores there are per student
        System.out.print("Enter the number of test scores per student: ");
        int numberOfTests = scanner.nextInt();

        double classTotalScore = 0; // Variable to accumulate all students' scores
        int totalTestScores = numberOfStudents * numberOfTests; // Total number of test scores in the class

        // Loop through each student
        for (int student = 1; student <= numberOfStudents; student++) {
            double totalScore = 0; // Variable to accumulate test scores for each student

            // For each student, loop through and ask for each test score
            System.out.println("Entering scores for Student " + student + ":");

            for (int test = 1; test <= numberOfTests; test++) {
                System.out.print("Enter score for test " + test + ": ");
                double score = scanner.nextDouble();
                totalScore += score; // Add score to the student's total
                classTotalScore += score; // Add score to the class total
            }

            // Calculate the average test score for the current student
            double averageScore = totalScore / numberOfTests;

            // Print the average test score for the current student
            System.out.println("Average score for Student " + student + ": " + averageScore);
            System.out.println();
        }

        // Calculate the class average by dividing the total class score by the total number of test scores
        double classAverage = classTotalScore / totalTestScores;

        // Print the class average score
        System.out.println("Class average score: " + classAverage);

        // Close the scanner
        scanner.close();
    }
}
