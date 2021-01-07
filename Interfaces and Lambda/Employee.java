package com.mycompany.java_horstman.chapter3;

public class Employee implements Measurable{
    double salary;
    String name;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public double getMeasurable() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
