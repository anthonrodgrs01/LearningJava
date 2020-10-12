package HackerRankArrayList;

import java.io.*;
import java.util.*;

public class FindNumberGivenPos {

	public static void main(String[] args) {
		try {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			ArrayList<Integer>[] arr = new ArrayList[n+1];
			for (int i = 1; i <= n; i++) {
				int d = sc.nextInt();
				arr[i] = new ArrayList<Integer>();
				for (int j = 1; j <= d; j++) {
					int val = sc.nextInt();
					
					arr[i].add(val);
				}
			}
			int q = sc.nextInt();
			for (int i = 1; i <= q; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				int result = arr[x].get(y - 1);
				System.out.println(result);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage() + " Error ");
		}

	}

}
