package weekTwo;

import java.util.Scanner;

public class BookClubPoints {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("How many books did you read?");
        int booksRead;
        int points = 0;
        booksRead = Integer.parseInt(scn.nextLine());
        if (booksRead == 1) {
            points = points + 5;
        }
        else if (booksRead == 2) {
            points = points + 15;
        }
        else if (booksRead == 3) {
            points = points + 30;
        }
        else if (booksRead >= 4) {
            points = points + 60;
        }
        else {
            points = 0;
        }
        System.out.println("You have " + points + " points!");

    }
}
