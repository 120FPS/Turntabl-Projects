package com.company;

import java.util.List;

public class NaughtyStudent extends Student {


    public NaughtyStudent(List<Double> grades, String name, Level level) {
        super(grades, name, level);
    }

    @Override
      public double getAverageGrade(){

       return super.getAverageGrade() + (super.getAverageGrade() * 0.1);


    }

}
