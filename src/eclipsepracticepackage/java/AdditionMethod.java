package eclipsepracticepackage.java;

public class AdditionMethod {
	
	
	int a=10;
	int b=20;
	
	//method with arguments and without return statement
	void add(int a,int b)
	{
		System.out.println("sum of the "+a+ " & " +b+" is equal to "+ (a+b));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		AdditionMethod ad=new AdditionMethod();
		
		ad.add(5, 10);
		
		
		
	}

}
