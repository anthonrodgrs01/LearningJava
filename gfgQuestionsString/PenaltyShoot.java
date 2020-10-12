package gfgQuestionsString;

import java.util.Scanner;

public class PenaltyShoot {

	public static void main(String[] args) {
		int goal;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			goal = 0;
			String inst = sc.nextLine();
			for (int j = 0; j < inst.length(); j++) {
					if(j == (inst.length() - 1)) {
						break;
					}
					if(inst.charAt(j) == '2' && inst.charAt(j+1) == '1') {
						goal++;
					}
				}
			System.out.println(goal);
		}

	}

}
