package weekNine;

public class VIPBAMS_Sub extends Person {
    private int VIPLevel;  // Unique variable for VIPBAMS

    // Constructor for VIPBAMS, using super to initialize common attributes
    public VIPBAMS_Sub(String firstName, String lastName, int customerID, int VIPLevel) {
        super(firstName, lastName, customerID);
        this.VIPLevel = VIPLevel;
    }

    // Getter and setter for the unique variable
    public int getVIPLevel() {
        return VIPLevel;
    }

    public void setVIPLevel(int VIPLevel) {
        this.VIPLevel = VIPLevel;
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return super.toString() + "\nVIP Level: " + VIPLevel;
    }
}
