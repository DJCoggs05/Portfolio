package Project3;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Bank bank;

    public Menu() {
        scanner = new Scanner(System.in);
        bank = new Bank();
    }

    public void runMenu() {
        int choice;
        do {
            displayMainMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> openNewAccount();
                case 2 -> accessAccount();
                case 3 -> closeAllAccounts();
                case 4 -> System.out.println("Exiting system. Goodbye!");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void displayMainMenu() {
        System.out.println("""
                Main Menu:
                1. Open a New Account
                2. Access an Existing Account
                3. Close All Accounts
                4. Exit
                Enter your choice:""");
    }

    private void openNewAccount() {
        System.out.println("Are you a new customer? (yes/no)");
        String response = scanner.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            Customer newCustomer = createNewCustomer();
            System.out.print("Enter initial deposit for new account: ");
            double deposit = scanner.nextDouble();
            scanner.nextLine();
            Account account = new Account(deposit);
            newCustomer.addAccount(account);
            System.out.println("New Account Opened: " + account);
        }
        else if (response.equalsIgnoreCase("no")) {
            System.out.print("Enter your PIN: ");
            String pin = scanner.nextLine();
            Customer existingCustomer = bank.getCustomerByPin(pin);
            if (existingCustomer == null) {
                System.out.println("Invalid PIN.");
                return;
            }
            System.out.print("Enter initial deposit for new account: ");
            double deposit = scanner.nextDouble();
            scanner.nextLine();
            Account account = new Account(deposit);
            existingCustomer.addAccount(account);
            System.out.println("New Account Opened: " + account);
        }
        else {
            System.out.println("Invalid response, returning to main menu.");
        }
    }

    private Customer createNewCustomer() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter a 4-digit PIN: ");
        String pin = scanner.nextLine();
        Customer customer = new Customer(firstName, lastName, pin);
        bank.addCustomer(customer);
        return customer;
    }

    private void accessAccount() {
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();
        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("Invalid PIN.");
            return;
        }
        System.out.println("Your accounts:");
        System.out.println(customer.getAccountsInfo());
        System.out.print("Enter the account number to access: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();
        Account account = customer.getAccountByNumber(accountNumber);
        if (account == null) {
            System.out.println("Invalid account number.");
            return;
        }
        displayAccountMenu(account);
    }

    private void displayAccountMenu(Account account) {
        int choice;
        do {
            System.out.println("""
                    Account Menu:
                    1. Deposit
                    2. Withdraw
                    3. Check Balance
                    4. Exit to Main Menu
                    Enter your choice:""");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter deposit amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account.deposit(amount);
                }
                case 2 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdraw(amount);
                }
                case 3 -> System.out.println("Current Balance: $" + account.getBalance());
                case 4 -> System.out.println("Exiting to Main Menu.");
                default -> System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private void closeAllAccounts() {
        System.out.print("Enter your PIN: ");
        String pin = scanner.nextLine();
        Customer customer = bank.getCustomerByPin(pin);
        if (customer == null) {
            System.out.println("Invalid PIN.");
            return;
        }
        System.out.println("Are you sure?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int confirm = scanner.nextInt();
        if (confirm == 1){
            bank.removeCustomer(customer);
            System.out.println("Customer removed and all accounts closed.");
        }
        else if (confirm == 2){
            System.out.println("Cancelling account deletion and returning to main menu.");
        }
        else{
            System.out.println("Incorrect entry, returning to main menu.");
        }

    }
}
