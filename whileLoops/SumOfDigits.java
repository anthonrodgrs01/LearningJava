package whileLoops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp;
		if(num < 0) temp = -num;
		else temp = num;
		int sum = 0;
		while(temp>0) {
			sum = sum + (temp%10);
			temp = temp/10;
		}
		System.out.println("Sum of Digits of " + num + " = " + sum);
		int numberOfDigits = (int)Math.log10(num) + 1 ;
		System.out.println(numberOfDigits);

	}

}
