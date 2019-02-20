package com.thoughtworks.tw101.exercises.exercise6;

public interface Monster {
    String name = "";
    int hitPoints = 0;
    int takeDamage(int amount);
    void reportStatus();

}
