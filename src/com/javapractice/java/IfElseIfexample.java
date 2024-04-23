package com.javapractice.java;

public class IfElseIfexample {

	public static void main(String[] args) {
		
		
		int marks=40;
		
		if (marks>=81 && marks<=100)
		{
			System.out.println("Distinction");
		}
		else if(marks>=70 && marks<=81)
		{
			System.out.println("First Class");
		}
		else if(marks>=60 && marks<=70)
		{
			System.out.println("Second Class");
		}
		else if(marks>=50 && marks<=60)
		{
			System.out.println("Third Class");
		}
		else if (marks>=40 && marks<=50)
		{
			System.out.println("Passed");
		}
		else 
		{
			System.out.println("Failed");
		}
		

	}

}
