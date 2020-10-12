package gfgQuestionsString;

import java.util.Scanner;

public class CountingNumberOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		int t = sc.nextInt();
		String[] s = new String[t];
		sc.nextLine();
		for (int i = 0; i < s.length; i++) {
			count = 1;
			s[i] = sc.nextLine();
			for (int j = 0; j < s[i].length(); j++) {
				boolean alpha = Character.isUpperCase(s[i].charAt(j));
				if(alpha) {
					count++;
				}
			}
			System.out.println(count);
		}
		

	}

}
