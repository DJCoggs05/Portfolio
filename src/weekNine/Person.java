package weekNine;

public class Person {
    private String firstName;
    private String lastName;
    private int customerID;

    // Constructor to initialize common variables
    public Person(String firstName, String lastName, int customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerID = customerID;
    }

    // Getters and setters
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

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    // toString method to display common info (can be overridden)
    @Override
    public String toString() {
        return "Customer ID: " + customerID + "\nName: " + firstName + " " + lastName;
    }
}
