package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		//AND logical operator
		int number = 145;
		if((number >= 0) &&  (number <=100)) {
			System.out.println("Number is in the range");
		}else {
			System.out.println("Number is not in the range");
		}
		
		//OR logical operator
		int grade = 11;
		if((grade == 10) || (grade == 12)) {
			System.out.println("You can give boards");
		}else{
			System.out.println("You cannot give boards");
		}
		
		//NOT logical operator
		boolean criminal = true;
		if(!(criminal)) {
			System.out.println("You can make your passport");
		}else {
			System.out.println("You cannot make your passport");
		}
		
		 

	}

}
