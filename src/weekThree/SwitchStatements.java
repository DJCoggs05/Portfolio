package weekThree;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        String grade;
        Scanner scn = new Scanner(System.in);
        System.out.println("What is your letter grade?");
        grade = scn.nextLine();
        switch(grade) {
            case "A" -> System.out.println("GPA is 4.0");
            case "B" -> System.out.println("GPA is 3.0");
            case "C" -> System.out.println("GPA is 2.0");
            case "D" -> System.out.println("GPA is 1.0");
            case "F" -> System.out.println("GPA is 0.0");
            default -> System.out.println("Invalid Grade");
        }
    }
}
