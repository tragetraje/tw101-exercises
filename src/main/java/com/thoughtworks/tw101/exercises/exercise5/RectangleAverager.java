package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {
    private static float sumOfAreas;

    public float averageArea(Rectangle[] rectangles) {

        for (int i = 0; i < rectangles.length; i++ ) {
            sumOfAreas += rectangles[i].area();
        }
        System.out.printf("\nSum of all areas: %.1f, number of recs %d", sumOfAreas, rectangles.length);
        return sumOfAreas / rectangles.length;
    }
}
