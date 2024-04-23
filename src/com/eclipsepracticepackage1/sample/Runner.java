package com.eclipsepracticepackage1.sample;

public class Runner {

	
	
	static void m1() {
		
		System.out.println("hai");
		
		int result= m2();
		
		System.out.println("bye "+result);
		
	}
	
	
	static int m2()
	
	{
		return 20;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("start");
		
		m1();
		System.out.println("end");
		
		
		
		
		
		
		
	}

}
