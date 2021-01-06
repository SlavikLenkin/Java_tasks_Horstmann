package com.mycompany.java_horstman;

    /*
    Exercise6
    Write a program that computes the factorial n! = 1 × 2 × ... × n, using
    BigInteger. Compute the factorial of 1000.
    */

import java.math.BigInteger;

public class ex6 {
    public BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
