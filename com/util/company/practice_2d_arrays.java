package com.util.company;

import java.util.Scanner;

public class practice_2d_arrays {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] number = new int[a][b];

        //input
        for (int i = 0;i<a;i++){
            for(int k = 0;k<b;k++) {
                number[i][k]= sc.nextInt();
            }

            //output
            for (i = 0; i<a; i++) {
                for (int k = 0; k < b; k++) {
                    System.out.print(number[i][k] +" ");
                }
                System.out.println();
            }
        }
    }
}
