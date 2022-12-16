package com.Week1.SchManagementSys.Example;

public class Teacher {
    private String name;
    private int id;
    private  int salary;

    /**
     * creating a new Teacher object
     * @param name of the teacher
     * @param id for this teacher
     * @param salary of this teacher
     */

    public Teacher(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }
}
