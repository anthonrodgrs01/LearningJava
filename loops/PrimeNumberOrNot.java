package loops;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number to check");
		 int n = sc.nextInt();
		 if(n==2) {
			 System.out.println("It is a Prime number");
		 }else {
			 int flag=1;
			 for(int i =2; i*i<= n;i++) {
				 if((n%i)==0) {
					 flag = 1;
					 break;
				 }else {
					flag =0; 
				 }
				}
			 if(flag==0) {
				 System.out.println("It is a Prime Number");
			 }else {
				 System.out.println("It is not a Prime Number");
			 }

		 }
		 		 sc.close();

	}

}
