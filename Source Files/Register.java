package com.company;

import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Nameable> Nameables;

    public Register(List<Nameable> nameables) {
        Nameables = nameables;
    }

    public List<String> getRegister()
    {
        List<String> nameHolder = new ArrayList<>();
        for (Nameable n: Nameables){
            nameHolder.add(n.getName());
        }
        return nameHolder;
    }

    public String printReport(){
        String report= "";
        for(Level lv: Level.values()){
            report += lv.name().toUpperCase()+ "\n";
            for(Nameable nameable:Nameables ){
                if (nameable.getLevel() == lv){
                    report += "\t" +nameable.getName() + "\n";
                }
            }
        }
        return report;
    }
}
