package javaapplication37;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication37 {
    
    //STATE EXISTS HERE
    int x;
    short blah;
    String myName;

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        //Define and assign variables
        //Use expressions, and maths
        //Conditional Statements
        //Looping
        //Methods
        //Array usage

        JavaApplication37 javaApplication37 = new JavaApplication37();
        javaApplication37.x = 3;
        javaApplication37.bar();
//        bar();
        foo();
        
        String banana = new String("Hello");
        String banana2 = "Hello";
        int accountBalanceForMyBrotherInLaw = 4;
        String string = new String();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
    }
    
    public static void foo() {
        System.out.println("Foo!");
    }
    
    public void bar() {
        System.out.println("Bar!");
    }
}
