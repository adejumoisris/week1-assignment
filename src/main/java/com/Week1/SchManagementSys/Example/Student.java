package com.Week1.SchManagementSys.Example;
/* created by adejumo idris @ decagon week one demo

this class is responsible for: student atrribute
*
* */

// Abstract class and abstract methods to be implemented.
public class Student {
    private String name;
    private int id;
    private int grade;
    private int feespay;
    private int feesTotal;

//    public Student(String name, int id, int grade, int feespay, int feesTotal) {
//        this.name = name;
//        this.id = id;
//        this.grade = grade;
//        this.feespay = feespay;
//        this.feesTotal = feesTotal;
//    }

    // the role of a constructor is to create a new student by initiatilizing the value
    //@param name the name of the student
    //@param id the id of the student
    //@param grade the grade of the student
    //@param feespay the fees pay of the student
    //@param feesTotal the fees total of the student

    /**
     *
     * @param name
     * @param id
     * @param grade
     * @par
     */

    public Student(String name, int id, int grade ){
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.feespay= 0;
        this.feesTotal= 30000;

    }

    // use to upgrade the student grade

    // not going to alter student name, id,

    public void setGrade( int grade ){
        this.grade = grade;
    }

    public void payfees(int fees){
        int feesPaid = fees;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        int feesPaid = 0;
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    //pays the selected amount to school

    public int getRemainingFees( ){
        int feesPaid = 0;
        return feesTotal-feesPaid;
    };
};
