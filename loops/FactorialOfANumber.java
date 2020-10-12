package loops;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		int fact =1 ,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to find its Factorial");
		n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			fact = fact *(n-i);
		}
		System.out.println("Factorial of " + n + " = " + fact);
		sc.close();
		
		

	}

}
