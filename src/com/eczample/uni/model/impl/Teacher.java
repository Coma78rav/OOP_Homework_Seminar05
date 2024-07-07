package com.eczample.uni.model.impl;

import com.eczample.uni.model.DB.DateBase;
import com.eczample.uni.model.User;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {

    public final static List<Integer> groups = new ArrayList<>();

    public Teacher(String name, String lastName) {
        super (name, lastName);
        this.id = DateBase.teachersDB.size() + 1;
    }

//    public void addGroupId(int id){ //убрать в сервис, ошибка проектирования
//        groups.add(id);
//    }

}
