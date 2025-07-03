package com.company;

import java.util.Scanner;

public class part_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Insert the first number :");
//        int a = sc.nextInt();
//        System.out.println("Insert the second number :");
//        int b = sc.nextInt();
//        if(age>=18){
//            System.out.println("Adult");
//        }else {
//            System.out.println("Not Adult");
//        }
//        if(x%2 ==0){
//            System.out.println("Even");
//        }else {
//            System.out.println("Odd");
//        }
//        if(a==b){
//            System.out.println("Equal");
//        } else if (a>b) {
//            System.out.println("a is greater");
//        }else {
//            System.out.println("a is lesser");
//        }
        int button = sc.nextInt();
//        if(button ==1){
//            System.out.println("Hello");
//        } else if (button ==2) {
//            System.out.println("Namaste");
//        }else if (button ==3){
//            System.out.println("Bonjour");
//        }else {
//            System.out.println("It is invalid");
//        }
        switch (button){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("It is invalid");
        }

    }
}
