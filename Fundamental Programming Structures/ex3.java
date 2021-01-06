package com.mycompany.java_horstman;

    /*
    Exercise3
    Using only the conditional operator, write a program that reads three integers and
    prints the largest. Repeat with Math.max.
    */

import java.util.Scanner;

public class ex3 {
    private int number1;
    private int number2;
    private int number3;

    private void readThreeNumber() {
        System.out.println("Enter three number");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number3 = sc.nextInt();
    }

    public void printMax() {
        int max;

        readThreeNumber();

        max = number1;

        if (max < number2) {
            max = number2;
        }
        if (max < number3) {
            max = number3;
        }
        System.out.println("max number = " + max + " (Using only the conditional operator)");
        System.out.println("max number = " + Math.max(Math.max(number1, number2), number3)
                + " (Using Math. max)");
    }


}
