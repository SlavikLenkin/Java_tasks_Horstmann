package com.mycompany.java_horstman;

    /*
    Exercise7
    Write a program that reads in two integers between 0 and 4294967295, stores
    them in int variables, and computes and displays their unsigned sum, difference,
    product, quotient, and remainder. Do not convert them to long values.
    */

import java.util.Scanner;

public class ex7 {
    private int number1;
    private int number2;

    public void readTwoNumber() {
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        number1 = (int)sc.nextLong();
        number2 = (int)sc.nextLong();

    }

    public int sumAbs() {
        return Math.abs(number1) + Math.abs(number2);

    }

    public int difference() {
        return Math.abs(number1) - Math.abs(number2);
    }

    public int product() {
        return Math.abs(number1) * Math.abs(number2);
    }

    public int quotient() {
        return Math.abs(number1) / Math.abs(number2);
    }

    public int remainder() {
        return Math.abs(number1) % Math.abs(number2);
    }
}
