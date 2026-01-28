package com.util.company;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_Practice {
    public static void main(String[] args) {
//        Associate Key with Value in HashMap
        HashMap<String, Integer> map = new HashMap<>();
       map.put("a",1);
       map.put("b",2);
       map.put("c",3);
       map.put("d",4);

        for(Map.Entry<String, Integer> x : map.entrySet()){
            System.out.println(x.getKey()+":"+x.getValue());
        }

//        Count Key-Value Mappings in Map
        System.out.println("The size is : "+map.size());
    }
}
