package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getAverageGrade() {
        List<Double> grades = new ArrayList<Double>(Arrays.asList(5.0,2.0,5.0));
        Student student = new Student(grades, "Johnny", Level.One);

            double avg = student.getAverageGrade();
            assertEquals(4.0, avg);


        }
    }
