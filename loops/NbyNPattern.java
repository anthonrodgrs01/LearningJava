package loops;

import java.util.Scanner;

public class NbyNPattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(" * ");
			}
			System.out.print("\n");
		}

	}

}
