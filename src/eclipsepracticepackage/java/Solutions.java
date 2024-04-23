package eclipsepracticepackage.java;

import java.util.Scanner;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		Problem pb=new Problem();
	
		
		for (int i=1;i<=4;i++)
		{
			System.out.println("enter number:");
			
			int num =sc.nextInt();
			
			pb.checkevenorodd(num);
			
		}
		
		
		
		
		sc.close();
		
		
		
		
	}

}
