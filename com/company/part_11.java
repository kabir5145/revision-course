package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class part_11 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Insert the numbers of rows :");
       int rows = sc.nextInt();
        System.out.println("Insert the numbers of columns: ");
       int colm = sc.nextInt();
       int [][] numbers = new int[rows][colm];

       //input
        // rows
       for(int i = 0;i<rows;i++){
           //columns
          for(int j = 0;j<colm;j++){
             numbers[i][j]= sc.nextInt();
          }
       }
       //output
        for(int i = 0;i<rows;i++){
            for(int j = 0;i<colm;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}