package loops;

import java.util.Scanner;

public class Break {
	public static void main(String[] args) {
//		for(int i=0;i<=100;i++) {
//			System.out.println(i);
//			if(i==35) {
//				System.out.println("Loop ended");
//				break;
//				
//				}
//		}
		
		Scanner sc = new Scanner(System.in);
		int n;
		for (int i = 0; ; i++) {
			System.out.println("Enter the number");
			n = sc.nextInt();
			if( n<0 ) {
				System.out.println("Loop ended");
				break;
			}
		}
		sc.close();
	}

}
