package ArrayListDemo;

public class SystemManagementTest {
    public static void main(String[] args) {
        SystemManagement systemManagement = new SystemManagement();

        // Add items
        systemManagement.addStudent("Alice");
        systemManagement.addStudent("Bob");
        systemManagement.addCourse("Math");
        systemManagement.addCourse("Science");
        systemManagement.addScore(90.5);
        systemManagement.addScore(85.0);

        // Remove an item
        systemManagement.removeStudent("Bob");

        // Display elements using both loops
        systemManagement.displayStudentsForEach();
        systemManagement.displayCoursesForLoop();
        systemManagement.displayScoresForEach();

        // Get the size of the lists
        System.out.println("Number of students: " + systemManagement.getStudentSize());
        System.out.println("Number of courses: " + systemManagement.getCourseSize());
        System.out.println("Number of scores: " + systemManagement.getScoreSize());

        // Get an element by index
        System.out.println("First student: " + systemManagement.getStudent(0));
        System.out.println("First course: " + systemManagement.getCourse(0));
        System.out.println("First score: " + systemManagement.getScore(0));
    }
}
