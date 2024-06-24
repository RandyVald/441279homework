package model;

import model.impl.Teacher;

import java.util.List;

import model.impl.Student;

public class StudentGroup {
   
    protected Teacher teacher;
    protected List<Student> studentList;

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return String.format("Учитель: %s. Студенты: %s", teacher, studentList);
    }

}
