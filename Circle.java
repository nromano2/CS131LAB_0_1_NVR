/**
 * This class exists to create a circle object with a radius value.
 * This class has methods to compute the area of that circle, and to return and modify the value of the Circle's radius
 */

/**
 * @author Nicholas Romano
 * @version 1.0
 * CS131Lab_0_1_NVR
 * Spring 2023
 */

public class Circle {
	private int radius; // the radius integer instance variable will be used to store the radius of the circle
	
	/**
	 * The empty-argument Circle constructor initializes the radius variable of the circle object to have a value of 0
	 */
	public Circle()
	{
		this.radius = 0;
	}//end constructor
	
	/**
	 * @param radius, Circle constructor initializes the radius variable of the circle to have a length based on the parameter value being passed
	 */
	public Circle(int radius)
	{
		this.radius=radius;
	}//end constructor
	
	/**
	 * The getArea method calculates and returns the area of the circle.
	 * 
	 * @param area, a local double variable used to calculate the value of the area of the circle
	 * @return the local double variable area, returns the calculated area of the circle 
	 */
	public double getArea()
	{
		double area = Math.PI * Math.pow(radius,2);
		return area;
	}//end getArea
	
	/**
	 * Accessor method getRadius returns the current value of the radius
	 * 
	 * @return the current value of radius
	 */
	public int getRadius()
	{
		return radius;
	}//end getRadius
	
	/**
	 * Mutator method setRadius modifies radius to be set to a new value
	 * 
	 * @param radius, the new value that radius is to be set to
	 */
	public void setRadius(int radius)
	{
		this.radius = radius;
	}//end setRadius
	
	public String toString()
	{
		double area  = Math.PI * Math.pow(radius,2);
		return ("Radius legnth of the circle: " + radius  + " unit(s)\n" + "Area of the Circle: " +  area + " square units\n");
	}//end toString
	
}
