package gfgQuestionsArrays;

import java.util.Scanner;

public class MinimumSubsetsWithConsecutiveNumbers {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int count =1;
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			for (int j = 0; j < arr.length; j++) {
				int min = j;
				for (int j2 = j; j2 < arr.length; j2++) {
					if(arr[min] > arr[j2]) {
						min = j2;
					}
				}
				int temp = arr[j];
				arr[j] = arr[min];
				arr[min] = temp;
			}
		
			
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j+1] != (arr[j]+1)) {
					count++;
				}
			}
			
			
			System.out.println(count);
		}
		

	}

}
