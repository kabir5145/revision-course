package com.util.company;

import java.util.Scanner;

public class bit_practice {
    public static void main(String[] args) {
        //question  1: if a number is odd or even
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the number:");
        int a = sc.nextInt();
        if((a&1) == 0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
