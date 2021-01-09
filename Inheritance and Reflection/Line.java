package com.mycompany.java_horstman.chapter4;

public class Line extends Shape {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point((to.getX() - getPoint().getX()) / 2, (to.getY() - getPoint().getY()) / 2);
    }


    public Line clone() {
        return new Line(new Point(getPoint().getX(), getPoint().getY()), new Point(to.getX(), to.getY()));
    }

    @Override
    public String toString() {
        return "Line{" +
                "to=" + to +
                ",from" + getPoint() +
                '}';
    }
}
