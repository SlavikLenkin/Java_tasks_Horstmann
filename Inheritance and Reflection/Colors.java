package com.mycompany.java_horstman.chapter4;

    /*
    Exercise7
    Define an enumeration type for the eight combinations of primary colors
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen,
    and getBlue
    */

public enum Colors {
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;

    public static Colors getRed() {
        return RED;
    }

    public static Colors getGreen() {
        return GREEN;
    }

    public static Colors getBlue() {
        return BLUE;
    }


}
