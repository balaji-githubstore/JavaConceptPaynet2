package com.paynet.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		
		List<String> colors=new ArrayList<String>();
		
		colors.add("red");
		colors.add("green");
		colors.add("yellow");
		
		
		
		System.out.println(colors);
		System.out.println(colors.get(1));
		
		colors.add("blue");
		
		System.out.println(colors.size());
		
		colors.remove("yellow");
		
		
		System.out.println(colors.size());
		
		for(String col : colors)
		{
			System.out.println(col);
		}
		
		List<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		
		System.out.println(numbers.get(0));
	}
}
