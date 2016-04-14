package day10Labs;

import java.math.*;
import java.text.*;
import java.lang.Math;

public class Circle {
	
	private double Radius;

	public double getRadius() {
		return Radius;
	}

	public void setRadius(double radius) {
		Radius = radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * Radius;
	}
	
	public double getArea() {
		return Math.PI * Radius * Radius;
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
		
	}
	
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	
	private String formatNumber(double x) {
		numberFormat.setMaximumIntegerDigits(2);
	}
	
/*	static int counter = 0;
	public Circle(double radius) {
		super();
		Radius = radius;
		counter++;
	}*/

/*	public static int getObjectCount() {
		return counter;
	}*/
	

}
