package com.anon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);
        
        Comparator<Integer> c = (i, j) -> i%10>j%10?1:-1;
        
        Collections.sort(values, c);
        
        for(Integer o : values){
            System.out.println(o);
        }
    }
    
}
