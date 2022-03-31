package com.paynet.datatypes;

public class DatatypesDemo1 {

	public static void main(String[] args) {
		
		byte a=127; //8 bits of memory
		short b=100;//16 bits of memory
		int c=100;//32 bits of memory
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		// 1000 students percentage - 0 to 100 
		// byte --> 1000 * 8 = 8000 bits of memory 
		// int --> 1000*32=32000 bits of memory 
		//by choosing precise datatype -- can save 24000 bits of memory
		
		long d=7878787877887L;
		float e=10.2f;		
		double f=10.2;		
		char letter='&';	
		boolean check=true;
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(letter);
		System.out.println(check);
		
		f=d; //int to double // implicit conversion 
		
		f=e; //float to double  // implicit conversion 
		
		c=b; //short to int // implicit conversion 
		

		
		double x=10.55;
		
		int z= (int) x; // double to int // explicit conversion // might lead to dataloss
		
		System.out.println(z);
		
	}

}




