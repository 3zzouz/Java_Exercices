package ex2_tp1;

public class Course {
        private int courseId;
        private String courseName;
        private Instructor instructor;

        public Course(String courseName, int courseId, Instructor instructor) {
                this.courseName = courseName;
                this.courseId = courseId;
                this.instructor = instructor;
        }

        public int getCourseId() {
                return this.courseId;
        }

        public String getCourseName() {
                return this.courseName;
        }

        public Instructor getInstructor() {
                return this.instructor;
        }
};
