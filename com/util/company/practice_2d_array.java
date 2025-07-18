package com.util.company;

import java.util.Scanner;

public class practice_2d_array {
    public static void main(String[] args) {
        // question 1
        // to multiply two matrices
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you are entering for first matrix: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of column you are entering for first matrix: ");
        int colm  = sc.nextInt();
        System.out.println("Print the numbers you want to join in the multiplication step : ");
        int[][] multiply = new int[rows][colm];

        //input
        for(int i = 0;i<rows;i++){
            for(int k = 0 ;k<colm;k++){
                multiply[i][k]= sc.nextInt();
            }
        }
        //output
        for(int i = 0;i<rows;i++) {
            for (int k = 0; k < colm; k++) {
                System.out.print(multiply[i][k] +" " );
            }
            System.out.println();
        }


        System.out.println("Enter the number of rows you are entering for second matrix: ");
        int rows2 = sc.nextInt();
        System.out.println("Enter the number of column you are entering for second matrix: ");
        int colm2  = sc.nextInt();
        System.out.println("Print the numbers you want to join in the multiplication step : ");
        int[][] multiply2 = new int[rows2][colm2];

        //input
        for(int i = 0;i<rows;i++){
            for(int k = 0 ;k<colm;k++){
                multiply[i][k]= sc.nextInt();
            }
        }
        //output
        for(int i = 0;i<rows;i++) {
            for (int k = 0; k < colm; k++) {
                System.out.print(multiply[i][k] +" " );
            }
            System.out.println();
        }


    }
}
