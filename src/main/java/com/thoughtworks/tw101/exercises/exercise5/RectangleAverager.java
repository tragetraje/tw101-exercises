package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private static float sumOfAreas;

    public float averageArea(Rectangle[] rectangles) {

        for (int i = 0; i < rectangles.length; i++ ) {
            sumOfAreas = sumOfAreas + rectangles[i].area();
        }
        System.out.println("Sum of all areas: " + sumOfAreas+ " number of recs: " + rectangles.length);
        return sumOfAreas / rectangles.length;
    }
}
