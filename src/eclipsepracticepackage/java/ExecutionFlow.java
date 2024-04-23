package eclipsepracticepackage.java;

public class ExecutionFlow {

	public static void main(String[] args) {
		
		System.out.println(staticMethod("Sreekant"));
		
		ExecutionFlow ef=new ExecutionFlow();
		
		ef.nonStaticMethod();

	}
	
	{
		System.out.println("This is non-static Block");
	}
	
	static {
		System.out.println("This is static block");
	}
	
	public static String staticMethod(String a) {
		System.out.println("This is static method");
		return a;
	}
	
	public void nonStaticMethod() {
		System.out.println("This is non static method");
	}

}
