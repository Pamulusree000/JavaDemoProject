package com.eclipsepracticepackage1.sample;

public class Employee {

	
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee e1=new Employee(100,"naresh",1000.23);
		
		Employee e2=new Employee (101,"lokesh",2000.52);
		
	
		System.out.println("ID: "+e1.id);
		System.out.println("Name: "+e1.name);
		System.out.println("salary "+e1.salary);
		
		System.out.println("-----------------------");
		
		System.out.println("ID: "+e2.id);
		System.out.println("Name: "+e2.name);
		System.out.println("Salary "+e2.salary);
		
		
	}

}
