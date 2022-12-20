package com.anon;

import java.util.ArrayList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        List<Integer> values = new ArrayList<>();
        
        values.add(2);
        values.add(3);
        values.add(5);
        values.add(7);  
        
        for(Integer o : values){
            System.out.println(o);
        }
    }
    
}
