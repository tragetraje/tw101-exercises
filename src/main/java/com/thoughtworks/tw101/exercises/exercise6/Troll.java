package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private String name;
    private int hitPoints;

    public Troll(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    @Override
    public int takeDamage(int amount) {
        return this.hitPoints -= (amount / 2);
    }

    @Override
    public void reportStatus() {
        System.out.println("Name is: " + this.name + " and hit points: " + this.hitPoints);
    }
}
