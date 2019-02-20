package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private String name;
    private int hitPoints;

    public Orc(String name, int hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }

    @Override
    public int takeDamage(int amount) {
        return this.hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("Name is: " + this.name + " and hit points: " + this.hitPoints);
    }
}
