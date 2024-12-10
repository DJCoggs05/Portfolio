package weekTwo;
import java.util.Scanner;

public class ActivityOne {
    public static void main(String[] args) {
        double P,r,A;
        int n,t;
        System.out.println("Enter in the principal amount: ");
        Scanner scn = new Scanner(System.in);
        P = Double.parseDouble(scn.nextLine());
        System.out.println("Enter in the annual interest rate");
        r = Double.parseDouble(scn.nextLine());
        r = r / 100;
        System.out.println("Enter in the number of times compounded");
        n = Integer.parseInt(scn.nextLine());
        System.out.println("Enter in the years: ");
        t = Integer.parseInt(scn.nextLine());
        A = P * Math.pow((1 + r / n),(n * t));
        System.out.printf("After %d years you will have: $ %.2f",t,A);
    }
}
