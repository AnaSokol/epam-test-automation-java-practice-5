package com.epam.test.automation.java.practice5;

public class Rectangle {
    private double sideA;
	private double sideB;

    public Rectangle(double a, double b) {
        if (a > 0 && b > 0) { 
			this.sideA = a;		
		    this.sideB = b;
		}
		else
			throw new IllegalArgumentException();
    }

    public Rectangle(double a) {
        this(a, 5);
    }

    public Rectangle() {
        this(4, 3);
    }
   
    public double getSideA() {
        return this.sideA;
    }
   
    public double getSideB() {
        return this.sideB;
    }

    public double area() {
        return this.sideA*this.sideB;
    }
    
    public double perimeter() {
        return 2*(this.sideA+this.sideB);
    }

    public boolean isSquare() {
        if (this.sideA == this.sideB) return true;
		return false;
    }

    public void replaceSides() {
        double temp = this.sideA;
        this.sideA = this.sideB;
        this.sideB = temp;
    }

}
