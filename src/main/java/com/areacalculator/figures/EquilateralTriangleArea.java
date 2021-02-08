package com.areacalculator.figures;

public class EquilateralTriangleArea {
    double a;
    double b = 1.73205080756;


    public EquilateralTriangleArea (double a) {
        this.a = a;
    }

    public double calculateEquilateralTriangle() {
        return a*a*b/4;
    }
}
