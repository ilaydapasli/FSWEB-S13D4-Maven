package org.example;

public class Point {
    // x ve y instance değişkenleri olmalı (static olmamalı)
    private int x;
    private int y;

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter ve Setter metodları (setter'lar private olmalı)
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // 1. Overloaded distance(): (0,0) noktasına uzaklığı hesaplar
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    // 2. Overloaded distance(Point p): Verilen bir Point'e uzaklığı hesaplar
    public double distance(Point p) {
        int dx = this.x - p.getX();
        int dy = this.y - p.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    // 3. Overloaded distance(int a, int b): Verilen (a,b) noktasına uzaklığı hesaplar
    public double distance(int a, int b) {
        int dx = a - this.x;
        int dy = b - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
