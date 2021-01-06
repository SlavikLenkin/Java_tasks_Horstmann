package com.mycompany.java_horstman;

  /*
    Exercise13
    Write a program that prints a lottery combination, picking six distinct numbers
    between 1 and 49. To pick six distinct numbers, start with an array list filled with
    1...49. Pick a random index and remove the element. Repeat six times. Print the
    result in sorted order.
     */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ex13 {
    private List<Integer> AllNumbers = new ArrayList<>();
    private Random generator = new Random(System.nanoTime());

    public String getCombination() {
        int[] combination = new int[6];
        for (int i = 0; i < 50; i++) {
            AllNumbers.add(i);
        }

        for (int i = 0; i < 6; i++) {
            combination[i] = AllNumbers.remove(generator.nextInt(AllNumbers.size()));
        }
        Arrays.sort(combination);
        return Arrays.toString(combination);
    }

}
