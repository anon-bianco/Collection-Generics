package com.anon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        List<Integer> values = new ArrayList<>();
        
        values.add(7);
        values.add(2);
        values.add(9);
        values.add(5);
        
        Collections.sort(values);  //change order to 2, 5, 7, 9 

        Collections.reverse(values); //reverse 9, 7, 5, 2
        
        Collections.shuffle(values); //shuffle
        
        for(Integer o : values){
            System.out.println(o);
        }
    }
    
}
