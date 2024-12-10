package November;

import java.util.HashMap;

public class BankAccount {
    // Fields/Variables (States)
    private String accountHolderName;
    private String accountNumber;
    private String accountType;
    private HashMap<String, String> transactionHistory;

    // Constructor
    public BankAccount(String accountHolderName, String accountNumber, String accountType) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.transactionHistory = new HashMap<>();
    }

    // Method to add a transaction to the HashMap
    public void addTransaction(String transactionID, String details) {
        transactionHistory.put(transactionID, details);
        System.out.println("Added transaction: " + transactionID + " -> " + details);
    }

    // Method to remove a transaction from the HashMap by transaction ID
    public void removeTransaction(String transactionID) {
        if (transactionHistory.containsKey(transactionID)) {
            transactionHistory.remove(transactionID);
            System.out.println("Removed transaction with ID: " + transactionID);
        } else {
            System.out.println("Transaction ID " + transactionID + " not found.");
        }
    }

    // Method to retrieve transaction details for a specific transaction ID
    public String getTransaction(String transactionID) {
        return transactionHistory.getOrDefault(transactionID, "Transaction not found.");
    }

    // Method to display all transactions
    public void displayAllTransactions() {
        System.out.println("Transaction History:");
        for (String transactionID : transactionHistory.keySet()) {
            System.out.println("ID: " + transactionID + ", Details: " + transactionHistory.get(transactionID));
        }
    }
}
