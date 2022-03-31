package com.paynet.methods;

public class Demo1 {


	public static void main(String[] args) {
		
		
		int radius = 10;
		
		Area demoObj=new Area();

		double res = demoObj.areaOfCircle(10);
		System.out.println(res);

		res = demoObj.areaOfCircle(20);
		System.out.println(res);
		
		demoObj.quit();
		
		double result = Area.areaOfRectange(10.2, 10.2);
		System.out.println(result);
		
		result=Area.areaOfTriangle(25, 1);
		System.out.println(result);
		
		String name=Area.getAuthorName();
		System.out.println(name);
		
		Area.printClassDescription();
		
		
		
	}

}
