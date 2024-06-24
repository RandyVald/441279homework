package controller;

import java.util.List;

import model.StudentGroup;
import model.DB.DataBase;
import model.impl.Student;
import model.impl.Teacher;
import service.StudentGroupService;

public class StudentGroupController {
    
    private StudentGroupService studentGroupService = new StudentGroupService();

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> listStudent){
        return studentGroupService.createStudentGroup(teacher, listStudent);
    }
    
    public Teacher getFirsTeacher(){
        return DataBase.teachersDB.get(0);
    }

    public List<Student> getListStudent(){
        return DataBase.studentsDB;
    }

}
