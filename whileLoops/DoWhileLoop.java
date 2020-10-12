package whileLoops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n; 
		 do {
			 System.out.println("Enter the value of n");
			 n = sc.nextInt();
		 }while(n!=0);
		 System.out.println("Loop ended");

	}

}
