package eclipsepracticepackage.java;

public class MethodOverloading {

	
	int a=10;
	int b=15;
	int c=20;
	int d=30;
	double m= 20.5;
	String s="morning";
	
	void Display(int a,int b)
	{
		System.out.println(a+b);
		System.out.println(a*b);
	}
	void Display(int c,int d,int a)
	{
		System.out.println((c+d) +" " +(d+a));
		System.out.println((a*c) +" " +(d*c));
	}
	void Display(double m,int c)
	{
		System.out.println(m*c);
		System.out.println((m-c) +" "+(m+c));
	}
	void Display (String s)
	{
		System.out.println(s);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MethodOverloading mo=new MethodOverloading();
		
		mo.Display(mo.a, mo.b);
		mo.Display(mo.c, mo.a, mo.d);
		mo.Display(mo.m, mo.c);
		mo.Display(mo.s);
		
	
	}

}
