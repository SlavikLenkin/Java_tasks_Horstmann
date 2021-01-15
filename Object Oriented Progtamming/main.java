package com.mycompany.java_horstman.chapter2;

public class main {
    public static void main(String[] args) {

        Point point = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println("Exercise5 --> point" + point);

        System.out.println("Exercise9");
        Car car = new Car(10,100);
        car.fillCar(100);
        car.move(700);
        System.out.println(car);
    }
}
