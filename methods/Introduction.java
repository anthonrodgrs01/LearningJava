package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		int result = maxOf(firstNumber , secondNumber);
		System.out.println(maxOf(2,4));
	}
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
		 
	}
	
	static int maxOf(float a,int b) {
		return 0;  
	}
	
	static void sayHi() {
		System.out.println("Hi");
		System.out.println("Good morning");
	}

}
