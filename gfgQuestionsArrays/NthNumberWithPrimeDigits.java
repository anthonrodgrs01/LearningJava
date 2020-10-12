package gfgQuestionsArrays;

import java.util.Scanner;

public class NthNumberWithPrimeDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] compare = { 2, 3, 5, 7 };
		for (int i = 0; i < t; i++) {
			int num = sc.nextInt();
			int count = 0;
			for (int k = 2; ; k++) {

				boolean inSequence = true;
				int temp = k;
				while (temp > 0) {
					boolean isPrime = false;
					int checker = temp % 10;
					for (int j = 0; j < compare.length; j++) {
						if (checker == compare[j]) {
							isPrime = true;
						}
					}
					if (!isPrime) {
						inSequence = false;
						break;

					}

					temp = temp / 10;

				}
				if (inSequence) {
					count++;
				}
				if (count == num) {
					System.out.println(k);
					break;
				}

			}

		}

	}

}
