package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NaughtyStudentTest {

    @Test
    void getAverageGrade() {
        List<Double> grades = new ArrayList<Double>(Arrays.asList(75.0,82.0,95.0));
        NaughtyStudent student = new NaughtyStudent(grades, "Esi", Level.Three);

        double avg = student.getAverageGrade();
        assertEquals(92.4, avg);
    }
}