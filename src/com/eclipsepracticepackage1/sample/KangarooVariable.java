package com.eclipsepracticepackage1.sample;

public class KangarooVariable {

	
	//global variable 
	int i=10;  
	
	void display()
	{
		//local variable
		 int i=20;
		
		System.out.println(i);
		System.out.println(this.i);
	}
	
	void show()
	
	{
		System.out.println(i);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KangarooVariable kv=new KangarooVariable();
		
		kv.display();
		kv.show();
		
		
	}

}
