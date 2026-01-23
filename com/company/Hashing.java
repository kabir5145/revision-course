package com.company;
import java.util.HashSet;
import java.util.Iterator;


public class Hashing {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);

        //Print all elements
        System.out.println(set);

        //Size
        System.out.println("Size of set is : "+set.size());
        //Search - contains
//        if(set.contains(1)){
//            System.out.println("Set contains 1");
//        }
//        if(!set.contains(6)){
//            System.out.println("Does not contains 6");
//        }
//
//        //Delete
//        set.remove(1);
//        if(!set.contains(1)){
//            System.out.println("Does not contains 1");
//        }

        //Iterator
        Iterator it = set.iterator();

        //hasNext
        //next

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}
