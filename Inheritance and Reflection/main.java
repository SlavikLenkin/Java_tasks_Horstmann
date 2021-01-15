package com.mycompany.java_horstman.chapter4;

public class main {

    private static void printNumberOfEx(int number) {
        System.out.println("-----------------");
        System.out.println("Exercise" + number);
        System.out.println();

    }

    public static void main(String[] args) {

        //Exercise1
        printNumberOfEx(1);

        Point point = new Point(3, 4);
        System.out.println(point);

        LabelPoint lPoint = new LabelPoint(0, 0, "String");
        System.out.println(lPoint);

        //Exercise2
        printNumberOfEx(2);
        LabelPoint point1 = new LabelPoint(12, 33, "String");
        LabelPoint point2 = new LabelPoint(12, 33, "String");
        LabelPoint point3 = new LabelPoint(19, 5, "Strings");

        System.out.println(point1.equals(point2));
        System.out.println(point2.equals(point1));
        System.out.println(point3.equals(point2));

        //Exercise3
        printNumberOfEx(3);

        //System.out.println(lPoint.x); there is no access to x only through the getter

        //Exercise4

        printNumberOfEx(4);
        Circle circle = new Circle(new Point(2, 2), 10);
        Rectangle rectangle = new Rectangle(new Point(10, 10), 10, 10);
        Line line = new Line(new Point(0, 0), new Point(5, 4));
        System.out.println(circle.getCenter());
        System.out.println(rectangle.getCenter());
        System.out.println(line.getCenter());

        //Exercise5
        printNumberOfEx(5);

        System.out.println("use clone to circle = " + circle.clone().toString());
        System.out.println("use clone to rectangle = " + rectangle.clone().toString());
        System.out.println("use clone to line = " + line.clone().toString());

        //Exercise6
        printNumberOfEx(6);

        DiscountedItem x = new DiscountedItem("Desc", 255, 1);
        Item y = new Item("Desc", 255);
        DiscountedItem z = new DiscountedItem("Desc", 255, 15);
        System.out.println(x.equals(y));
        System.out.println(y.equals(z));
        System.out.println(x.equals(z));

        //Exercise7
        printNumberOfEx(7);

        Colors blue = Colors.getBlue();
        System.out.println(blue);

    }
}
