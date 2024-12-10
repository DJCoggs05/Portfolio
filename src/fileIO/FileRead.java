package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String filePath = "courses.txt"; // Adjust path if needed

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Output each line to the console
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}

//package fileIO;

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;

//public class FileRead {
//    public static void main(String[] args) {
//        String filePath = "courses.txt"; // Adjust path if needed

//        try (Scanner scanner = new Scanner(new File(filePath))) {
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine()); // Output each line to the console
//            }
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred while reading the file.");
//            e.printStackTrace();
//        }
//    }
//}

