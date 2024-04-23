package com.eclipsepracticepackage.array;

public class Employee {

	//global private variables 
	private int id;
	private String name;
	
	
	//get method
	public int getid() {
		return id;
	}
	//set method
	public void setid(int id) {
		//this keyword is used to get global variable
		this.id=id;
		
	}
	
	public String getname()
	{
		return name;
		
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	
	
	
	
	
	
	
}
