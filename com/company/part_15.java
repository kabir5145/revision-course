package com.company;

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
    }
}