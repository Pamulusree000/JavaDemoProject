package eclipsepracticepackage.java;

public class Ifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=20;
		
		if(a>b)
		{
			//it will display if a has more value
			System.out.println("a is greater than b");
			
		}
		else {
			//it will display if b has more value
			System.out.println("b is greater than a");
		}
		
		int c=30;
		int d=40;
		
		if(a>c) 
		{
			//it will display if a has more value
			System.out.println("a is greater than c");
		}
		else if(b>d) 
		{
			//it will display if b has more value
			System.out.println("b is greater than d");
		}
		else 
		{
			//it will display if both a&b are not greater
			System.out.println("both are not greater");
		}
		
		
		
	}

}
