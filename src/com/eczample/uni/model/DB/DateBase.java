package com.eczample.uni.model.DB;

import com.eczample.uni.model.impl.Student;
import com.eczample.uni.model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;
//симулирует реальную базу данных
public class DateBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static void fillDB(){
        Teacher teacher = new Teacher(1, "Василий", "Иванов");
        teacher.addGroupId(1);

        teachersDB.add(teacher);

        Student s1 = new Student(1, "Рикон", "Старк", 1);
        Student s2 = new Student(2, "Дефри", "Ланистер", 1);

        studentsDB.add(s1);
        studentsDB.add(s2);

    }
}
