package weekEight;

public class Person {
    // Public instance variables
    public String firstName;
    public String lastName;

    // Private instance variables
    private int age;
    private String address;
    private String phoneNumber;

    // Constructor that initializes all instance variables
    public Person(String firstName, String lastName, int age, String address, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Public method
    public void displayFullName() {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    // Private method
    private void displayAge() {
        System.out.println("Age: " + age);
    }

    // Protected method
    protected void displayContactInfo() {
        System.out.println("Contact Info: " + phoneNumber);
    }

    // Default access method
    void displayInfo() {
        System.out.println("Address: " + address);
    }

    // Getter and Setter for private instance variables
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
