package com.company;

//first example
class Pen{
    String color;
    String type;//ball point ; gel pen

    public void write(){
        System.out.println("Writing something.");
    }

    public void printColor(){
        System.out.println(this.color);
        //System.out.println(this.type);
    }
}


//second example
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //1-> Non-parameterized constructors
    /*
    Student(){
        System.out.println("Constructor called.");
    }
    */

    //2-> Parameterized constructors
    /*
    Student(String name,int age){
        this.name =name;
        this.age = age;
    }
    */

    //3-> Copy constructors
    Student(Student s_2) {
        this.name = s_2.name;
        this.age = s_2.age;
    }

    Student() {
        System.out.println("Hello");
    }
}
public class OOPs {
    public static void main(String[] args) {
        /*
        Pen p_1 = new Pen();
        p_1.color = "blue";
        p_1.type = "gel";

        Pen p_2 = new Pen();
        p_2.color="Black";
        p_2.type="ballpoint";

        p_1.printColor();
        p_2.printColor();
        */

        //for parameterized constructor
        //Student s_1 = new Student("kabir",18);

        Student s_1 = new Student();
//        s_1.name= "kabir";
//        s_1.age = 18;

        s_1.name = "Ram";
        s_1.age = 12;

        Student s_2 = new Student(s_1);
        s_2.printInfo();

    }
}
