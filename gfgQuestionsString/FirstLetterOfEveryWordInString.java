package gfgQuestionsString;

public class FirstLetterOfEveryWordInString {

	public static void main(String[] args) {
		String sentence = "bad is good";
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.print(words[i].charAt(0));
		}
	}

}
