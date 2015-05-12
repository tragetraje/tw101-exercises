package com.thoughtworks.tw101.exercises.exercise5;

// Exercise #5: Create an array of 5 Rectangles (each with height and width instance variables and an area() method).
// Find the average area of the rectangles.

public class Main {
    public static void main(String[] args) {

        Rectangle[] rectangles = {
                new Rectangle(2, 3),
                new Rectangle(3, 4),
                new Rectangle(4, 5),
                new Rectangle(5, 6),
                new Rectangle(6, 7)
        };

        RectangleAverager rectangleAverager = new RectangleAverager();

        float average = rectangleAverager.averageArea(rectangles);

        System.out.println(average);
    }

}
