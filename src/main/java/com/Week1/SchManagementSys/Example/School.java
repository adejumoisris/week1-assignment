package com.Week1.SchManagementSys.Example;

// implement teachers and students using an arraylist

import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarn;
    private int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarn = 0;
        totalMoneySpent = 0;

    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalMoneyEarn() {
        return totalMoneyEarn;
    }

    public void updateTotalMoneyEarn(int MoneyEarn) {
        totalMoneyEarn += MoneyEarn;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    // teacher salary

    public void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarn -= MoneySpent;
    }
}
