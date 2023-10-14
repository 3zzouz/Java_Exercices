package ex2_tp1;

import java.util.ArrayList;

public class Student {

    private int studentId;
    private String firstName;
    private String lastName;
    private ArrayList<Course> courses;

    public Student(String firstName, String lastName, int studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentId = studentId;
        this.courses = new ArrayList<Course>();
    }

    public int getStudentId() {
        return this.studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public ArrayList<Course> getCourses() {
        return this.courses;
    }

    public void enroll(Course course) {
        this.courses.add(course);
    }
};
