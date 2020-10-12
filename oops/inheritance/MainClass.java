package oops.inheritance;

public class MainClass {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = " Mr.Harry ";
		t.eat();
		t.walk();
		t.teach();
		Singer s = new Singer();
		s.name = "Oprah";
		s.sing();
		s.eat();
		
		//UpCasting or implicit casting
		Singer vilen = new Singer();
		Person p1 = vilen;
		
		//DownCasting
		Teacher Aman = new Teacher();
		Person p2 = Aman;
		Teacher Anuj = (Teacher)p2;
		
		//instanceof
		System.out.println(p2 instanceof Teacher);
		
		//super Keyword 
		Teacher t3 = new Teacher();
		 
	}

}
