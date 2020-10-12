package arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		 System.out.println("Enter 10 numbers");
		 Scanner sc = new Scanner(System.in);
		 int[] a = new int[10];
		 System.out.println("Enter the entries");
		 for (int i = 0; i < a.length; i++) {
		
			a[i]= sc.nextInt();
		}
		 for (int i = 0; i < a.length; i++) {
			 boolean flag = true;
			for (int j = 0; j < a.length-1-i; j++) {
				if(a[j+1]<a[j]) {
					flag = false;
					int temp = a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
				
			}
			if(flag) {
				break;
			}
		}
		 for(int item : a) {
			 System.out.println(item +" ");
		 }

	}

}
