package arrays;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		System.out.println("Enter first matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Your first matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println(); 
		}
		System.out.println("Your second Matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println(); 
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j]+b[i][j];
			}
		}
		System.out.println("Addition of A and B");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println(); 
		}

	}

}
