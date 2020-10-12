package gfgQuestionsArrays;

import java.util.Scanner;

public class NthPrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int count = 0;
			int num=2;
			while(true) {
				boolean isPrime = true;
				int numCheck = 1 +(int) Math.sqrt(num);
				for (int j = 2; j < num ; j++) {
					if(num%j == 0) {
						isPrime = false;
					}
				}
				if(isPrime) {
					count++;
				}
				if(count == n) {
					System.out.println(num);
					break;
				}
				num++;
			}
		}
	}
}
