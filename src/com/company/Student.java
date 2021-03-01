package com.company;

public class Student {
    String grade;
    int otlichnik;
    int horoshist;
    int troechnic;

    public Student(String grade, int otlichnik, int horoshist, int troechnic) {
        this.grade = grade;
        this.otlichnik = otlichnik;
        this.horoshist = horoshist;
        this.troechnic = troechnic;
    }

    @Override
    public String toString() {
        return "Student{" +
                "grade=" + grade +
                ", otlichnik=" + otlichnik +
                ", horoshist=" + horoshist +
                ", troechnic=" + troechnic +
                '}';
    }
}
