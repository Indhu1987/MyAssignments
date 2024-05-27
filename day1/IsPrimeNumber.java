package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		boolean flag=false;
		int n=19;
		for(int i=2;i<=n/2;i++){
			
			if(n%i==0) {
					System.out.println("the number is not prime");
					flag=true;
					break;
			}
		}
		if(!flag)
					System.out.println("the number is  prime");
					
					}		
			}
		
			

		
		
		

	


