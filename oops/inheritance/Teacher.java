package oops.inheritance;

public class Teacher extends Person {
	
	Teacher(){
		super();
		System.out.println("Inside Teacher class Constructor");
	}

	public void teach() {
		System.out.println(name + " can teach");
	}
	public static void laughing() {
		System.out.println("Teacher is laughing");
	}

	

}
