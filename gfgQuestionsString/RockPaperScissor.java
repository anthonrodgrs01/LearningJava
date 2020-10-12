package gfgQuestionsString;

import java.util.Scanner;

public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		String[] rps = new String[testCases];
		sc.nextLine();
		for (int i = 0; i < rps.length; i++) {
			rps[i] = sc.nextLine();
			char a = rps[i].charAt(0);
			char b = rps[i].charAt(1);
			if(a == b) {
				System.out.println("DRAW");
			}else if((a == 'R' && b == 'P')||(a == 'P' && b == 'S')||(a == 'S' && b == 'R')) {
				System.out.println("B");
			}else if((a == 'R' && b == 'S')||(a == 'P' && b == 'R')||(a == 'S' && b == 'P')) {
				System.out.println("A");
			}
		}
	}

}
