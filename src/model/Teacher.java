package model;

public class Teacher extends User{
    private int teacherID;

    public Teacher(String firstName, String secondName, String lastName, int teacherID) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;
    }

    public int getTeacherID() {
        return teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID + " " +
                super.toString() +
                '}';
    }
}
