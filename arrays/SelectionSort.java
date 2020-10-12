package arrays;

public class SelectionSort {

	

	public static void main(String[] args) {
		int[] a = {7,8,9,5,1,3,2};
		
		for (int i = 0; i < a.length-1; i++) {
			int minIndex = i;
			for (int j = i; j < a.length; j++) {
				
				if(a[j]<a[minIndex]) {
					minIndex = j;
				}
				}
			int temp= a[i];
			a[i] = a[minIndex];
			a[minIndex] = temp; 
			
			
		}
		for (int item : a) {
			System.out.println(item + " ");
		}
		

	}

}
