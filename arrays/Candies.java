package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Candies {

	public static void main(String[] args) {
		int[] arr = {5,4,1,8,9,9,9,1,2};
		int n = arr.length;
		int[] dist = new int[n];
		
		
		Arrays.fill(dist,1);
		for (int i = 1; i < dist.length; i++) {
			if(arr[i]>arr[i-1]) {
				dist[i] = dist[i-1] + 1;
			}
		}
		for (int i = n-2; i >=0; i--) {
			
			if(arr[i]>arr[i+1]) {
				dist[i] = Math.max(dist[i+1] + 1, dist[i]);
			}
		}
		for (int i = 0; i < dist.length; i++) {
			System.out.print(dist[i] + " ");
		}
		
		long sum = 0;
		for(int i =0;i<n;i++) {
			sum = sum + (long)dist[i]; 
		}
		System.out.println(sum);
		
		
		
		
	}

}
