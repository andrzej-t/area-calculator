package com.areacalculator.figures;

public class RectangleArea {
    double a;
    double b;

    public RectangleArea (double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double calculateRectangle (double a, double b) {
        return a*b;
    }
}
