package gfgQuestionsArrays;

import java.util.Scanner;

public class SumOfTripletIsZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int count = 0;
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
				
			}
			
			for (int j = 0; j < (n - 2); j++) {
				int sum = 0;
				sum = arr[j] + arr[j+1] + arr[j+2];
				if(sum == 0) {
					count = count + 1;
				}
				
			}
			System.out.println(count);
		}

	}

}
