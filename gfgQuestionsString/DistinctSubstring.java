package gfgQuestionsString;

import java.util.Scanner;

public class DistinctSubstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dis;
		int t = sc.nextInt();
		
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			boolean[] founded = new boolean[127];
			dis = 0;
			String dcheck = sc.nextLine();
			for (int j = 0; j < dcheck.length(); j++) {
				if(founded[(int)dcheck.charAt(j)]) {
					dis++;
				}else {
					founded[(int)dcheck.charAt(j)] = true;
				}
			}
			System.out.println(dis);
		}
		

	}

}
