package setAndIteratorActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the BankAccountSet class
        BankAccountSet bankAccountSet = new BankAccountSet();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Bank Account Management System");


        while (true) {

            System.out.println("\nMenu Options:");
            System.out.println("1. Add a bank account ID.");
            System.out.println("2. View all bank account IDs.");
            System.out.println("3. Exit the system.");
            System.out.print("Choose an option: ");


            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 1:

                    bankAccountSet.addAccounts();
                    break;
                case 2:

                    bankAccountSet.displayAccounts();
                    break;
                case 3:

                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;
                default:

                    System.out.println("Invalid option. Please choose a valid menu option.");
            }
        }
    }
}
