package com.eczample.uni.view;

import com.eczample.uni.controller.StudentController;
import com.eczample.uni.controller.StudentGroupController;
import com.eczample.uni.controller.TeacherController;
import com.eczample.uni.model.DB.DateBase;
import com.eczample.uni.model.StudentGroup;
import com.eczample.uni.model.impl.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentView {
    private StudentController controller = new StudentController();
    private StudentGroupController sGroupController = new StudentGroupController();
    private TeacherController teacherController = new TeacherController();

    public void start(){
        DateBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("1 - Создать студента");
            System.out.println("2 - Найти студента по id");
            System.out.println("3 - Распечатать информацию о всех студентах");
            System.out.println("4 - Создать и распечатать группу по id");
            System.out.println("5 - Выход");

            switch (scanner.nextInt()){
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudent();
                case 4 -> getStudentGroup();
                case 5 -> System.exit(0);
                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию: ");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы: ");
        int groupId = scanner.nextInt();
        Student student = controller.createStudent(name, lastName, groupId);
        System.out.println(student);
        return student;
    }

    private Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id студента: ");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);
        return student;
    }

    private List<Student> getAllStudent(){
        List<Student> student= controller.getAllStudent();
        System.out.println(student);
        return student;
    }

    private StudentGroup getStudentGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподавателя: ");
        int teacherId = scanner.nextInt();
        List<Integer> sc = new ArrayList<>();
        System.out.println("Введите колличесиво студентов: ");
        int count = scanner.nextInt();
        System.out.println("Введите id студента: ");
        for(int i = 0; i != count; i++){
            sc.add(scanner.nextInt());
        }
        return sGroupController.getStudentGroup(teacherId,sc);
    }
}
