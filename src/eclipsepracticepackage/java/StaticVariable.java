package eclipsepracticepackage.java;

public class StaticVariable {

	static int age=10;
	
	static void male()
	{
		System.out.println("age is just number " +age);
	}
	
	//for static  variable Or static methods we can call by using classname.variable or classname.method in the main class

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(age);
		
		StaticVariable.male();
		
		
		
	}

}
