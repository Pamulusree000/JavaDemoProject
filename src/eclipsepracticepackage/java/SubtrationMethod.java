package eclipsepracticepackage.java;

public class SubtrationMethod {

	
		int a=10;
		int b=15;
		
	//Method without arguments and with return statement
	int sub()
	{
		System.out.println("sum of the "+a+ " & " +b+" is equal to "+ (a-b));
		return a&b;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubtrationMethod sm=new SubtrationMethod();
		sm.sub();
		
	}

}
