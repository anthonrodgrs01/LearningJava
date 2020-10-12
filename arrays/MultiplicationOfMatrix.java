package arrays;

import java.util.Scanner;

public class MultiplicationOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows A");
		int rows1 = sc.nextInt();
		System.out.println("Enter the number of columns A");
		int cols1 = sc.nextInt();
		System.out.println("Enter the number of rows B");
		int rows2 = sc.nextInt();
		System.out.println("Enter the number of columns B");
		int cols2 = sc.nextInt();
		if(cols1 == rows2) {
			int[][] a = new int[rows1][cols1];
			int[][] b = new int[rows2][cols2];
			int[][] c = new int[rows1][cols2];
			
			System.out.println("Enter the matrix A");
			for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < cols1; j++) {
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter the matrix B");
			for (int i = 0; i < rows2; i++) {
				for (int j = 0; j < cols2; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < cols2; j++) {
					for (int j2 = 0; j2 < cols2; j2++) {
						
					
					c[i][j] += a[i][j2]*b[j2][j];
					}
					}
			}
			System.out.println("Matrix A");
			for (int i = 0; i < rows1; i++) {
				for (int j = 0; j < cols1; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Matrix B");
			for (int i = 0; i < rows2; i++) {
				for (int j = 0; j < cols2; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Matrix C");	
			for (int i = 0; i < rows1; i++) {
					for (int j = 0; j < cols2; j++) {
						System.out.print(c[i][j] + " ");
					}
					System.out.println();
				}
		}else {
			System.out.println("Invalid");
			System.out.println("For array multiplication, "
					+ "Columns of Matrix A should be equal to rows of matrix B");
		}
		
	}

}
