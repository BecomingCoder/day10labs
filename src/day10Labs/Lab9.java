package day10Labs;

import java.util.*;


public class Lab9 {
	// Initialize all of my variables for user input
	public static Scanner sc = new Scanner(System.in);
	public static String choice = "y";
	// public static Circle c = new Circle(); old code 1
	public static double x = 0;
	
	public static void main(String[] args) {
		// Print out welcome message
		System.out.println("Welcome to the Circle Tester");
		System.out.println();
		
		// Set while loop for user to continue with a new operation
		while(choice.equalsIgnoreCase("y")) {
			Circle c = new Circle();// kamel fix 1
			// Call for user to input radius
			System.out.println("Enter Radius:  ");
			// Set input to pass into validation method
			double x = readValidDoubleNoExp();
			// Pass input to Circle class
			c.setRadius(x);
			
			// Print results based on methods for Area & Circumference
			System.out.println("Circumference: " + c.getFormattedCircumference());
			System.out.println("Area: " + c.getFormattedArea());
			
			// Validates user input to continue program
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
		}
		
		sc.close();
		// Print goodbye message and also object counter
		System.out.println("Goodbye.  You created " + Circle.getObjectCount() + " Circle object(s).");


	}


	// Method for validation
	public static double readValidDoubleNoExp() {
		while (true) {
			// Call for a double on input, will break validation loop once there is one
			if (sc.hasNextDouble())
				break;
			sc.nextLine();
			System.out.println("Please enter numbers only!");
			
			}
		//Set input to pass back into loop
		double x = sc.nextDouble();
		sc.nextLine();
		return x;
	}
}
