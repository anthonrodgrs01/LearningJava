package oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		//Runtime Polymorphism
		System.out.println("Runtime Polymorphism");
		Dog d = new Dog();
		Pet p = d;
		Animal a = d ;
		d.walk();
		p.walk(); 

	}

}
