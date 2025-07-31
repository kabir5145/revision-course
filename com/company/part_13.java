package com.company;

public class part_13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("kabir");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0,'b');
         System.out.println(sb);

        //insert a word in a string
        sb.insert(2,'c');
        System.out.println(sb);

        //deleting a string
        sb.delete(0,4);
        System.out.println(sb);

        //for joining a word
        StringBuilder j = new StringBuilder("k");
        j.append("a");
        j.append("b");
        j.append("i");
        j.append("r");
        System.out.println(j);

        //for reversing a string
        StringBuilder r = new StringBuilder("kabir");
        r.reverse();
        System.out.println(r);

        //to see the length of a string
        System.out.println(r.length());
    }
}
