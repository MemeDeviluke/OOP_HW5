import controler.Controler;
import model.StudentGroup;

public class Main {
    public static void main(String[] args) {
        Controler controler = new Controler();
        controler.createStudent("1", "1", "1");
        controler.createStudent("2", "2", "2");
        controler.createStudent("3", "3", "3");
        controler.getAllStudent();
        System.out.println();
        controler.createStudent("4", "4", "4");
        controler.getAllStudent();
        System.out.println();
        controler.createTeacher("1", "2", "3");
        StudentGroup studentGroup = controler.createGroup(controler.getTeacher(1), controler.getStudents());
        controler.getStudentsFromGroup(studentGroup);
        System.out.println();
        controler.getTeacher(studentGroup);
        System.out.println();
        controler.createStudent("5", "5", "5");
        controler.getAllStudent();
        System.out.println();
        controler.getStudentsFromGroup(studentGroup);

    }
}