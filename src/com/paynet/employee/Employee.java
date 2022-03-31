package com.paynet.employee;

public class Employee {
	
	public int empId;
	public String empName;
	public double empSalary;
	public static String companyName;
	
	public Employee(int id)
	{
		empId=id;
		System.out.println("Object Created!!!");
		System.out.println("Browser launch !!!");
		System.out.println("--------------------------------");
	}
	
	public void printEmployeeDetail()
	{
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empSalary);
		System.out.println(Employee.companyName);
		System.out.println("----------------------");
	}
	
	public static Employee getEmployeeInstance()
	{
		Employee e=new Employee(1);
		return e;
	}
	
	public static void printEmployeeName(Employee emp)
	{
		System.out.println(emp.empName);
	}

}
