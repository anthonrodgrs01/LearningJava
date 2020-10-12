package whileLoops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int num = sc.nextInt();
		int rev=0,num1=num;
		while(num>0) {
			rev = rev *10;
			rev += (num%10);
			num /= 10;
		}
		if(rev == num1) {
			System.out.println("It is a Palindrome");
		}else System.out.println("It is not a Palindrome");

	}

}
