package com.company;

import java.util.Scanner;

public class String_12 {
    public static void main(String[] args) {
        //String Declaration
//        String name = "kabir";
//        String fullName = "Tony Stark";
//        String sentence ="My name is kabir";
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Can you please enter your name:");
//        String name = sc.nextLine();
//        System.out.println("Your name is : "+name);

        //concatenation
        String firstName = "kabir";
        String lastName = "Singh";
        System.out.println(firstName+" "+lastName);
        String fullName = firstName+lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i = 0;i<fullName.length();i++) {
            System.out.print(fullName.charAt(i));
        }
    }
}
