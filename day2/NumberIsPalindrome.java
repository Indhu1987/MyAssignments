package week1.day2;

public class NumberIsPalindrome {

	public static void main(String[] args) {
		int num= 121;
		//int num=12345;
		int r;
		int temp=num;
		int sum=0;
		
		
		while(num >0)
		{
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			}
		
if (temp==sum)
{
	System.out.println(temp +" Number is Palindrome " );
}else
{
	System.out.println(temp +" Number is not Palindrome");
}
	}

}
