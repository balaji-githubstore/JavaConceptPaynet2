package com.paynet.methods;

public class Area {

	public double areaOfCircle(int r) {
		double output = 3.14 * r * r;
		return output;
	}

	public static double areaOfRectange(double length, double width) {
		return length * width;
	}

	public static double areaOfSquare(double side) {
		return side * side;
	}

	public static double areaOfTriangle(double base, double height) {
		return (base * height) / 2;
	}
	
	public static String getAuthorName()
	{
		return "Balaji Dinakaran";
	}
	
	public static void printClassDescription()
	{
		
	}
	
	public void quit()
	{
		
	}
}





