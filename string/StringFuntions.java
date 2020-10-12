package string;

public class StringFuntions {
	public static void main(String[] args) {
		String got = "KingSlayer";
		//charAt(int index) function
		System.out.println(got.charAt(2));
		//length()
		System.out.println(got.length());
		//substring(int beginIndex), substring(int beginIndex,int endIndex)
		System.out.println(got.substring(4));
		System.out.println(got.substring(3,8));
		//contain(charSequence s)
		System.out.println(got.contains("King"));
		//split()
		String names = "Jon Snow Lucifer Tirion Chloe Jonas Dan";
		String allNames[] = names.split(" ");
		for(String n: allNames) {
			System.out.println(n + " ");
		}
		//indexOf(char s)
		System.out.println(got.indexOf('K'));
		//toLowerCase()
		System.out.println(got.toLowerCase());
		//toUpperCase()
		System.out.println(got.toUpperCase());
		//trim()
		System.out.println(names.trim());
		
		
	}

}
