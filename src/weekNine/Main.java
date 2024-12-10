package weekNine;

public class Main {
    public static void main(String[] args) {
        // Creating instances of BAMS and VIPBAMS
        BAMS_Sub regularCustomer = new BAMS_Sub("John", "Doe", 1001, "Checking");
        VIPBAMS_Sub vipCustomer = new VIPBAMS_Sub("Jane", "Smith", 1002, 5);

        // Demonstrating polymorphism by storing subclass objects in superclass references
        Person customer1 = regularCustomer;
        Person customer2 = vipCustomer;

        // Calling overridden toString() methods
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
    }
}
