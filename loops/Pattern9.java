package loops;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		for(int i =1;i<=n;i++) {
			if(i>1 && i<n) {
			System.out.print("* ");
			for(int j=1;j<=i-2;j++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			}else{
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
					}
		}
			
			System.out.println();
		}
		
	}

}
