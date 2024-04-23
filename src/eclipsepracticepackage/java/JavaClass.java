package eclipsepracticepackage.java;

public class JavaClass {
	
	public static void main (String args []) {
	
		
		int a =50;
		int b =30;
		
		
		if(a<=b) 
		{
			System.out.println(a+"less than equal to"+b);
			
		}
		else 
		{
			System.out.println(a+"greater than equal to"+b);
		}
		
		System.out.println("_________________");
	
		if(true) 
		{
			System.out.println("greater");
		}
		else 
		{
			System.out.println("lesser");
		}
		
		if(false)
		{
		System.out.println("lesser");
		}
		else {
			System.out.println("greater");
		}
		//------------------------------------------------------------------------------------------------------------------------
		
		int h=10;
		int i=10;
		
		
		if(h<i) 
		{
			System.out.println(h+"less than"+i);
			
		}
		else if(h>i) 
		{
			System.out.println(h+"greater than"+i);
			
		}
		else {
			System.out.println(h+"is equal to"+i);
		}
		
		//-----------------------------------------------------------------------------------------------
		
		int marks =70;
		
		
		if (marks>=81 && marks<=100) 
		{
			System.out.println("distinction pass");
		}
		else if(marks>=70 && marks<=81) 
		{
			System.out.println("first class");
		}
		else if(marks>=60 && marks<=70) {
			
			System.out.println("second class");
		}
		
		else if(marks>=50 && marks<=60) {
			
			System.out.println("third class");
		}
		else if(marks>=35 && marks<=40)
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		
		//-----------------------------------------------------------------------------------------------------
		
		String id= "sreekanth";
		String password ="Idea123";
		
		
		if (id.equals("sreekanth"))
		{
			
			System.out.println("user is valid");
			
			if (password.equals("Idea123")) 
			{
				System.out.println("password is valid");
				
				if (id.equals("sreekanth") && password.equals("Idea123")) 
				{
					
					System.out.println("login is sucessfull");
					
				}
				else {
					System.out.println("login is not successfull");
				}
				
			}
			else {
				System.out.println("password is not valid");
			}

		}
		else {
			System.out.println("user is not valid");
		}
		
		
		
		//----------------------------------------------------------------------------------------
		
		
		char grade = 'C';
		
		
		switch(grade) {
		
		case 'A': System.out.println("first class");
		          break;
		case 'B': System.out.println("second class");
				  break;
		case 'C': System.out.println("thrid class");
				  break;
		case 'D': System.out.println("fourth class");
		          break;
		default : System.out.println("fail in the class");
		          break;

		
		}
		
		//--------------------------------------------------------------------------------
		
		
		for(int m=1;m<=15;m++)
		{
			System.out.println("sree");
		}
		
		
		//--------------------------------------------------------------------------------
		
		int n=5;
		int sum=0;
		
		for (i=1;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println("sum: "+sum);
		
		//------------------------------------------------------------------------------
		
		for (i=5;i>=1;i--)
			
		{
			System.out.println(i);
		}
		
		//------------------------------------------------------------------------------
		
		
		int k=1;
		
		while(k<=5) {
			
			System.out.println(k);
			k++;
		}
		
		//----------------------------------------------------------------------------
		
		int s=1;
		
		do {
			System.out.println(s);
			s++;
		}
		while(s<=10);
		
		//-------------------------------------------------------------------------------
		for (int x=1;x<=5;x++) 		
		{
		for (int y=1;y<=5;y++)
		{
			System.out.println("* ");
		}
			System.out.println();
		}
		 	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
