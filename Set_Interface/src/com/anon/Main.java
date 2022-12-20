package com.anon;

//In set interface, duplicate elements not allowed

//It will not give you the output in the sequence as you entered. eg. we entered as 5, 3, 6, 9. But the output will be in different order

import java.util.HashSet;
import java.util.Set;


public class Main {

    
    public static void main(String[] args) {
        
        Set<Integer> values = new HashSet<>();
        
        System.out.println(values.add(5));
        System.out.println(values.add(3)); //no duplicate elements
        System.out.println(values.add(6));
        System.out.println(values.add(3)); //no duplicate elements
        
        for(int i : values){
            System.out.println(i);
        }
               
    }
    
}
