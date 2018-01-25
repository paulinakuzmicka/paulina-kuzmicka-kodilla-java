package com.kodilla.patterns2.observer.homework;

import org.apache.commons.collections4.map.LinkedMap;

import java.util.ArrayList;
import java.util.List;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Student student) {
        LinkedMap homework = student.getHomeworks();
        StringBuilder sb = new StringBuilder();
        sb.append("Student ");
        sb.append(student.getSurname());
        sb.append(" from ");
        sb.append(student.getCourseName());
        sb.append(" course send new homework:\n");
        sb.append(homework.get(homework.indexOf(homework.lastKey())));
        System.out.println(sb);
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
