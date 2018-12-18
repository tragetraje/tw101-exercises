package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int numberOfCalls;

    public Accumulator() {
        numberOfCalls = 0;
    }

    public void increment() {
        numberOfCalls = numberOfCalls + 1;
    }

    public void total() {
        System.out.println("increment() was called " + numberOfCalls + " times");
    }

}
