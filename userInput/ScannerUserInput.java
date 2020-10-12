package userInput;

import java.util.Scanner;

public class ScannerUserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	
//		 //taking integer input
//			System.out.println("Enter the number"); 
//			int x =sc.nextInt(); 
//		  System.out.println(x);
//		 
//		  //taking double input
//		  System.out.println("Enter the double number");
//		  double y= sc.nextDouble();
//		  System.out.println(y);
//		 
//
//		// taking String input
//		sc.nextLine();
//		String hello = sc.nextLine();
//		System.out.println(hello);
//		
		//Program for calculating simple Interest
		
		
		 
		 int principal = sc.nextInt();
		 float rate = sc.nextFloat();
		 int time = sc.nextInt();
		 
		 float simpleInterest = (principal * rate * time)/100;
		 
		 System.out.println("The simple interest is " + simpleInterest);
	}

}
