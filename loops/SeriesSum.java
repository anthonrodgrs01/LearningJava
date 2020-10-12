package loops;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n to find the sum");
		int n = sc.nextInt();
		if(n>=0) {
		float sum=0;
		for(int i =1; i<=n;i++) {
			if((i%2)==0) {
			sum = sum - (1/(float)i);
			}else sum = sum + (1/(float)i);
			}
			System.out.println(sum);
		}else { System.out.println("Invalid input");} 
	}

}
