package com.company;

import java.util.Scanner;

public class part_7 {
//    public static void printMyName(String name){
//        System.out.println(name);
//        return;
//    }
    //question 1
//    public static int addNumber(int a ,int b ){
//        int sum = a+b;
//        return sum;
//    }

    //question 2
//    public static int multiplyNum(int a ,int b ){
//        int product = a*b;
//        return product;
//    }

    //question 3
    public static void printFactorial(int n ){
        if (n<0){
            System.out.println("invalid number");
            return;
        }
        int factorial = 1;
        for(int i = n;i>=1;i--){
            factorial = factorial*i;
        }
        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String name = sc.next();
        //printMyName(name);//call kiya function ko

//        int a = sc.nextInt();
//        int b = sc.nextInt();
        //int sum = addNumber(a,b);
        //System.out.println("sum of two numbers is :"+sum);

//        int product = multiplyNum(a,b);
//        System.out.println("product of two number is : "+product);

        int n = sc.nextInt();
        printFactorial(n);
    }
}
