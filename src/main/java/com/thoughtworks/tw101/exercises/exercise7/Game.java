package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

public class Game {
    private int randomNumber;
    private int guess;

    public Game() {
        randomNumber = generateNumber();
    }
    
    private int generateNumber() {
        return (int)(Math.random() * 100 + 1);
    }

    private void askNumber() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Guess a number from 1 to 100: ");
        guess = reader.nextInt();

        if (guess < randomNumber) {
            System.out.println("Your guess is too low");
        } else if (guess > randomNumber) {
            System.out.println("You guess is too high");
        } else {
            System.out.println("You won!");
        }
        // reader.close();
    }

    public void run() {
        while (guess != randomNumber) {
            askNumber();
        }
    }
}
