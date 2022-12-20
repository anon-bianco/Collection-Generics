package com.anon;

import java.util.ArrayList;
import java.util.List;


public class Main {

    
    public static void main(String[] args) {
        
        List values = new ArrayList();
        
        values.add(2);
        values.add(6);
        values.add(9);
        values.add(2, 7);
        values.add("8");
        
        for(int i=0; i<values.size(); i++){
            System.out.println(values.get(i));
        }
        
        System.out.println("***************************************");
        
        for(Object o : values){
            System.out.println(o);
        }
    }
    
}
