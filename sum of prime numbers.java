import java.util.*;
public class coding  {
	
	public static void main(String [] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the start and end range\n");
			int num1 = sc.nextInt();//1
			int num2 = sc.nextInt();//100
			
			int sum = 0;
			
			for(int i=num1; i<=num2; i++) {
				
				int n = 1;
				int temp = 0;
				int a = 2;
				
				while(a<=(n/2)) {
					if((n%a) == 0) {
						temp++;
						break; 
					}
			        a++;		
				}
				if(temp == 0 && i !=1) {
					sum = sum + i;
				}
				
			}
			System.out.println("The sum of all prime number is: "+sum);
		}			
		}
	}
			


