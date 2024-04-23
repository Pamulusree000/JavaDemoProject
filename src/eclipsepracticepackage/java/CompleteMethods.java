package eclipsepracticepackage.java;

public class CompleteMethods {

	
	//Method without arguments and without return statement
	void m1()
	{
		System.out.println("this is just normal method");
	}
	//Method with arguments and without return statement
	void m2(int a,int b)
	{
		System.out.println(a+b);
	}
	//Method with arguments and with return statement
	int m3(int c,int d)
	{
		System.out.println(c*d);
		return  c & d;
	}
	//Method without arguments and with return statement
	String m4() 
	{
		System.out.println("sreekanth");
		return "sree";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CompleteMethods cm=new CompleteMethods();
		
		cm.m1();
		cm.m2(10, 5);
		cm.m3(20, 30);
		cm.m4();
		
		
		
		
		
		
	}

}
