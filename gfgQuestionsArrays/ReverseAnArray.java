package gfgQuestionsArrays;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int s = sc.nextInt();
			int[] arr = new int[s];
			int[] rev = new int[s];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				rev[s-j-1] = arr[j];
			}
			for (int ele:rev) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}

	}

}
