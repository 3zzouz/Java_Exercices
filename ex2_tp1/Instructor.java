package ex2_tp1;

public class Instructor {
    private int instructorId;
    private String firstName;
    private String lastName;

    public Instructor(String firstName, String lastName, int instructorId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.instructorId = instructorId;
    }

    public int getInstructorId() {
        return this.instructorId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
