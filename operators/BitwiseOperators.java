package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		
		int a=10;
		int b=13;
		
		//AND bitwise operation
		int c= a & b;
		System.out.println(c);
		
		//OR bitwise operation
		c = a | b;
		System.out.println(c);
		
		//Right shift bitwise operation
		//(the value x 1/2)
		c = b >> 1;
		System.out.println(c);
		
		//Left shift bitwise operation
		//(the value x 2)
		c= b<< 1;
		System.out.println(c);
		
		
		
		

	}

}
