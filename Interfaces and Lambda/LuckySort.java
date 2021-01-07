package com.mycompany.java_horstman.chapter3;

    /*
    Exercise8
    Implement the method void luckySort(ArrayList<String> strings, Comparator<String>
    comp) that keeps calling Collections.shuffle on the array list until the elements
    are in increasing order, as determined by the comparator.
    */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LuckySort {
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp) {

        boolean isSorted = false;
        ArrayList<String> sortedStrings = new ArrayList<>(strings);
        Collections.sort(sortedStrings);

        while (!isSorted) {
            Collections.shuffle(strings);
            if (strings.equals(sortedStrings)) {
                isSorted = true;
            }
        }
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
