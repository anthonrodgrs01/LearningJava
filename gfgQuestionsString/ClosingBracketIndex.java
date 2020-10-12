package gfgQuestionsString;

public class ClosingBracketIndex {

	public static void main(String[] args) {
		String str = "[ABC[][23]][89]";
		int pos =0;
		int openedBracket = 0;
		for (int i = pos+1; i < str.length(); i++) {
			if(str.charAt(i) == '[') {
				openedBracket++;
			}
			if(str.charAt(i) == ']' && openedBracket != 0) {
				openedBracket--;
				continue;
			}
			if(str.charAt(i) == ']' && openedBracket == 0) {
				System.out.println(i);
				break;
			}
		}

	}

}
