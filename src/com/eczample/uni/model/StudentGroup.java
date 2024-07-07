package com.eczample.uni.model;

import com.eczample.uni.model.DB.DateBase;
import com.eczample.uni.model.impl.Student;
import com.eczample.uni.model.impl.Teacher;

import java.util.List;

public class StudentGroup {

    public static int id;
    public String name;
    public Teacher teacher;
    public static List<Student> students;

    public StudentGroup(Teacher t, List<Student> s){
        StudentGroup.students = s;
        this.teacher = t;
        StudentGroup.id = DateBase.studentGroupDB.size() + 1;
    }

    public StudentGroup (Teacher t){
        this.teacher = t;
        StudentGroup.id = DateBase.studentsDB.size() + 1;
    }
}
