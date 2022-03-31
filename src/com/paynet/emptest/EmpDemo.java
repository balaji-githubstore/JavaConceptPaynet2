package com.paynet.emptest;

import com.paynet.employee.Employee;

public class EmpDemo {

	public static void main(String[] args) {
		
		
		
		Employee.companyName="PayNet";
		
		Employee emp1=new Employee(101);
		Employee emp2=new Employee(102);
		Employee emp3=new Employee(103);
		
		Employee emp4= Employee.getEmployeeInstance();
		Employee emp5= Employee.getEmployeeInstance();
		
		//load employee 1  record
		emp1.empId=101;
		emp1.empName="john";
		emp1.empSalary=7800;
		
		//load employee 2  record
		emp2.empId=102;
		emp2.empName="peter";
		emp2.empSalary=9800;
		
		
//		emp5.empId=105;
//		emp5.empName="Paul";
//		emp5.empSalary=89000;
		
		
		emp2.printEmployeeDetail();
		
		emp1.printEmployeeDetail();
		
		emp3.printEmployeeDetail();
		
//		emp5.printEmployeeDetail();
		
		Employee.printEmployeeName(emp2);
		
	}

}
