package com.util.company;


import java.util.Scanner;

public class practice_questions {
    public static void main(String[] args) {
        //question 1
        Scanner sc  = new Scanner(System.in);
//        System.out.println("Enter the first number:");
//        double a = sc.nextDouble();
//        System.out.println("Enter the symbol from which you would like to calculate like(+,-,/,*,%)");
//        char calculate=sc.next().charAt(0);
//        System.out.println("Enter the second number :");
//        double b = sc.nextDouble();
//        double result = 0;
//        switch (calculate) {
//            case '+':
//                result = a + b;
//                break;
//            case'-':
//                result = a-b;
//                break;
//            case '*':
//                result = a*b;
//                break;
//            case '%':
//                result=a%b;
//                break;
//            case'/':
//                if(b!=0){
//                    result = a/b;
//                }else {
//                    System.out.println("There is an exception");
//                }
//                break;
//            default:
//                System.out.println("INVALID");
//        }
//        System.out.println("Result is:"+result);
//        sc.close();

        //question 2
//        int month = sc.nextInt();
//        switch (month){
//            case 1:
//                System.out.println("January");
//                break;
//            case 2:
//                System.out.println("February");
//                break;
//            case 3:
//                System.out.println("March");
//                break;
//            case 4:
//                System.out.println("April");
//                break;
//            case 5:
//                System.out.println("May");
//                break;
//        }
        for(int i = 1;i<=4;i++){
            for (int k = 1;k<=5;k++){
                System.out.print("*");
            }
            System.out.println("k");
        }
    }
}
