package weekNine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BAMS {
    private String firstName;
    private String lastName;
    private boolean checking;
    private int initialDeposit;
    private int age;
    private int customerID;
    private int confirmationNumber;
    private static int newCustomerID = 0;
    private static int newConfirmationNumber = 0;

    // Constructor for regular accounts
    public BAMS() {
        Scanner scn = new Scanner(System.in);

        // Loop until valid input is received for all fields
        boolean keepGoing = true;
        while (keepGoing) {
            try {
                System.out.println("What is your first name?");
                setFirstName(scn.nextLine());

                System.out.println("What is your last name?");
                setLastName(scn.nextLine());

                System.out.println("Is it a checking account? Please type true or false.");
                setChecking(scn.nextBoolean());
                scn.nextLine(); // consume the newline

                System.out.println("How much would you like to deposit? Input a number only.");
                setInitialDeposit(scn.nextInt());
                scn.nextLine(); // consume the newline

                System.out.println("How old are you? Input a number only.");
                setAge(scn.nextInt());
                scn.nextLine(); // consume the newline

                // Assign customer ID and confirmation number, then increment
                setCustomerID(newCustomerID);
                setConfirmationNumber(newConfirmationNumber);

                newCustomerID++;
                newConfirmationNumber++;

                keepGoing = false; // Exit the loop if everything is successful

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter the correct data type.");
                scn.nextLine(); // clear invalid input
            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
                scn.nextLine(); // clear invalid input
            }
        }
    }

    // Constructor for VIP accounts (no age or initial deposit)
    public BAMS(boolean isVIP) {
        Scanner scn = new Scanner(System.in);

        if (isVIP) {
            // Loop until valid input is received for all fields
            boolean keepGoing = true;
            while (keepGoing) {
                try {
                    System.out.println("What is your first name?");
                    setFirstName(scn.nextLine());

                    System.out.println("What is your last name?");
                    setLastName(scn.nextLine());

                    System.out.println("Is it a checking account? Please type true or false.");
                    setChecking(scn.nextBoolean());
                    scn.nextLine(); // consume the newline

                    // Assign customer ID and confirmation number, then increment
                    setCustomerID(newCustomerID);
                    setConfirmationNumber(newConfirmationNumber);

                    newCustomerID++;
                    newConfirmationNumber++;

                    keepGoing = false; // Exit the loop if everything is successful

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter the correct data type.");
                    scn.nextLine(); // clear invalid input
                } catch (Exception e) {
                    System.out.println("An error occurred. Please try again.");
                    scn.nextLine(); // clear invalid input
                }
            }
        }
    }

    // Getter and setter methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isChecking() {
        return checking;
    }

    public void setChecking(boolean checking) {
        this.checking = checking;
    }

    public int getInitialDeposit() {
        return initialDeposit;
    }

    public void setInitialDeposit(int initialDeposit) {
        this.initialDeposit = initialDeposit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    // Method to print account details
    public void printMethod() {
        System.out.println(getFirstName() + " " + getLastName());

        if (isChecking()) {
            System.out.println("Account Type: Checking");
        } else {
            System.out.println("Account Type: Savings");
        }

        if (getAge() > 0) {
            System.out.println(getAge() + " Years old");
        } else {
            System.out.println("Age: Not provided");
        }

        // Print initial deposit only if it's provided
        if (getInitialDeposit() > 0) {
            System.out.println("Initial Deposit: $" + getInitialDeposit());
        } else {
            System.out.println("Initial Deposit: Not provided");
        }

        System.out.println("Customer ID: " + getCustomerID());
        System.out.println("Confirmation Number: " + getConfirmationNumber());
    }
}
