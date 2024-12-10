package weekEight;

public class PersonTest {
    public static void main(String[] args) {
        // Instantiate the Person class using the constructor
        Person person = new Person("John", "Doe", 30, "123 Main St", "555-1234");

        // Test public variables
        System.out.println("First Name: " + person.firstName); // Accessible
        System.out.println("Last Name: " + person.lastName);   // Accessible

        // Call public method
        person.displayFullName(); // Accessible

        // Test private method (will cause error if uncommented)
        // person.displayAge(); // Not accessible

        // Call protected method (accessible because it's called within the same package)
        person.displayContactInfo(); // Accessible

        // Call default access method (accessible within the same package)
        person.displayInfo(); // Accessible

        // Test setter and getter methods
        person.setAge(31); // Update age
        System.out.println("Updated Age: " + person.getAge()); // Accessible
    }
}
