package com.anon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Main {

    
    public static void main(String[] args) {
        
        Collection values = new ArrayList();
        
        values.add(2);
        values.add(6);
        values.add(9);
        
        Iterator it = values.iterator();
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
}
