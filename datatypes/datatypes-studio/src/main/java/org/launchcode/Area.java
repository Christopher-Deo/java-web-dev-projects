package main.java.org.launchcode;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isValidInput = false;

        do {
            try {
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();

                if (radius <= 0) {
                    System.out.println("Error: Radius must be a positive number.");
                } else {
                    double area = Circle.getArea(radius);
                    System.out.println("The area of the circle with radius " + radius + " is: " + area);
                    isValidInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid numeric value.");
                scanner.next(); // Clear the invalid input
            }
        } while (!isValidInput);

        scanner.close();
    }
}