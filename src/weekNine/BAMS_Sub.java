package weekNine;

public class BAMS_Sub extends Person {
    private String accountType;  // Unique variable for BAMS

    // Constructor for BAMS, using super to initialize common attributes
    public BAMS_Sub(String firstName, String lastName, int customerID, String accountType) {
        super(firstName, lastName, customerID);
        this.accountType = accountType;
    }

    // Getter and setter for the unique variable
    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: " + accountType;
    }
}
