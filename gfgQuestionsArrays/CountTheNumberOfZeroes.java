package gfgQuestionsArrays;

import java.util.Scanner;

public class CountTheNumberOfZeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == 0) {
				count++;
			}
		}
		System.out.println(count);

	}

}
