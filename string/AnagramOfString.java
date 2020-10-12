package string;

public class AnagramOfString {

	public static void main(String[] args) {
		String a , b;
		a = "aab";
		b = "aba";
		boolean visited[] = new boolean[b.length()];
		boolean flag=false;
		if(a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				flag = false;
				for (int j = 0; j < b.length(); j++) {
					if(a.charAt(i) == b.charAt(j) && !visited[j]) {
						visited[j] = true;
						flag = true;	
					break;   
					}
				}
				if(!flag) {
					break;
				}
			}
			
			
			if (flag) {
				System.out.println("The string is an Anagram");
				
			}else {
				System.out.println("The string is not an Anagram");
			}
		}else {
			System.out.println("The String is not an Anagram");
		}

	}

}
