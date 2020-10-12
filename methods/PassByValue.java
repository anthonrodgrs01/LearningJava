package methods;

public class PassByValue {

	public static void main(String[] args) {
		int c =34;
		int d = 12;
		swap(c,d);
		System.out.println(c + " " + d );
		
		Dog s = new Dog();
		Dog t = new Dog();
		s.legs = 4;
		t.legs = 3;
		swap(s,t);
		System.out.println(s.legs + " " + t.legs);
		Dog a = new Dog();
		a.legs = 4;
		changeDog(a);
		System.out.println(a.legs);
	}
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	static void swap(Dog a,Dog b) {
		Dog temp =a;
		a =b;
		b = temp;
	}
	static void changeDog(Dog dog) {
		dog.legs = 6;
	}

}

class Dog{
	int legs;
	
	
}
