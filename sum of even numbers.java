

public class Code {
	
	public static void main(String[] args)  {
		
		int sum = 0;
		
		for(int i=1;i<=10000;i++)  {
			
			if(i%2==0)  {
				sum = sum + i;
			}
			
		}
		System.out.println("Sum of all the even numbers from 1 to 10000 is:"+sum);
		
	}
			

}
