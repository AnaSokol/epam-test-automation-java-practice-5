package com.epam.test.automation.java.practice5;

import static org.junit.Assert.*;

import org.junit.Test;


public class RectangleTest {
	
	@Test
	public void testRectangleArea() {
		double a = 3.0;
		double b = 4.0;
		double result = a*b;
		Rectangle r = new Rectangle (a,b);
		double actualResult = r.area();
		assertTrue(result==actualResult);
	}
	
	@Test
	public void testRectanglePerimeter() {
		double a = 3.0;
		double b = 4.0;
		double result = (a+b)*2;
		Rectangle r = new Rectangle (a,b);
		double actualResult = r.perimeter();
		assertTrue(result==actualResult);
	}
	
	@Test
	public void testRectangleIsSquare() {
		double a = 3.0;
		double b = 3.0;
		boolean result = a==b;
		Rectangle r = new Rectangle (a,b);
		boolean actualResult = r.isSquare();
		assertTrue(result==actualResult);
	}
	@Test
	public void testRectangleIsNotSquare() {
		double a = 3.0;
		double b = 4.0;
		boolean result = a==b;
		Rectangle r = new Rectangle (a,b);
		boolean actualResult = r.isSquare();
		assertTrue(result==actualResult);
	}

}
