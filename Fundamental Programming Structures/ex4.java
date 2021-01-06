package com.mycompany.java_horstman;
    /*
    Exercise4
    Write a program that prints the smallest and largest positive double values.
    Hint: Look up Math.nextUp in the Java API.
    */

public class ex4 {
    public void print (){
        System.out.println("Smallest  positive double values = " + Math.nextUp(0.0));
        System.out.println("Largest positive double values = " + Math.nextUp(Double.MAX_VALUE));
    }
}
