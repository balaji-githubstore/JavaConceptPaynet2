package com.paynet.logics;

public class Demo1 {

	public static void main(String[] args) {
		
		int num=10;
		
		if(num<0)
		{
			System.out.println("Negative : "+num);
		}
		else if(num==0)
		{
			System.out.println("it's zero");
		}
		else
		{
			System.out.println("Positive :"+num);
		}
		
		int pageNumber=160;
		
		if(pageNumber>=100)
		{
			if(pageNumber<=200)
			{
				System.out.println("It's between 100 and 200");
			}
		}
		
		if(pageNumber>=100 && pageNumber<=200)
		{
			System.out.println("It's between 100 and 200");
		}
		
		int n=25;
		
		if(n>0)
		{
			System.out.println("positive1");
			
			System.out.println("positive2");
		}
		
	}
}



