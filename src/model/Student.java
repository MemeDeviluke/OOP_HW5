package model;

public class Student extends User{
    private int studentID;

    public Student(String firstName, String secondName, String lastName, int studentID) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID + " " +
                super.toString() +
                '}';
    }
}
