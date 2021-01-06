package com.mycompany.java_horstman;


    /*
    Exercise14
    Write a program that reads a two-dimensional array of integers and determines
    whether it is a magic square (that is, whether the sum of all rows, all columns, and
    the diagonals is the same). Accept lines of input that you break up into individual
    integers, and stop when the user enters a blank line. For example, with the input
    16 3 2 13
    5 10 11 8
    9 6 7 12
    4 15 14 1
    (Blank line)
    your program should respond affirmatively.
    */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex14 {
    private List<ArrayList<Integer>> dimensionArray = new ArrayList<>();
    ;

    private void checkCorrectArray() {
        for (ArrayList<Integer> row : dimensionArray) {
            if (row.size() != dimensionArray.size()) {
                System.out.println("Incorrect array");
                dimensionArray = new ArrayList<>();
                readDimensionArray();
            }
        }
    }

    private void readDimensionArray() {
        String str;
        System.out.println("Enter correct dimension array");
        Scanner sc = new Scanner(System.in);
        while (!(str = sc.nextLine()).equals("")) {
            ArrayList<Integer> rowNumbers = new ArrayList<>();
            for (String number : str.split("\\s")) {
                rowNumbers.add(Integer.parseInt(number));
            }
            dimensionArray.add(rowNumbers);
        }
        checkCorrectArray();
    }

    public void checkMagicSquare() {
        readDimensionArray();
        int size = dimensionArray.size();
        int[] rowSum = new int[size];
        int[] columnSum = new int[size];
        int diag1 = 0;
        int diag2 = 0;


        for (int i = 0; i < size; i++) {
            ArrayList<Integer> tmp = dimensionArray.get(i);
            for (int j = 0; j < size; j++) {
                rowSum[i] += tmp.get(j);
                columnSum[j] += tmp.get(j);
                if (i == j) diag1 += tmp.get(j);
                if (i == (size - 1 - j)) diag2 += tmp.get(j);
            }
        }
        boolean magicSquare = true;
        for (int i = 0; i < size; i++) {
            if (rowSum[i] != rowSum[0]) magicSquare = false;
            if (columnSum[i] != columnSum[0]) magicSquare = false;
            if (diag1 != diag2) magicSquare = false;
        }
        if (magicSquare) {
            System.out.println("This array magic square");
        } else {
            System.out.println("This array not magic square");
        }
    }
}
