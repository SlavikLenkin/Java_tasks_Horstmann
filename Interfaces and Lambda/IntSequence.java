package com.mycompany.java_horstman.chapter3;

    /*
    Exercise4
    Implement a static of method of the IntSequence class that yields a sequence
    with the arguments. For example, IntSequence.of(3, 1, 4, 1, 5, 9) yields a
    sequence with six values. Extra credit if you return an instance of an
    anonymous inner class.

    Exercise5
    Add a static method with the name constant of the IntSequence class that
    yields an infinite constant sequence. For example, IntSequence.constant(1)
    yields values 1 1 1..., ad infinitum. Extra credit if you do this with a
    lambda expression
    */

public interface IntSequence {

    boolean hasNext();

    int next();

    static IntSequence of(int... numbers) {
        return new IntSequence() {
            private int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < numbers.length;
            }

            @Override
            public int next() {
                return numbers[pos++];
            }
        };

    }

    static IntSequence constant(int number){
        return new IntSequence() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public int next() {
                return (number);
            }
        };
    }
}
