package November;

public class Main {
    public static void main(String[] args) {
        // Create an instance of BankAccount
        BankAccount account = new BankAccount("John Doe", "123456789", "Checking");

        // Add at least 3 transactions using addTransaction method
        account.addTransaction("T1001", "Deposit, $500, 01/01/2024");
        account.addTransaction("T1002", "Withdrawal, $200, 01/02/2024");
        account.addTransaction("T1003", "Deposit, $300, 01/03/2024");

        // Display all transactions to show the current state of the HashMap
        System.out.println("\nCurrent Transactions:");
        account.displayAllTransactions();

        // Remove one transaction by its transaction ID
        System.out.println("\nRemoving transaction with ID: T1002");
        account.removeTransaction("T1002");

        // Display all transactions again to show the updated state of the HashMap
        System.out.println("\nUpdated Transactions:");
        account.displayAllTransactions();
    }
}
