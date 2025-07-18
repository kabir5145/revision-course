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
//        String firstName = "kabir";
//        String lastName = "Singh";
//        System.out.println(firstName+" "+lastName);
//        String fullName = firstName+lastName;
//        System.out.println(fullName.length());
//
//        //charAt
//        for(int i = 0;i<fullName.length();i++) {
//            System.out.print(fullName.charAt(i));
//        }

        String a1 = "kabir";
        String a2 = "kabir";

        //1 s1>s2: +ve value
        //2 s1 == s2: 0
        //3 s1<s2: -ve value
        /*
        if(a1.compareTo(a2)==0){
            System.out.println("This is correct !");
        }else {
            System.out.println("String are not equal");
        }
         */
//        if(a1==a2){
//            System.out.println("This is correct !");
//        }else {
//            System.out.println("String are not equal");
//        }
//        if(new String("hello")==new String("hello")){
//            System.out.println("This is correct !");
//        }else {
//            System.out.println("String are not equal");
//        }

        //finding between the string
       // String sentence = "my name is tony , and the match";
        String sentence = "tonyStark";
        String name = sentence.substring(0,4);
        System.out.println(name);


    }
}
