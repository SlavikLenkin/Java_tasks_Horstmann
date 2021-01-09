package com.mycompany.java_horstman.chapter4;

    /*
    Exercise1
    Define a class Point with a constructor public Point(double x, double y) and
    accessor methods getX, getY. Define a subclass LabeledPoint with a constructor
    public LabeledPoint(String label, double x, double y) and an accessor method
    getLabel.
    Exercise2
    Define toString, equals, and hashCode methods for the classes of the preceding
    exercise.
    */

import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
