package gfgQuestionsString;

import java.util.Scanner;

public class ConvertingStringToInt {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String confuse;
	int diff;
	int t = sc.nextInt();
	sc.nextLine();
	for (int i = 0; i < t; i++) {
		diff =0;
		confuse = sc.nextLine();
		for (int j = 0; j < confuse.length(); j++) {
			if(confuse.charAt(j)=='6') {
				diff += (3 * (Math.pow(10d,(double)(confuse.length()-j-1))));
			}
		}
		System.out.println(diff);
	}
	
	}

}
