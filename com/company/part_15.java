package com.company;

import java.util.Scanner;

public class part_15 {
    public static void main(String[] args) {
        /*
        Get Bit
        question = Get the third bit(position = 2) of a number n(n = 0101).
        Bit Mask: 1<<i
        Operation = AND
        */
        int n = 5;//0101
        int position = 2;
        int bitMask1 = 1<<position;

        if ((bitMask1 & n) ==0) {
            System.out.println("bit was 0!");
        }else {
            System.out.println("bit was 1!");
        }

        /*
        Set Bit
        Set the second bit(position = 1) of a number n(n = 0101).
        Bit Mask : 1<<i
        Operation = OR
        */
        int v = 5;
        int pos = 1;
        int bitMask2 = 1<<pos;
        int newNumber = bitMask2 | v;
        System.out.println("The original number is : "+v );
        System.out.println("The new number is : "+newNumber);

        /*
        Clear Bit
        Clear the third bit(position = 2) of a number n(n = 0101).
        Bit Mask : 1<<i
        Operation : AND with NOT
         */
        int c = 5;
        int clear = 2;
        int bitmask3 = 1<<clear;
        int notBitmask =~(bitmask3);

        int newNum = notBitmask & c;
        System.out.println(newNum);

        /*
        Update Bit
        Update the second bit(position = 1) of a number n to 1.(n = 0101)

        for 1
        Bit Mask : 1<<i
        Operation : AND with NOT

        for 2
        Bit Mask : 1<<i
        Operation : OR
         */
        Scanner sc = new Scanner(System.in);
        int oper  = sc.nextInt();
        //oper = 1: set oper = o : clear
        int g = 5; //0101 -> 0111 ->dec 7
        int posi = 1;
        int bitMask = 1<<posi;
        if(oper == 1){
            //set
             int newNumber2 = bitMask |g;
            System.out.println(newNumber2);
        }else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber2  = newBitMask &g;
            System.out.println(newNumber2);
        }

    }
}