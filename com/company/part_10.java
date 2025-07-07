package com.company;

import java.util.Scanner;

public class part_10 {
    public static void main(String[] args) {
        //int[] marks = new int[3];
//        int marks[] = new int[3];
//        marks[0] = 89;//physics
//        marks[1] = 87;//chemistry
//        marks[2] = 98;//eng
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        for(int i = 0;i<3;i++){
//            System.out.println(marks[i]);
//        }
        Scanner sc = new Scanner(System.in );
        int size= sc.nextInt();
        int number[]= new int[size];

        //input
        for(int i = 0;i<size;i++){
            number[i]= sc.nextInt();
        }
        int x = sc.nextInt();
        //output
        for(int i = 0; i< number.length;i++){
            if(number[i]==x){
                System.out.println("x found at index : "+i);
            }
        }

    }
}
