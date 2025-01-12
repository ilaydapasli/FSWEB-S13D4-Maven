package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Point p1 = new Point(3, 4); // (3,4) noktasında bir Point
        Point p2 = new Point(7, 1);
        System.out.println("Distance to (0,0): " + p1.distance());

        // Diğer bir noktaya uzaklık
        System.out.println("Distance to Point p2: " + p1.distance(p2));

        // Verilen koordinatlara uzaklık
        System.out.println("Distance to (10,5): " + p1.distance(10, 5));
    }
}