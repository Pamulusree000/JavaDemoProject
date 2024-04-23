package com.eclipsepracticepackage.array;

public class ArrayFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a= {10,20,30};
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		/*for (int i=a.length;i>=0;i--)
		{
			System.out.println(a[i]);
		}
		*/
		
		int [] data= {11,22,33,44};
		
		
		int sum=0;
		
		for (int i=0; i<data.length;i++)
		{
			sum =sum+data[i];
			
		}
		
		
		System.out.println("sum: "+sum);
		System.out.println("average: "+sum/data.length);
		
		
		
		
		
		
		
		
	}

}
