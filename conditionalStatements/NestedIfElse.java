package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		//To find the greatest of 3 numbers
		int a=10,b=6,c=5 ,max;
		max = a;
		if((max < b) || (max < c)) {
			max = b;
			if(max < c) {
				max = c;
			}
			}
		System.out.println("The greatest number in the three is " + max);
		}
		

	}


