package eclipsepracticepackage.java;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		
		
		
		//this is hashmap and in this we use two wraper class like ex:-(integer,string)
		//for the integer key value we will assign the string 
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(101, "sree");
		map.put(102, "kanth");
		map.put(103, "pamulu");
		map.put(104, "DMM");
	
		//we are printing the string value is assigned  to the key value 
		System.out.println(map.get(101));
		System.out.println(map.get(102));
		System.out.println(map.get(103));
		System.out.println(map.get(104));

	}

}
