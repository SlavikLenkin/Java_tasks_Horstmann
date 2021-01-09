package com.mycompany.java_horstman.chapter4;

    /*
    Exercise4
    Define an abstract class Shape with an instance variable of class Point, a
    constructor, a concrete method public void moveBy(double dx, double dy) that
    moves the point by the given amount, and an abstract method public Point
    getCenter(). Provide concrete subclasses Circle, Rectangle, Line with constructors
    public Circle(Point center, double radius), public Rectangle(Point topLeft, double width,
    double height), and public Line(Point from, Point to).
    Exercise5
    Define clone methods for the classes of the preceding exercise
    */

public abstract class Shape {
    private Point point;

    public Point getPoint() {
        return point;
    }

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point = new Point(point.getX() + dx, point.getY() + dy);
    }

    public abstract Point getCenter();
}
