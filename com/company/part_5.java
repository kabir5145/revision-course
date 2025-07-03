package com.company;

public class part_5 {
    public static void main(String[] args) {
        //question 1
        //printing the pattern
        /*
        ******
        ******
        ******
        ******
         */
//        int n = 4;
//        int m = 5;
//            //outer loop
//        for(int i = 1;i<=n;i++){
//            //inner loop
//        for(int j = 1;j<=5;j++) {
//            System.out.print("*");
//           }
//            System.out.println("*");
//        }

        //question 2
        //printing the pattern
        /*
        *****
        *   *
        *   *
        *   *
        *****
         */
        /*
        int n = 4;
        int m = 5;
            //outer loop
        for (int i = 1;i <=n;i++){
            //inner loop
            for (int k = 1;k<=m;k++){
                //cell->(i,j)
                if(i==1||k==1||i==n||k==m){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         */
        //question 3
//        int n = 4;
//        for (int i = 1;i<n;i++){
//            for(int k = 1;k<=i;k++) {
//                    System.out.print("*");
//                }
//            System.out.println();
//            }
        //question 4
        /*
        ****
        ***
        **
        *
        int n = 4;
        for (int i = n;i>=1;i--){
            for (int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
          }
         */
        //question 5
        //reverse of question 4
        /*
        int n = 4;
        for(int i = 1 ;i<=n;i++){
            for(int k = 1;k<=n-i;k++){
                System.out.print(" ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
        //question 6
        /*
        int n = 5;
        for (int  i = 1;i<=n;i++){
            for (int k = 1;k<=i;k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
         */
        //question 7
//        int n = 5;
//        for(int i = 1;i<=n;i++){
//            for (int k =1;k<=n-i+1;k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
        //question 8
//        int n = 5;
//        int num = 1;
//        for(int i =1;i<=n;i++){
//            for(int k = 1;k<=i;k++){
//                System.out.print(num+" ");
//                num++;//num++ = num+1
//            }
//            System.out.println();
//        }

        //problem 9
        /*
        1
        01
        101
        0101
        10101
         */
        int n = 5;
        int m = 0;
        for(int i = 1;i<=n;i++){
            for(int k = 1;k<=i;k++) {
                int sum = i+k;
                if(sum % 2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
