package gfgQuestionsArrays;

import java.util.Scanner;

public class RotatingArray {

	public static void main(String[] args) {
	/* 
	 Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

	Input:
	The first line of the input contains T denoting the number of testcases. First line of each test case contains two space separated elements, N denoting the size of the array and an integer D denoting the number size of the rotation. Subsequent line will be the N space separated array elements.

	Output:
	For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
0 <= arr[i] <= 105

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
*/
		 Scanner sc = new Scanner(System.in);
		    int t = sc.nextInt();
			for(int i=0;i<t;i++){
			    int n = sc.nextInt();
			    int d = sc.nextInt();
			    int[] arr = new int[n];
			    for(int j=0;j<n;j++){
			        arr[j] = sc.nextInt();
			    }
			    for(int k=0;k<d;k++){
			        int temp = arr[0];
			        
			        for(int y=0;y<n-1;y++){
			            arr[y] = arr[y+1];
			        }
			        arr[n-1]=temp;
			    }
			    for(int z=0;z<n;z++){
			       System.out.print(arr[z] + " ");
			   }
			   System.out.println();
			  
			    }
			   
			}
		}



