package setAndIteratorActivity;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class BankAccountSet {

    // Field (States): Define a Set<String> named accounts
    private Set<String> accounts = new HashSet<>();

    // Method 1: addAccounts()
    public void addAccounts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter bank account IDs to add (enter '0' to quit):");

        while (true) {

            String account = scanner.nextLine();


            if (account.equals("0")) {
                return;
            }

            // Add the account to the accounts set (duplicates are ignored automatically)
            boolean added = accounts.add(account);
            if (added) {
                System.out.println("Account ID " + account + " added successfully.");
            } else {
                System.out.println("Account ID " + account + " already exists. Not added.");
            }
        }
    }

    // Method 2: displayAccounts()
    public void displayAccounts() {
        // Create an Iterator<String> for the accounts set
        Iterator<String> iterator = accounts.iterator();


        System.out.println("Bank Account IDs:");


        if (!iterator.hasNext()) {
            System.out.println("No accounts available.");
        }
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }
    }
}
