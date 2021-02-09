package com.areacalculator;
import com.areacalculator.figures.CircleArea;
import com.areacalculator.figures.EquilateralTriangleArea;
import com.areacalculator.figures.RectangleArea;
import com.areacalculator.figures.SquareArea;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWhich figure area would You like to check? \n\nPut the number and press Enter: \n [ 1 - for square ] \n [ 2 - for rectangle ] \n [ 3 - for equilateral triangle ] \n [ 4 - for circle ]");
        System.out.println(" ");
        double a = scan.nextDouble();

        if (a==1) {
            System.out.println("Enter the length of the side of the square (in 0.00 format): \n");
            SquareArea squareArea = new SquareArea(scan.nextDouble());
            System.out.println("The area of the square is: " + squareArea.calculateSquare());
        } else if (a==2) {
            System.out.println("Enter the length of the first side of the rectangle (in 0.00 format): \n");
            double c = scan.nextDouble();
            System.out.println("Enter the length of the second side of the rectangle (in 0.00 format): \n");
            double d = scan.nextDouble();
            RectangleArea rectangleArea = new RectangleArea(c, d);
            System.out.println("The area of the rectangle is: " + rectangleArea.calculateRectangle(c,d));
        }else if (a==3) {
            System.out.println("Enter the length of the side of the equilateral triangle (in 0.00 format): \n");
            EquilateralTriangleArea equilateralTriangleArea = new EquilateralTriangleArea(scan.nextDouble());
            System.out.println("The area of the equilateral triangle is: " + equilateralTriangleArea.calculateEquilateralTriangle());
        }else if (a==4) {
            System.out.println("Enter the radius length of the circle (in 0.00 format): \n");
            CircleArea circleArea = new CircleArea(scan.nextDouble());
            System.out.println("The area of the circle is: " + circleArea.calculateCircleArea());
        } else {
            System.out.println("You did not choose figure from the list, try again!");
        }
    }
}
