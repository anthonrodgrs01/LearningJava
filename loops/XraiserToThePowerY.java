package loops;

import java.util.Scanner;

public class XraiserToThePowerY {

	public static void main(String[] args) {
		float x , y;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of X");
		x = sc.nextInt();
		
		System.out.println("Enter the value of Y");
		y = sc.nextInt();

		if(y>=0) {
	    float sq=1;
		for(int i=0;i<y;i++) {
				sq = sq*x;
			}
		System.out.println(sq);
		}
		else if(y<0) {
		float sq=1,nsq=1;
		for(int i=(int)y;i<0;i++) {
			sq = sq*x;
			}
		nsq = 1/sq;
		System.out.println(nsq);
		}
		sc.close();
		


	}

}
