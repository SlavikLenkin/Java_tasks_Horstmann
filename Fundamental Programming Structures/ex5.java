package com.mycompany.java_horstman;

    /*
    Exercise5
    What happens when you cast a double to an int that is larger than the largest
    possible int value? Try it out.
    */

public class ex5 {
    public void castDouble() {
        double number = Integer.MAX_VALUE + 1.0;
        System.out.println(number);
        System.out.println("Cast a double to an int " + (int) number);
    }
}
