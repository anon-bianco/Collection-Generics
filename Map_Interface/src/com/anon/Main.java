package com.anon;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Main {

    
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();
        
        map.put("myName", "Anon Bianco");
        map.put("mothersName", "Daisy Mettilda");
        map.put("fathersName", "Hilbert Varghese");
        map.put("sistersName", "Anne Biancy");
        
        Set<String> keys = map.keySet();
        
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }
    }
    
}
