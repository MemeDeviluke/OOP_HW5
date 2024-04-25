package controler;

import model.*;
import service.DataService;
import service.StudentGroupService;
import view.StudentView;

import java.util.List;

public class Controler {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudentGroupService studentGroupService = new StudentGroupService();
    public void createStudent(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        service.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public Teacher getTeacher(int id){
        return service.getTeacher(id);
    }
    public List<Student> getStudents(){
        return service.getAllStudent();
    }
    public void getAllStudent(){
        List<Student> userList = service.getAllStudent();
        for (Student user: userList){
            studentView.printOnConsole(user);
        }
    }

    public StudentGroup createGroup(Teacher teacher, List<Student> students){
        return studentGroupService.create(teacher, students);
    }

    public void getStudentsFromGroup(StudentGroup studentGroup){
        List<Student> students = studentGroup.getStudents();
        for (Student student: students){
            studentView.printOnConsole(student);
        }
    }
    public void getTeacher(StudentGroup studentGroup){
        System.out.println(studentGroup.getTeacher());
    }

}
