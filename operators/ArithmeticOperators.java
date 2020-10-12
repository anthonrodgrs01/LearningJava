package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		int a = 23;
		int b = 45;
		
		
		 //addition 
		int c = a+b;
		System.out.println(c);
		 
		//substraction
		c = a-b;
		System.out.println(c);
		
		//multiplication
		c = a*b;
		System.out.println(c);
		
		//division
		c= a/b;
		System.out.println(c);
		
		//(a+b) whole square
		c = (a*a)+(b*b)+(2*a*b);
		System.out.println(c);
		c=(a+b)*(a+b);
		System.out.println(c);
		
		System.out.println((a++)+" "+(++b));

	}

}
