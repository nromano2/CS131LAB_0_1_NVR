/**
 * This Application class runs instantiates objects from the Square and Circle classes and uses the methods within those classes within the code
 */

/**
 * @author Nicholas Romano
 * @version 1.0
 * CS131Lab_0_1_NVR
 * Spring 2023
 */
public class Application {

	public static void main(String[] args) {
		Square square = new Square(1); //creating an instance of the Square class to generate a square object with side length 1
		System.out.println("Square Area: " + square.getArea()); //computing and printing the area of the square object created in the previous line of code
		
		Circle circle = new Circle(1); //creating an instance of the Circle class to generate a circle object with a radius of 1
		System.out.println("Circle Area: " + circle.getArea()); //computing and printing the area of the square object created in the previous line of code
	
	}

}
