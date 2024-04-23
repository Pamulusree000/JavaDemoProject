package eclipsepracticepackage.java;

import java.util.HashSet;

public class Hashset1 {
	
	public static void main(String args[])
	{
		
		//this is hashset in this we can add the values 
		HashSet<String> hash=new HashSet<String>();
		
		hash.add("my name");
		hash.add("is sreekanth");
		hash.add("I am from ");
		hash.add("Dharmavarm");
		
		//for print the values we cannot use the get method here by using for loop or for each loop we can print the values
		//this is for the string values
		for (String temp:hash) {
			
			System.out.println(temp);
		}
		
		//this is for the interger values
		HashSet<Integer> hash1=new HashSet<Integer>();
		
		hash1.add(10);
		hash1.add(15);
		hash1.add(20);
		
		for(Integer temp:hash1)
		{
			System.out.println(temp);
		}
		
		
	}
	

}
