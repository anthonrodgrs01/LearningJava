package gfgQuestionsString;

import java.util.Scanner;

public class CountCamelCaseLetters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count;
		sc.nextLine();
		for(int i =0;i<t;i++) {
			count = 0;
			String camel = sc.nextLine();
			for (int j = 0; j < camel.length(); j++) {
				if(Character.isUpperCase(camel.charAt(j))) {
					count++;
				}
				
			}
			System.out.println(count);
		}

	}

}
