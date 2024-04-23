package com.eclipsepracticepackage.array;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		KFC k=new KFC();
		  
		Food obj=k.order(3);
		
		if (obj instanceof Pizza)
		
		{
			System.out.println("eating pizza");
		}
		
		else if(obj instanceof Burgger)
		{
			System.out.println("eating burgger");
		}
		else {
			System.out.println("eating Sandwich");
		}
		
		
	}

}
