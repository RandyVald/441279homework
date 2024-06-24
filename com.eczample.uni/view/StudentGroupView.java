package view;

import controller.StudentGroupController;
import model.StudentGroup;
import model.DB.DataBase;

public class StudentGroupView {
    
    private StudentGroupController groupController = new StudentGroupController();

    public void startHomeWork(){

        DataBase.fillDB();

        System.out.println("Создаем группу из первого учителя и всех учеников в базе:");

        StudentGroup group = groupController.createStudentGroup(groupController.getFirsTeacher(), groupController.getListStudent());

        System.out.println(group);

    }
    
}
