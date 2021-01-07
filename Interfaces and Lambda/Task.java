package com.mycompany.java_horstman.chapter3;

    /*
    Exercise10
    Implement methods
    public static void runTogether(Runnable... tasks)
    public static void runInOrder(Runnable... tasks)
    The first method should run each task in a separate thread and then return.
    The second method should run all methods in the current thread
    and return when the last one has completed.
     */

public class Task implements Runnable {

    String task;

    public Task(String task) {
        this.task = task;
    }

    @Override
    public void run() {
        System.out.println("Run, " + task);
    }

    public static void runTogether(Runnable... tasks) {
        for (Runnable task : tasks) {
            new Thread(task).start();
        }
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }


}
