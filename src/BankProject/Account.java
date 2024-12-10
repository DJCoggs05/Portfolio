package Project3;
public class Account {
    private static int numberOfAccounts = 0;
    private int accountNumber;
    private double balance;

    public Account(double initialDeposit) {
        this.accountNumber = ++numberOfAccounts;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount + ", Updated Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ", Updated Balance: $" + balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}
