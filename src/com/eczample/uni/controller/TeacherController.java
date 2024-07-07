package com.eczample.uni.controller;

import com.eczample.uni.model.impl.Teacher;
import com.eczample.uni.service.TeacherService;

public class TeacherController {

    TeacherService service = new TeacherService();

    public Teacher getById(int id){

        Teacher teacher = null;

        try {
            teacher = service.getById(id);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return teacher;
    }
}
