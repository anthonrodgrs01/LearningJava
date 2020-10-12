package nestedForLoopsAssignment1;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int temp=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			System.out.print(i + " ");
			if(i>=2) {
				for(int j=1;j<=temp;j++) {
					System.out.print("0 ");
				}
				temp +=2;
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
