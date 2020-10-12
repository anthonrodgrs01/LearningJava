package conditionalStatements;

public class SwitchCaseStatements {

	public static void main(String[] args) {
//		int dayOfWeek = 4;
//		
//		switch(dayOfWeek) {
//		case 1: System.out.println("Monday");
//		  		break;
//		
//		case 2: System.out.println("Tuesday");
//  		break;
//
//		case 3: System.out.println("Wednesday");
//  		break;
//
//		case 4: System.out.println("Thursday");
//  		break;
//
//		case 5: System.out.println("Friday");
//  		break;
//
//		case 6: System.out.println("Saturday");
//  		break;
//
//		case 7: System.out.println("Sunday");
//  		break;
//  		
//  		default: System.out.println("Enter number in the range 1-7");
//  		 		 break;
//  			
//
//		}

		//Combining 2 cases
		int rating = 3;
		
		switch(rating) {
		
		case 1: case 2: System.out.println("Bad review");
		 				break;
		 
		case 3:
			System.out.println("Average review");
			break;
			
		case 4: case 5:
			System.out.println("Good review");
			break;
			
		default:
			System.out.println("Please give review from 1 - 5");
			break;
			
		}
	}

}
