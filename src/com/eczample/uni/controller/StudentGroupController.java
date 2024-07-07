package com.eczample.uni.controller;

import com.eczample.uni.model.StudentGroup;
import com.eczample.uni.model.impl.Student;
import com.eczample.uni.model.impl.Teacher;
import com.eczample.uni.service.StudentGroupService;


import java.util.List;

public class StudentGroupController {

    private StudentGroupService service = new StudentGroupService();
    private TeacherController tService = new TeacherController();

    public StudentGroup createStudentGroup (Teacher t, List<Student> s){
        return service.createStudentGroup(t, s);
    }

    public StudentGroup getStudentGroup(int t, List<Integer> S){
        return service.getStudentGroup(tService.getById(t), S);
    }
}
