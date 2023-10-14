import ex2_tp1.Course;
import ex2_tp1.Instructor;
import ex2_tp1.Student;

public class testex2 {
    public static void main(String args[]) {
        Instructor instructor = new Instructor("Jane", "Doe", 987654321);
        System.out.println("Instructor name: " + instructor.getFirstName() + instructor.getLastName());
        System.out.println("Instructor ID: " + instructor.getInstructorId());

        Course course1 = new Course("Java Programming", 1234, instructor);
        System.out.println("Course name: " + course1.getCourseName());
        System.out.println("Course ID: " + course1.getCourseId());
        System.out.println("Instructor of this course : " + course1.getInstructor().getFirstName()
                + course1.getInstructor().getLastName()
                + " has the ID : " + course1.getInstructor().getInstructorId());

        Course course2 = new Course("C++ programming", 4321, instructor);
        System.out.println("Course name: " + course2.getCourseName());
        System.out.println("Course ID: " + course2.getCourseId());
        System.out.println("Instructor of this course : " + course2.getInstructor().getFirstName()
                + course2.getInstructor().getLastName()
                + " has the ID : " + course2.getInstructor().getInstructorId());

        Student student = new Student("John", "Doe", 123456789);
        System.out.println("Student name: " + student.getFirstName() + student.getLastName());
        System.out.println("Student ID: " + student.getStudentId());
        student.enroll(course1);
        for(int i =0;i<student.getCourses().size();i++){
            System.out.println("Student enrolled in course : " + student.getCourses().get(i).getCourseName()
                    + " with ID : " + student.getCourses().get(i).getCourseId());
        }
        System.out.println("New Course Added");
        student.enroll(course2);
        for(int i=0;i<student.getCourses().size();i++){
            System.out.println("Student enrolled in course : " + student.getCourses().get(i).getCourseName()
                    + " with ID : " + student.getCourses().get(i).getCourseId());
        }

    }
}
