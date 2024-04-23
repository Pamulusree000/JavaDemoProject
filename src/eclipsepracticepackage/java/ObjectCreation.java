package eclipsepracticepackage.java;

public class ObjectCreation {
	
	//these are non static variables        (if you want access the non static variables you need to create object with the class name )
	   int age =20;
	   String name="sai";


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if you don't create object with the class name you cannot access the non static variables
		ObjectCreation obj=new ObjectCreation();  //object creation
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		System.out.println("age"+obj.age);
		System.out.println("name"+obj.name);
	
	}

}
