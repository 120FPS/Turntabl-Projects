package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RegisterTest {
    List<Double> AlfredMarks = new ArrayList<>((Arrays.asList(1.0,2.0,3.0)));
    Student Alfred = new Student(AlfredMarks, "Alfredo", Level.Three);

    List<Double> VinceMarks = new ArrayList<>(Arrays.asList(28.0,48.4,50.1));
    Student Vincent = new Student(VinceMarks, "Vincento", Level.Two);

    List<Nameable> scienceStudents = new ArrayList<>(Arrays.asList(Alfred, Vincent));

    Register reg = new Register(scienceStudents);
    @Test
    void getRegister() {
        List<String> expected = new ArrayList<>(Arrays.asList("Alfredo", "Vincento"));
        assertLinesMatch( expected, reg.getRegister());
    }

    @Test
    void printReport() {
        String expected = "ONE\n" +
                "TWO\n" +
                "\tVincento\n" +
                "THREE\n" +
                "\tAlfredo\n";
        assertEquals(expected, reg.printReport());
    }
}