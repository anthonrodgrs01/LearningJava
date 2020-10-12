package conditionalStatements;

import java.util.Scanner;

public class ElseIfClass {

	public static void main(String[] args) {
		int number = 34;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number = sc.nextInt();
		if(number <= 10) {
			System.out.println("Number is less than 10");
		}else if(number > 10 && number <= 20) {
			System.out.println("Number is greater than 10 and less than 20");
		}else if(number > 20 && number <= 30) {
			System.out.println("Number is greater than 20 and less than 30");
		}else {
			System.out.println("Number is greater than 30");
		}
		
		boolean word = number<20 ? true : false;
		System.out.println(word);
	}

}
