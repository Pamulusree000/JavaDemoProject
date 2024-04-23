package com.javapractice.java;

public class SwitchPractice {

	public static void main(String[] args) {
		
		int day=23;
		
		switch (day%7) {
		case 1:

			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 0:
			System.out.println("Sunday");
			break;

		default:
			
			break;
		}

	}

}
