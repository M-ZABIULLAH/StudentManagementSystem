
// Registration class to store student unit selection information

import javax.swing.plaf.TableHeaderUI;

public class Enrollment {
    private Student student;
    private Course course;
    private double grade;
    private String semester;


public Enrollment(Student student, Course course, String semester){
    this.student = student;
    this.course = course;
    this.semester =semester;
    this.grade = -1;
}

// Getters and Setters


    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 20) {
            this.grade = grade;
        } else {
            System.out.println("the score must be between 0 and 20");
        }
    }

}
