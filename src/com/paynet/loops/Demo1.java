package com.paynet.loops;

public class Demo1 {
	
	public static void main(String[] args) {
		
		int[] numbers= {10,50,23,7,56,68,22,88,36,74,95,29,32,5};
		
		System.out.println(numbers.length);
		
		// 0 to 10
		//print only the values which are less than or equal to 50
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]<=50)
			{
				System.out.println(numbers[i]);
			}
		}
		
		
		for(int i=0;i<numbers.length;i++)
		{
			if(numbers[i]==50)
			{
				System.out.println("value 50 is present");
				break; //stop the further iteration 
			}
		}
	}

}
