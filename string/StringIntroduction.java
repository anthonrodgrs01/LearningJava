package string;

public class StringIntroduction {

	public static void main(String[] args) {
		String name ="Anthon";
		System.out.println(name);
		String anotherName = new String("Virat kohli");
		System.out.println(anotherName);
		
		//Difference between the two types of intialisation
		
		// By Literals
		String character1 = "KingSlayer";
		//Using new keyword
		String character2 = new String("KingSlayer");
		String character3 = "KingSlayer";
	
		System.out.println(character1 == character2);
		System.out.println(character1 == character3);
		
		
	}

}
