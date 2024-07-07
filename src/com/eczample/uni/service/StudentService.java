package com.eczample.uni.service;

import com.eczample.uni.model.DB.DateBase;
import com.eczample.uni.model.impl.Student;

import java.util.List;

public class StudentService {
    public Student createStudent(String name, String lastName, int idGroup){
        int id;
        int size = DateBase.studentsDB.size();
        if (size == 0){
            id = 1;
        }else
            id = size + 1;

        Student student = new Student(id, name, lastName, idGroup);
        DateBase.studentsDB.add(student);
        return student;
    }

    public Student getById(int id) throws Exception {
        Student student = DateBase.studentsDB// Список студентов
                .stream()// запускаем некий поток для вычислний
                .filter(s -> s.getId() == id)// фильтруем по некому условию
                .findFirst() // вернуть первого найденного студента
                .orElse(null); // еслине нашли вернуть null // закрывает stream
        if (student == null){
            throw new Exception("Student not found"); //выбрасывае проверяемое иссключение
        }
        return student;
    }

    public List<Student> getAllStudent(){
        return DateBase.studentsDB;
    }
}
