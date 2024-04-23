package com.eclipsepracticepackage1.sample;

public class Nonstaticexmaple {

	
	static int id;
	
	static
	{		
		id=20;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Nonstaticexmaple ne=new Nonstaticexmaple();
		
		System.out.println("ID: " + Nonstaticexmaple.id );
	
		
	}

}
