package labSix;

import java.util.Scanner;

public class Rectangle {
    static Scanner  scn = new Scanner(System.in);

    public static void main(String[] args) {
        double length,width,area;
        length = getLength();
        width = getWidth();
        area = getArea(length, width);
        displayData(length, width, area);

        scn.close();
    }
    public static double getLength() {
        double length = 0;
        try {
            System.out.println("Enter the length of the rectangle: ");
            length = Double.parseDouble(scn.nextLine());
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException, please enter a valid number.");
        }

        return length;
    }
    public static double getWidth() {
        double width = 0;
        try{
            System.out.println("Enter the width of the rectangle: ");
            width = Double.parseDouble(scn.nextLine());
        }
        catch (NumberFormatException e){
            System.out.println("NumberFormatException, please enter a valid number.");
        }

        return width;
    }
    public static double getArea(double length, double width) {
        double area = 0;
        try {
            area = length * width;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic error, try again.");
        }

        return area;
    }
    public static void displayData(double length, double width, double area) {
        System.out.println("The length is: " + length + "\n The width is:" + width + "\n The area is:" + area);
    }
}
