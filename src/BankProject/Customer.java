package Project3;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String firstName;
    private String lastName;
    private String pin;
    private List<Account> accounts;

    public Customer(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public Account getAccountByNumber(int accountNumber) {
        return accounts.stream()
                .filter(acc -> acc.getAccountNumber() == accountNumber)
                .findFirst()
                .orElse(null);
    }

    public String getAccountsInfo() {
        if (accounts.isEmpty()) return "No accounts available.";
        StringBuilder sb = new StringBuilder();
        accounts.forEach(account -> sb.append(account.toString()).append("\n"));
        return sb.toString();
    }

    public String getPin() {
        return pin;
    }

    @Override
    public String toString() {
        return "Customer Name: " + firstName + " " + lastName + ", PIN: " + pin;
    }
}
