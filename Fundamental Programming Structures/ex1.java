package com.mycompany.java_horstman;

       /*
        Exercise1
        Write a program that reads an integer and prints it in binary, octal, and
        hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
        */

import java.util.Scanner;

public class ex1 {
    private int number;


    private void readNumber() {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
    }

    public void convert() {
        readNumber();
        System.out.println("Binary = " + Integer.toBinaryString(number));
        System.out.println("Octal = " + Integer.toOctalString(number));
        System.out.println("Hex = " + Integer.toHexString(number));
        System.out.println("Reciprocal as a hexadecimal = " + Double.toHexString((1.0 / number)));
    }
}
