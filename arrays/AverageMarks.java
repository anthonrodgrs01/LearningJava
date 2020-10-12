package arrays;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		int[] marks = new int[n];
		int average,sum=0;
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Enter the marks of Student " + (i+1));
			marks[i]=sc.nextInt();
			sum+=marks[i];
		}
		average = sum/(marks.length);
		System.out.println("Marks scored by student");
		for (int i = 0; i < marks.length; i++) {
			System.out.println("Marks scored by : "+(i+1)+" = "+marks[i]);
			}
		System.out.println("Average marks =" + average);
	}

}
