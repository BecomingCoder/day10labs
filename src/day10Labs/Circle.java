package day10Labs;
// Import all of my Classes
import java.text.*;
import java.lang.Math;

// Created my class
public class Circle {
	
	// Set my variable
	private double Radius;

	// Getter to call radius on input
	public double getRadius() {
		return Radius;
	}
	
	// Initialize and increment counter on every instance of a radius input
	static int counter = 0;
	public void setRadius(double radius) {
		Radius = radius;
		//counter++;// fix 2
	}
	public Circle()
	{
		counter++;// kamel fix 2 
	}
	public Circle (double r)
	{
		counter++;// kamel fix 2 
		setRadius(r);
	}
	// Set method for circumference
	public double getCircumference() {
		return 2 * Math.PI * Radius;
	}
	
	// Set method for area
	public double getArea() {
		return Math.PI * Radius * Radius;
	}
	
	// Set return for formatted circumference
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());
		
	}
	
	// Set return for formatter area
	public String getFormattedArea() {
		return formatNumber(getArea());
	}
	
	
	// Method to format output to 2 decimals max
	private String formatNumber(double x) {
		NumberFormat nf = new DecimalFormat("#,###.00");
		return nf.format(x);
	}
	

	// Set return for object counter
	public static int getObjectCount() {
		return counter;
	}
	

}
