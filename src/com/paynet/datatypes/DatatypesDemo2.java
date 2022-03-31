package com.paynet.datatypes;
//arthimetics operation
public class DatatypesDemo2 {

	public static void main(String[] args) {

		int a = 11;
		int b = 2;

		int result = a + b;
		System.out.println("Sum of a and b is " + result);

		// sub
		result = a - b;
		System.out.println(result);

		// mul
		result = a * b;
		System.out.println(result);

		// div
		result = a / b;
		System.out.println(result);

		double c = 11;
		double d = 2;

		double output = c / d;
		System.out.println(output);

		double res = (double) a / b;
		System.out.println(res);

		int rem = a % b; // mod operator

		System.out.println(rem);

		int radius = 10;

		System.out.println((double)22 / 7 * radius * radius);
		System.out.println(22.0 / 7 * radius * radius);
		System.out.println(22.0f / 7 * radius * radius);
		
		String name="hello"; //5*16 bits of memory 
		System.out.println(name);
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.charAt(2));
	}

}





