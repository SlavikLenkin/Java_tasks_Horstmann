package com.mycompany.java_horstman;

    /*
    Exercise8
    Write a program that reads a string and prints all of its nonempty substrings.
    */

import java.util.Scanner;

public class ex8 {
    private String s;

    private void readString() {
        System.out.println("Enter string");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
    }

    public void printSubsrting(){
        readString();
        for(int i = 0;i<s.length();i++){
            for(int j = s.length();j>i;j--){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
