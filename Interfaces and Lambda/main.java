package com.mycompany.java_horstman.chapter3;

import java.io.File;
import java.util.ArrayList;

public class main {

    private static void printNumberOfEx(int number) {
        System.out.println("-----------------");
        System.out.println("Exercise" + number);
        System.out.println();

    }

    public static void main(String[] args) {


        //Exercise1-2
        printNumberOfEx(1);
        Measurable employee1 = new Employee(20, "Slava");
        Measurable employee2 = new Employee(30, "Bili");
        Measurable employee4 = new Employee(40, "Kristi");

        Measurable[] mas = new Measurable[]{employee1, employee2, employee4};

        System.out.println("Average = " + Measurable.average(mas));
        printNumberOfEx(2);
        System.out.println("Largest = " + Measurable.largest(mas));

        System.out.println("Measurable = " + employee1.getMeasurable());


        //Exercise4
        printNumberOfEx(4);
        IntSequence sequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }

        //Exercise5
        printNumberOfEx(5);
        IntSequence constant = IntSequence.constant(1);
        System.out.println("an infinite constant sequence.");
        /*
        while (constant.hasNext()) {
            System.out.println(constant.next());
        }
         */

        //Exercise8
        printNumberOfEx(8);
        ArrayList<String> arrlist = new ArrayList<>();
        arrlist.add("Alabama");
        arrlist.add("Iowa");
        arrlist.add("Texas");
        LuckySort.luckySort(arrlist, String::compareTo);


        //Exercise9
        printNumberOfEx(9);
        Greeter greeter1 = new Greeter("Bili", 10);
        Greeter greeter2 = new Greeter("Kristi", 15);
        new Thread(greeter1).run();
        new Thread(greeter2).run();

        //Exercise10
        printNumberOfEx(10);
        Task helloWorld = new Task("hello world");
        Task goodbyeWord = new Task("goodbye word");
        Task luckySort = new Task("lucky sort");

        Task.runTogether(helloWorld, goodbyeWord, luckySort);
        Task.runInOrder(helloWorld, goodbyeWord, luckySort);


        //Exercise11

        printNumberOfEx(11);
        File file = new File("C:\\Fraps");

        Directory.printFiles(Directory.getSubDir1(file));
        Directory.printFiles(Directory.getSubDir2(file));

        printNumberOfEx(12);
        Directory.printFiles(Directory.getAllFiles(file, "txt"));
        File[] files = Directory.getSubDir1(file);
        printNumberOfEx(13);
        Directory.sortFiles(files);
        Directory.printFiles(files);


    }


}
