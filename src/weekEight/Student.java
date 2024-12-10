package weekEight;

public class Student extends Person {
    // Instance variables
    private String studentID;
    private String major;
    private double gpa;

    // Constructor that initializes instance variables
    public Student(String studentID, String major, double gpa, String firstName, String lastName) {
        super(firstName, lastName, 0, null, null); // Call to Person constructor
        this.studentID = studentID;
        this.major = major;
        this.gpa = gpa;
    }

    // Getter and Setter methods
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
