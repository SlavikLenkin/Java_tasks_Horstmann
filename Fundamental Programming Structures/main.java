package com.mycompany.java_horstman;

public class main {

    private static void printNumberOfEx(int number) {
        System.out.println("-----------------");
        System.out.println("Exercise" + number);
        System.out.println();

    }

    public static void main(String[] args) {

        // Exercise1
        printNumberOfEx(1);
        ex1 testEx1 = new ex1();
        testEx1.convert();


        // Exercise2

        printNumberOfEx(2);
        ex2 testEx2 = new ex2();
        testEx2.normalized();

        // Exercise3

        printNumberOfEx(3);
        ex3 testEx3 = new ex3();
        testEx3.printMax();

        // Exercise4

        printNumberOfEx(4);
        ex4 testEx4 = new ex4();
        testEx4.print();

        // Exercise5

        printNumberOfEx(5);
        ex5 testEx5 = new ex5();
        testEx5.castDouble();

        // Exercise6

        printNumberOfEx(6);
        ex6 testEx6 = new ex6();
        System.out.println(testEx6.factorial(12));

        // Exercise7

        printNumberOfEx(7);
        ex7 testEx7 = new ex7();
        testEx7.readTwoNumber();
        System.out.println(testEx7.sumAbs());
        System.out.println(testEx7.difference());
        System.out.println(testEx7.product());
        System.out.println(testEx7.quotient());
        System.out.println(testEx7.remainder());

        // Exercise8

        printNumberOfEx(8);
        ex8 testEx8 = new ex8();
        testEx8.printSubsrting();

        // Exercise9

        printNumberOfEx(9);
        ex9 testEx9 = new ex9();
        testEx9.print();

        // Exercise10

        printNumberOfEx(10);
        ex10 testEx10 = new ex10();
        testEx10.printBase36();

        // Exercise13

        printNumberOfEx(13);
        ex13 testEx13 = new ex13();
        System.out.println(testEx13.getCombination());

        // Exercise14

        printNumberOfEx(14);
        ex14 testEx14 = new ex14();
        testEx14.checkMagicSquare();

    }
}
