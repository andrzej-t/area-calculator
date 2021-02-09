package com.areacalculator.figures;

public class CircleArea {
    double r;

    public CircleArea(double r) {
        this.r = r;
    }

    public double calculateCircleArea() {
        return Math.PI * r * r;
    }
}
