package com.eczample.uni.controller;

import com.eczample.uni.model.DB.DateBase;
import com.eczample.uni.model.impl.Student;
import com.eczample.uni.service.StudentService;

import java.util.List;

public class StudentController {

    private StudentService service = new StudentService();

    public Student createStudent(String name, String lastName, int idGroup){
        int id = DateBase.studentGroupDB.size() + 1;
        return service.createStudent(name, lastName, idGroup);
        }

    public Student getById(int id){
        Student student = null;
        try {
            student = service.getById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        return student;
    }

    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }
}
