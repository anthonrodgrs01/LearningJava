package loops;

public class ForLoops {

	public static void main(String[] args) {
		
		for(int i =0; i<100; i++) {
			System.out.println(i + ". HELLO WORLD....ANTHON");
		}
		
		//taking sum of n natural number
		int sum =0,n=5;
		for(int i =0; i<n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//table of 4
		int tableOf = 69 ;
		System.out.println("Table of " + tableOf + "\n");
		for (int i = 1; i<=10;i++) {
			System.out.println(tableOf + " * " + i + " = " + tableOf*i );
		}
		 

	}

}
