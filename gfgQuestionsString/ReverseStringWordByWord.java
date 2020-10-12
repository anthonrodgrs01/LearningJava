package gfgQuestionsString;

import java.util.Scanner;

public class ReverseStringWordByWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String gWord = sc.nextLine();
		gWord.trim();
		
		String[] words = new String[gWord.length()];
		int count =0;
		for (int i = 0; i < words.length; i++) {
			words[i] = "";
		}
		for (int i = 0; i < gWord.length(); i++) {
			
			words[count] += gWord.charAt(i);
			if(gWord.charAt(i) == ' ') {
				count++;
			}
			
		}
		for (int i = count; i >=0 ; i--) {
			System.out.print(words[i]+" ");
		}

	}

}
