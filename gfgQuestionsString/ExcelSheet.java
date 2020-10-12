package gfgQuestionsString;

import java.util.Scanner;

public class ExcelSheet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int num;
		sc.nextLine();
		for (int i = 0; i < t; i++) {
			num=0;
			String col = sc.nextLine();
			int l = col.length();
			for (int j = 0; j < l; j++) {
				num += (col.charAt(j) - 'A' + 1 )*(Math.pow(26, l-j-1));
				
				
			}
			System.out.println(num);
		}

	}

}
