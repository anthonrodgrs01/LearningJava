package loops;

import java.util.Scanner;

public class Pattern8Part2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = sc.nextInt();
		int rows = ((2*n)-1);
		for(int i=1;i<=rows;i++) {
			if (i<=n) {
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
			}else {
				for(int z=1;z<=rows-i+1;z++) {
				System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
