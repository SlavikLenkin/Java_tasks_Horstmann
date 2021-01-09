package com.mycompany.java_horstman.chapter4;

    /*
    Exercise5
    Define an enumeration type for the eight combinations of primary colors
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE with methods getRed, getGreen,
    and getBlue
    */

public enum Colors {
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;

    public Colors getRed() {
        return RED;
    }

    public Colors getGreen() {
        return GREEN;
    }

    public Colors getBlue() {
        return BLUE;
    }


}
