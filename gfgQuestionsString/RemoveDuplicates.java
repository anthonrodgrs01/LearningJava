package gfgQuestionsString;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String S = "geeksforGeeks";
		boolean[] visited = new boolean[256];
		String outS="";
		for (int i = 0; i < S.length(); i++) {
			if(!visited[Character.toLowerCase(S.charAt(i))]) {
				outS +=S.charAt(i);
				visited[S.charAt(i)]=true;
			}
		}
		System.out.println(outS);
	}

}
