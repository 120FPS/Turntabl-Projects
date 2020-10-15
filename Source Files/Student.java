package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel {

    private List<Double> grades = new ArrayList<Double>();
    private String name;
    private Level level;


    public Student(List<Double> grades, String name, Level level) {
        this.grades = grades;
        this.name = name;
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }

    public double getAverageGrade(){
        double total =0.0;
    for(Double studentGrades:  grades){
        total = total + studentGrades;
    }
    double avgGrade = total / grades.size();
    return avgGrade;
    }


    @Override
    public Level getLevel() {
        return this.level;
    }
}
