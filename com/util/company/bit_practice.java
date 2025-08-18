package com.util.company;

import java.util.Scanner;

public class bit_practice {
    public static void main(String[] args) {
        //question  1: if a number is odd or even
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number:");
        int a = sc.nextInt();
        if((a&1) == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
         */

        //question 2: Get the ith bit of a number
        int n = 13;//1101
        int i = 2;
        int bitMask = (n>>i)&1;
        System.out.println(bitMask);
    }
}
