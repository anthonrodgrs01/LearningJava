package string;

public class AnagramOfAnString2 {

	public static void main(String[] args) {
		String a = "cat";
		String b = "act";
		boolean anagram = false;
		int[] alphaA = new int[256];
		int[] alphaB = new int[256];
		for(char c : a.toCharArray()) {
			int index = (int) c;
			alphaA[index]++; 
		}
		for(char c : b.toCharArray()) {
			int index = (int) c;
			alphaB[index]++; 
		}
		
		for (int i = 0; i < 256; i++) {
			if(alphaA[i] == alphaB[i]) {
				anagram = true;
			}else {
				break;
			}
		}
		
		if(anagram) {
			System.out.println("The String is an Anagram");
		}else {
			System.out.println("The String is not an Anagram");
		}
		
			
	}

}
