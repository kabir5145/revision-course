package com.util.company;

import java.util.Scanner;

public class practice_2d_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert the numbers of rows :");
        int a = sc.nextInt();
        System.out.println("Insert the numbers of columns: ");
        int b = sc.nextInt();
        int[][] number = new int[a][b];
        //the number to find
        int num = 11;

        //input
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < b; k++) {
                number[i][k] = sc.nextInt();
            }
        }
        //output
        for (int i = 0; i < a; i++) {
            for (int k = 0; k < b; k++) {
                System.out.print(number[i][k] + "  ");
            }
            System.out.println();
        }
        boolean found=false;
        for(int i = 0;i< a ;i++) {
            for (int k = 0; k < b; k++) {
                if (number[i][k] == num) {
                    found = true;
                    break;
                }
            }
        }
            if (found) {
                System.out.println("Found the given number in the matrix");
            } else {
                System.out.println("sorry ! Not found the number in the given matrix");
            }
        }
    }

