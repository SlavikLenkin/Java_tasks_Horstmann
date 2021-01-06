package com.mycompany.java_horstman;

   /*
    Exercise2
    Write a program that reads an integer angle (which may be positive or negative)
    and normalizes it to a value between 0 and 359 degrees. Try it first with the %
    operator, then with floorMod.
    */

import java.util.Scanner;

public class ex2 {
    private int angle;

    private void readNumber() {
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        angle = sc.nextInt();
    }

    public void normalized() {
        readNumber();
        System.out.println("result = " + (angle % 360 + 360) % 360 + " (using %)");
        System.out.println("result = " + Math.floorMod(angle, 360) + " (using floorMod)");
    }

}
