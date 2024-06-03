package week1.day2;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		int [] num= {1, 4,3,2,8, 6, 7};
		int sum1= 0; int sum2 =0;

		for (int i = 1; i <=8; i++) {

			sum1= sum1+i;
	}
		System.out.println(sum1);
		for (int i = 0; i < num.length; i++) {

			sum2= sum2+num[i];
	}
		System.out.println(sum2);
		int sum = sum1-sum2;

		System.out.println("the missing number is: " + sum);
}
}

		
		
	


