package oops;

class Vehicle{
	
	int wheels;
	int headlights;
	String color;
	Vehicle() {
		wheels = 4; 
		headlights = 2;
	}
	Vehicle(int wheels){ 
		this.wheels = wheels;
		headlights =2;
	}
	Vehicle(int wheels,String color){
		this.wheels = wheels;
		this.color = color;
		this.headlights = 2;
	}
}
public class MyConstructor {

	MyConstructor() {
		System.out.println("object is now created");
	}
	
	public static void main(String[] args) {
		MyConstructor obj = new MyConstructor();
		Vehicle car = new Vehicle();
		System.out.println(car.wheels + " wheels ");
		Vehicle scooty = new Vehicle(2);
		System.out.println(scooty.wheels + " wheels");
		Vehicle eRickshaw = new Vehicle(3,"Yellow");
		System.out.println(eRickshaw.wheels + " wheels " + eRickshaw.color + " Color");
		 
	}

}
