package com.mycompany.java_horstman;


   /*
    Exercise10
    Write a program that produces a random string of letters and digits by generating
    a random long value and printing it in base 36.
    */

import java.util.Random;

public class ex10 {
    private long longNumber;

    public void printBase36() {
        Random generator = new Random(System.nanoTime());
        longNumber = generator.nextLong();
        System.out.println(Long.toString(longNumber, 36));
    }
}
