package com.anon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
    int roll_no, marks;
    String name;

    public Stud(int roll_no, int marks, String name) {
        this.roll_no = roll_no;
        this.marks = marks;
        this.name = name;
    }   

    @Override
    public String toString() {
        return "Stud{" + "roll_no=" + roll_no + ", marks=" + marks + ", name=" + name + '}';
    }
    
    public int compareTo(Stud s){
        return marks>s.marks?1:-1;
    }
} 
        

public class Main {

    
    public static void main(String[] args) {
        
        List<Stud> studs = new ArrayList<>();
        studs.add(new Stud(7, 70, "Andrew Clinton"));
        studs.add(new Stud(9, 65, "Anon Bianco"));
        studs.add(new Stud(14, 99, "Astile Sebas"));
        studs.add(new Stud(20, 63, "Denfero"));
        
        Collections.sort(studs);
        
        for(Stud s : studs){
            System.out.println(s);
        }
    }
    
}
