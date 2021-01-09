package com.mycompany.java_horstman.chapter4;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(getPoint().getX() + width / 2, getPoint().getY() - height / 2);
    }

    public Rectangle clone() {
        return new Rectangle(new Point(getPoint().getX(), getPoint().getY()), width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", topLeft" + getPoint() +
                '}';
    }
}
