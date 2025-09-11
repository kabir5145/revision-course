package com.company;

//second example
class Student {
    String name;
    int age;

    //Function overloading
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}

public class OOPs {
    public static void main(String[] args) {

        Student s_1 = new Student();
        s_1.name= "kabir";
        s_1.age = 18;

        s_1.printInfo(s_1.name,s_1.age);

    }
}
