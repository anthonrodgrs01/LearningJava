package nestedForLoopsAssignment1;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int num1,num2;
		for(int i =1;i<=n;i++) {
			num1=10-i+1;
			num2=9;
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i-1;j++) {
				System.out.print((num1++) + " ");
			}
			System.out.print("0 ");
			for(int j=1;j<=i-1;j++) {
				System.out.print((num2--)+ " ");
			}
			System.out.println();
		}

	}

}
