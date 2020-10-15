package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LectureTest {


    @Test
    public void getHighestAverageGrade() {

        List<Double> kofiMarks = new ArrayList<>((Arrays.asList(5.0,2.0,5.0)));
        Student kofi = new Student(kofiMarks,"Kofi", Level.Three);

        List<Double> JulietMarks = new ArrayList<>((Arrays.asList(75.0,82.0,95.0)));
        NaughtyStudent Juliet = new NaughtyStudent(JulietMarks, "Juliet", Level.Two);
        // 84 // 92.4

        List<Double> AlfredMarks = new ArrayList<>((Arrays.asList(1.0,2.0,3.0)));
        Student Alfred = new Student(AlfredMarks, "Alfredo", Level.Two);

        List<Double> VinceMarks = new ArrayList<>(Arrays.asList(28.0,48.4,50.1));
        Student Vincent = new Student(VinceMarks, "Vincento", Level.One);
        //Average is 88.83 // Expect 89.71

        List<Double> EdinMarks = new ArrayList<>(Arrays.asList(55.0,27.1,28.3));
        NaughtyStudent Edinam = new NaughtyStudent(EdinMarks, "Edinam", Level.Three);





        List<Student> students = new ArrayList<Student>();
        students.add(kofi);
        students.add(Juliet);
        students.add(Alfred);
        students.add(Vincent);
        students.add(Edinam);

   Lecture Science = new Lecture(students);

      //  assertEquals(92.4, Science.getHighestAverageGrade());
      //  assertEquals(92.4, Science.getHighestAverageGrade());
        assertEquals(92.4, Science.getHighestAverageGrade());


    }

}