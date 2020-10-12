package codeChef.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Sticks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int j = 0; j < arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			Arrays.sort(arr);
			int setter = 1;
			int count = 0;
			int size = n - 1;
			while(setter > 0) {
				setter = size - 1;
				if(arr[setter] == arr[size]) {
					setter--;
				}else{
					count++;
					size = setter;
				}
			}
			System.out.println(count);
		}
		

	}

}
