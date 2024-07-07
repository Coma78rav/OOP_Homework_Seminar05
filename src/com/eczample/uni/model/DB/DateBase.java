package com.eczample.uni.model.DB;

import com.eczample.uni.model.StudentGroup;
import com.eczample.uni.model.impl.Student;
import com.eczample.uni.model.impl.Teacher;
import com.eczample.uni.service.TeacherService;

import java.util.ArrayList;
import java.util.List;
//симулирует реальную базу данных
public class DateBase {

    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static final List<StudentGroup> studentGroupDB = new ArrayList<>();

    public static void fillDB(){

        Teacher teacher = new Teacher("Василий", "Иванов");

        StudentGroup studentGroup = new StudentGroup(teacher);

        TeacherService tService = new TeacherService();
        tService.addGroupId(studentGroup);

        teachersDB.add(teacher);

        Student s1 = new Student(1, "Рикон", "Старк", 1);
        Student s2 = new Student(2, "Дефри", "Ланистер", 1);

        studentsDB.add(s1);
        studentsDB.add(s2);

    }
}
