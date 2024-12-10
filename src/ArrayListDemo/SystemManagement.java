package ArrayListDemo;

import java.util.ArrayList;

public class SystemManagement {
    // Three ArrayLists for different types of items
    private ArrayList<String> students = new ArrayList<>();
    private ArrayList<String> courses = new ArrayList<>();
    private ArrayList<Double> scores = new ArrayList<>();

    // Add items to each list
    public void addStudent(String student) {
        students.add(student);
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void addScore(Double score) {
        scores.add(score);
    }

    // Remove items from each list
    public void removeStudent(String student) {
        students.remove(student);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void removeScore(Double score) {
        scores.remove(score);
    }

    // Get the size of each list
    public int getStudentSize() {
        return students.size();
    }

    public int getCourseSize() {
        return courses.size();
    }

    public int getScoreSize() {
        return scores.size();
    }

    // Get elements by index
    public String getStudent(int index) {
        return students.get(index);
    }

    public String getCourse(int index) {
        return courses.get(index);
    }

    public Double getScore(int index) {
        return scores.get(index);
    }

    // Display elements using for-each loop
    public void displayStudentsForEach() {
        System.out.println("Students:");
        for (String student : students) {
            System.out.println(student);
        }
    }

    public void displayCoursesForEach() {
        System.out.println("Courses:");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    public void displayScoresForEach() {
        System.out.println("Scores:");
        for (Double score : scores) {
            System.out.println(score);
        }
    }

    // Display elements using regular for loop
    public void displayStudentsForLoop() {
        System.out.println("Students:");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }

    public void displayCoursesForLoop() {
        System.out.println("Courses:");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i));
        }
    }

    public void displayScoresForLoop() {
        System.out.println("Scores:");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        }
    }
}
