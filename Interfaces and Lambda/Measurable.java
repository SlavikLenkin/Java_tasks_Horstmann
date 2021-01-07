package com.mycompany.java_horstman.chapter3;

    /*
     Exercise1
     Provide an interface Measurable with a method double getMeasure() that measures an object in some way.
     Make Employee implement Measurable. Provide
     a method double average(Measurable[] objects) that computes the average
     measure. Use it to compute the average salary of an array of employees.

     Exercise2
     Continue with the preceding exercise and provide a method Measurable
     largest(Measurable[] objects). Use it to find the name of the employee with
     the largest salary. Why do you need a cast?
    */


public interface Measurable {

    double getMeasurable();


    static double average(Measurable[] objects) {
        double sum = 0;

        for (Measurable emp : objects) {
            sum += emp.getMeasurable();
        }
        if (objects.length > 0) {
            return sum/objects.length;
        } else {
            System.out.println("number of employees 0");
            return 0;
        }
    }

    static String largest(Measurable[] objects) {
        double maxSalary = 0;
        String name = new String();
        if (objects.length==0 ){
            System.out.println("number of employees 0");
            return null;
        }
        for (Measurable emp : objects) {
            if (emp.getMeasurable() >= maxSalary) {
                maxSalary = emp.getMeasurable();
                name = ((Employee)emp).getName(); //getName belongs to class Employee
            }
        }
        return name;
    }

}
