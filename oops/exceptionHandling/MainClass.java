package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		try {
			 
		int a = 5;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " occured, Please Check");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index should be in the range of 0 to size of array");
			
		} catch(IllegalArgumentException e) {
			System.out.println("Check your casting carefully");
			
		}finally {
			System.out.println("Sorry for the inconvience");
		}
		
		System.out.println("Very important code");
		System.out.println("need to run");
		
		fun1();
	}
	static void fun1() {
		int a = 5;
		int b = 3;
		
		int c = a/b;
		System.out.println(c);
		try {
			
			fun2();
			
			
		}catch(Exception e){
			System.out.println(e.getMessage() + " occured");
		}
	}
	static void fun2() throws Exception {
		boolean isDanger = true;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException("Danger was coming");
		}
	}

}
