package com.mycompany.java_horstman.chapter2;

    /*
    Exercise9
    Implement a class Car that models a car traveling along the x-axis, consuming gas as it moves.
    Provide methods to drive by a given number of miles,
    to add a given number of gallons to the gas tank, and to get the
    current distance from the origin and fuel level. Specify the fuel efficiency
    (in miles/gallons) in the constructor. Should this be an immutable class?
    Why or why not?
    */

public class Car {

    private double miles;
    private double gallonGas;
    private final double consumingGas;
    private final double gasTankVolume;

    public Car(double consumingGas, double gasTankVolume) {
        this.consumingGas = consumingGas;
        this.gasTankVolume = gasTankVolume;
    }

    public void fillCar(double gallonGas) {
        if (this.gallonGas + gallonGas < gasTankVolume) {
            this.gallonGas += gallonGas;
        } else {
            this.gallonGas = gasTankVolume;
        }
    }

    public void move(double miles) {
        double powerReserve = gallonGas / consumingGas * 100;
        if (miles < powerReserve) {
            this.miles += miles;
            gallonGas = miles * consumingGas / 100;
            System.out.println("You drove " + miles + " miles");
            System.out.println("You are now " + getMiles() + " miles away");
            System.out.println("Gas left in the tank " + getGallonGas() + " gallons");
        } else {
            this.miles += powerReserve;
            gallonGas = 0;
            System.out.println("Out gas");
        }
    }

    public double getMiles() {
        return miles;
    }

    public double getGallonGas() {
        return gallonGas;
    }

    @Override
    public String toString() {
        return "Car{" +
                "miles=" + miles +
                ", gallonGas=" + gallonGas +
                ", consumingGas=" + consumingGas +
                ", gasTankVolume=" + gasTankVolume +
                '}';
    }
}
