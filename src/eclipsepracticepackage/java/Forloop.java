package eclipsepracticepackage.java;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print upto 100 numbers
		for(int i=1;i<=100;i++) 
		{
			System.out.println(i);
			
		}
		
		//print only even numbers
		for(int i=2;i<=20;i+=2) 
		{
			System.out.println(i);
		}
		
		//print 1 to 5 except 4
		for(int i=1;i<=5;i++)   //(initialization/condition/increment or decrement)
		{
			if(i!=4) {
				System.out.println(i);
			}
			//print reverse from 1 to 10 except 4&7 and if you give break at the end of the loop it will stop
			for (i=10;i>=1;i--) {
				
				if((i!=4)&&(i!=7)) {
					System.out.println(i);
			}
				
			}
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
