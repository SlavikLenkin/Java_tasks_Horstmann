package com.mycompany.java_horstman.chapter2;

    /*
    Exercise5
    Implement an immutable class Point that describes a point in the plane.
    Provide a constructor to set it to a specific point, a no-arg constructor to
    set it to the origin, and methods getX, getY, translate, and scale. The translate
    method moves the point by a given amount in x- and y-direction. The
    scale method scales both coordinates by a given factor. Implement these
    methods so that they return new points with the results. For example,
    Point p = new Point(3, 4).translate(1, 3).scale(0.5);
    should set p to a point with coordinates (2, 3.5)
    */

public final class Point {

    private final double x;
    private final double y;

    public Point() {
        x = 0;
        y = 0;
    }

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

    public Point translate(int x, int y) {
        x += this.x;
        y += this.y;
        return new Point(x, y);
    }

    public Point scale(double factor) {
        return new Point(this.x * factor, this.y * factor);
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }
}
