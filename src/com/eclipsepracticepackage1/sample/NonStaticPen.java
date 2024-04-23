package com.eclipsepracticepackage1.sample;

public class NonStaticPen {

	
	static int o=10;
	
	static
	{
		o=20;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		NonStaticPen ns=new NonStaticPen();
		
		System.out.println(o);
	}
		
		{
			o=30;
		}

}
