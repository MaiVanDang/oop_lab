package test4;
import java.util.Scanner;
public class PrintDate {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int yearInput; 
		int Date;
		String monthInput;
		while(true) {
			System.out.println("Scan year: ");
			yearInput = scanner.nextInt();
			if(yearInput < 0) {
				System.out.println("Invalid year. Please try again!");
				continue;
			}
			
			scanner.nextLine();
			System.out.println("Scan month: ");
			monthInput = scanner.nextLine();
			//check month 
			if (monthInput.equals("January") || monthInput.equals( "Jan.") || monthInput.equals("Jan") || monthInput.equals("1") ||
				monthInput.equals("March")   || monthInput.equals("Mar.") || monthInput.equals("Mar") || monthInput.equals("3") ||
				monthInput.equals("May")    || monthInput.equals("May.") || monthInput.equals("May") || monthInput.equals("5") ||
				monthInput.equals("July")    || monthInput.equals("Jul.") || monthInput.equals("Jul") || monthInput.equals("7") ||
				monthInput.equals("August")  || monthInput.equals("Aug.") || monthInput.equals("Aug") || monthInput.equals("8") ||
				monthInput.equals("October") || monthInput.equals("Oct.") || monthInput.equals("Oct") || monthInput.equals("10")||
				monthInput.equals("December")|| monthInput.equals("Dec.") || monthInput.equals("Dec") || monthInput.equals("12")) {
					Date = 31;
					break;
			}
			else if(monthInput.equals("April")     || monthInput.equals("Apr.") || monthInput.equals("Apr") || monthInput.equals("4") ||
					monthInput.equals("June")      || monthInput.equals("Jun.") || monthInput.equals("Jun") || monthInput.equals("6") ||
					monthInput.equals("September") || monthInput.equals("Sep.") || monthInput.equals("Sep") || monthInput.equals("9") ||
					monthInput.equals("November")  || monthInput.equals("Nov.") || monthInput.equals("Nov") || monthInput.equals("11")){
						Date = 30;
						break;
			}	
			else if(monthInput.equals("February")  || monthInput.equals("Feb.") || monthInput.equals("Feb") || monthInput.equals("2")) {
				 	if ((yearInput % 4 == 0 && yearInput % 100 != 0) || (yearInput % 400 == 0)) {
				 		Date = 29;
				 		break;
				 	}
						
					else {
						Date = 28;
						break;
					}
						
				}
			else System.out.println("Invalid moth. Please try again!");		
		}
		
		System.out.println("The number of days in " + monthInput + " " + yearInput + " is " + Date + ".");
		
	}
	
}
