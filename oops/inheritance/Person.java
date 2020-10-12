package oops.inheritance;

public class Person {
	
	protected String name;
	Person(){
		System.out.println("Inside parent class Constructor");
	}
	
	public void walk() {
		System.out.println(name +" is walking");
	}
	
	public void eat() {
		System.out.println(name +"  is eating");
	}
	public static void laughing() {
		System.out.println("Person is laughing");
	}

}
