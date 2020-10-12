package loops;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		int n,first=0,second=1, temp=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many number of terms to be"
				+ " displayed of the fibonacci series");
		n = sc.nextInt();
		if(n==1) {
			System.out.println("Fibonacci series = "+ first);
		}
		else if(n==2) {
			System.out.println("Fibonacci series = " + (first) + (second));
			}
		else if(n>2) {
			System.out.print("Fibonacci series = " + (first)+" "+ (second)+" ");
			for(int i=3;i<=n;i++) {
				temp = second;
				second = temp + first;
				first = temp;
				System.out.print(second +" " );
				sc.close(); 
			}
		}

	}

}
