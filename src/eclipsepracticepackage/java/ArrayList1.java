package eclipsepracticepackage.java;

import java.util.ArrayList;

public class ArrayList1 {
	
	//here we are using the arraylist to get the values 
	public static void main(String[] args) {

		//we have created the object for the array list we need to give the wrapper class in the <> inside the brackets
		//class name should not be same as the object created
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		//by using the object reference we are adding the values 
		array.add(5);
		array.add(6);
		array.add(8);
		
		//by using the for loop we can get the output of the all the values 
		for (Integer temp:array) {
			System.out.println(temp);
		}
		System.out.println(array.get(0));
		System.out.println(array.get(1));
	
	}

}
