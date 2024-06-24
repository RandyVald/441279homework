package service;

import java.util.List;

import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

public class StudentGroupService {

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> listStudent) {
        return new StudentGroup(teacher, listStudent);
    }

}
