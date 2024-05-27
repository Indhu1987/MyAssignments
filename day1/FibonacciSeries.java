package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num=8;
		int a=0;
		int b=1;
		for(int i=1;i<=num;i++) {
			System.out.print(a +",");
			int sum=a+b;
			a=b;
			b=sum;
			
		}

	}

}
