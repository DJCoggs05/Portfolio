package weekEight;

public class StudentTest {
    public static void main(String[] args) {
        // Instantiate a Student object
        Student student = new Student("S12345", "Computer Science", 3.8, "Alice", "Smith");

        // Test getter methods
        System.out.println("Student ID: " + student.getStudentID()); // Accessible
        System.out.println("Major: " + student.getMajor());         // Accessible
        System.out.println("GPA: " + student.getGpa());             // Accessible
        System.out.println("First Name: " + student.firstName);     // Accessible
        System.out.println("Last Name: " + student.lastName);       // Accessible

        // Test setter methods
        student.setGpa(3.9); // Update GPA
        System.out.println("Updated GPA: " + student.getGpa()); // Accessible

        // Update major
        student.setMajor("Data Science");
        System.out.println("Updated Major: " + student.getMajor()); // Accessible
    }
}
