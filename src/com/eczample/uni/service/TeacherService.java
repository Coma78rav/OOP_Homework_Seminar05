package com.eczample.uni.service;

import com.eczample.uni.model.DB.DateBase;
import com.eczample.uni.model.StudentGroup;
import com.eczample.uni.model.impl.Teacher;

public class TeacherService {

    private static StudentGroupService studentGroupService = new StudentGroupService();

    public Teacher createTeacher(String name, String lastName){
        Teacher t = new Teacher(name, lastName);
        DateBase.teachersDB.add(t);
        return t;
    }

    public void addGroupId(StudentGroup s){
        int id = studentGroupService.getId();
        Teacher.groups.add(id);
    }

    public Teacher getById(int id) throws Exception {
        Teacher teacher = DateBase.teachersDB
                .stream()
                .filter(s-> s.getId() == id)
                .findFirst()
                .orElse(null);
        if(teacher == null){
            throw new Exception("Teacher not found");
        }
        return teacher;
    }


}
