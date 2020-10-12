package string;

public class ReverseWordsOfString {

	public static void main(String[] args) {
		String a = "I am Anthon Rodrigues";
		int count=0;
		String[] store = new String[a.length()];
		for (int i = 0; i < a.length(); i++) {
			store[i]="";
			if(a.charAt(i) == ' ') {
				count++;
				continue;
				
			}
			store[count]+=a.charAt(i);
			
		}
		
		for (int i = count; i >= 0; i--) {
			System.out.print(store[i] + " ");
		}
	}

}
