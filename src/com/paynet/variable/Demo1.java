package com.paynet.variable;

public class Demo1 {
	public static int aS=10; //static variable or class variable 
	public static int bS=20;
	
	public int aNS=10; //non-static variable or instance variable 
	public int bNS=20;
	
	public static void main(String[] args) {
		
		Demo1.aS=5000;
		
		System.out.println(Demo1.aS);
		System.out.println(Demo1.bS);
		
		Demo1 obj1=new Demo1();  //instance
		Demo1 obj2=new Demo1(); //instance 
		
		obj1.bNS=8000;
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
	}
}
