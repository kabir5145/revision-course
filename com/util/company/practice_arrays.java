package com.util.company;

import java.util.Arrays;

public class practice_arrays {
    public static void main(String[] args) {
        int[] marks = new int[4];
        marks[0]= 11;
        marks[1]= 1212;
        marks[2]= 13;
        marks[3]= 14;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println(Arrays.stream(marks).max());
        System.out.println(Arrays.stream(marks).min());
        
    }
}
