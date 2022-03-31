package com.paynet.datatypes;

public class DatatypesDemo3 {

	
	public static void main(String[] args) {
		
		//10,20,30,40,50
		
		int[] numbers=new int[5]; //5*32 bits of memory
		
		numbers[0]=10;
		numbers[1]=20;
		numbers[2]=30;
		numbers[3]=40;
		numbers[4]=50;
		
		System.out.println(numbers);
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		
		//10.2, 20.3 , 50.3
		//create double array to store above values
		double[] arr=new double[5]; //4*64 bits 
		
		arr[0]=10.2;
		arr[1]=20;
		arr[2]=50.3;
		
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//declare string array and store red, green, yellow
		
		String[] colors=new String[3];
		
		colors[0]="red";
		colors[1]="green";
		colors[2]="yellow";
		
		System.out.println(colors);
		System.out.println(colors[0]);
		System.out.println(colors[1]);
		System.out.println(colors[2]);
		
		int[] z= {10,20,50,60,88,4};
		
		System.out.println(z[1]);
		int length=z.length;
		System.out.println(length);
	}
}


