package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    private int sum;

    public OddSum() {
        sum = 0;
    }
    public int of(int start, int end) {

        for (int i = start; i <= end; i++) {

            if (isOdd(i)) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        return sum;
    }

    private boolean isOdd(int number) {
        return number % 2 != 0;
    }
}
