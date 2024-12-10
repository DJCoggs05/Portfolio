package weekTwo;

import java.util.Scanner;

public class ScannerRectangleArea {
    public static void main(String[] args) {
        int length = 0;
        int width = 0;
        int area;

        System.out.println("Enter the length: ");
        Scanner scn = new Scanner(System.in);
        length = Integer.parseInt(scn.nextLine());
        System.out.println("Enter the width: ");
        width = Integer.parseInt(scn.nextLine());
        area = width * length;
        System.out.println("The area is:" + area);


    }

}
