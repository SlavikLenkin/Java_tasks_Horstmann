package com.mycompany.java_horstman;

  /*
    Exercise9
    Section 1.5.3, “String Comparison” (page 25) has an example of two strings s and
    t so that s.equals(t) but s != t. Come up with a different example that
    doesn't use substring).
    */

public class ex9 {

    private String s1 = "Wow what is this";
    private  String s2 = new String("Wow what is this");

    public void print (){
        System.out.println("String1 - " + s1);
        System.out.println("String2 - " + s2);
        System.out.println("String1!= String2 " + (s1!=s2));
        System.out.println("String1.equals(String2) " + (s1.equals(s2)));
    }
}
