package weekThree;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int t1, t2, t3;
        Scanner scn = new Scanner(System.in);

        System.out.println("What is the length of first the side?");
        t1 = scn.nextInt();
        System.out.println("What is the length of second the side?");
        t2 = scn.nextInt();
        System.out.println("What is the length of third the side?");
        t3 = scn.nextInt();

        if (t1 == t2 && t2 == t3) {
            System.out.println("The triangle is equilateral.");
        }
        else if (t1 == t2 || t2 == t3 || t1 == t3) {
            System.out.println("The triangle is Isosceles.");
        }
        else {
            System.out.println("The triangle is Scalene.");
        }

    }
}
