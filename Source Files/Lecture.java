package com.company;

import java.util.ArrayList;
import java.util.List;



public class Lecture {

    private   List<Student> students = new ArrayList<Student>();

    public Lecture(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void Enter(Student s){
        this.students.add(s);
    }

    public double getHighestAverageGrade(){
        double highestAvgGrade = 0.0;
        for(Student s: students){
     if(s.getAverageGrade() > highestAvgGrade){
         highestAvgGrade = s.getAverageGrade();
     }
        }
        return highestAvgGrade;
    }
}
