package com.mycompany.java_horstman.chapter4;

public class Circle extends Shape {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return getPoint();
    }

    public Circle clone() {
        return new Circle(new Point(getCenter().getX(), getCenter().getY()), radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ",Center=" + getCenter() +
                '}';
    }
}
