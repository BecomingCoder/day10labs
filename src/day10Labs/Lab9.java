package day10Labs;

import java.text.NumberFormat;
import java.util.*;


public class Lab9 {
	// Initialize all of my variables for user input
	public static Scanner sc = new Scanner(System.in);
	public static String choice = "y";
	public static Circle c = new Circle();
	
	public static void main(String[] args) {
		// Print out welcome message
		System.out.println("Welcome to the Circle Tester");
		System.out.println();
		
		// Set while loop for user to continue with a new operation
		while(choice.equalsIgnoreCase("y")) {
			
			// Call for user to input radius
			System.out.println("Enter Radius:  ");
			double x = sc.nextDouble();
			c.setRadius(x);
			
			System.out.println("Circumference: ");
			//System.out.println("Area: " + c.getFormattedArea());
			
			// Validates user input to continue program
			System.out.println("Continue? (y/n): ");
			choice = sc.nextLine();
			System.out.println();
			
		}
		
		sc.close();
		System.out.println("Goodbye.  You created x Circle object(s).");


	}

}
