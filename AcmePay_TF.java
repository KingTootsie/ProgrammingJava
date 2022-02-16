import java.util.*;
import java.lang.Math;
import java.text.*;

public class AcmePay_TF {
	public static void main(String[] args) {
		int hoursWorked = 0;
		int shift;
		double hourlyPay = 0;
		double regularPay; //Total pay for working x hours
		int overtimeHours = 0;
		double overtimePay;
		String retirementResponse = "";
		boolean retirementPlan = false; //Do I seriously have to initialize this boolean for something further down to work? It gets intialized later on anyways!
		double retirementDeduction = 0;
		double netPay; //Overall total 
		
		Scanner keyboard = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		System.out.println("Please insert the number of hours you have worked:");
		
		hoursWorked = keyboard.nextInt();
		
		System.out.println("What shift were you working? (1, 2, or 3?)");
		
		shift = keyboard.nextInt();
		
		while ((shift < 1) || (shift > 3)) { //Failsafe if the user doesn't input a number between 1 and 3
			System.out.println(shift + " is not a valid shift. Please try again.");
			
			shift = keyboard.nextInt();
		}
		
		System.out.println("Are you participating in the retirement program? (yes or no)");
		
		retirementResponse = keyboard.next();
		
		if (retirementResponse.equals("y") || retirementResponse.equals("n") || retirementResponse.equals("yes") || retirementResponse.equals("no") || retirementResponse.equals("Yes") || retirementResponse.equals("No")) {
			if (retirementResponse.equals("y") || retirementResponse.equals("yes") || retirementResponse.equals("Yes")) {
				retirementPlan = true;
			}
			if (retirementResponse.equals("n") || retirementResponse.equals(" no") || retirementResponse.equals("No")) {
				retirementPlan = false;
			}
		} else { //I honestly should make this loop indefinitely until the user gives a valid answer, but I couldn't be bothered to.
			System.out.println("The response you gave is not valid. Defaulting to no.");
			retirementPlan = false;
		}
		
		if (shift == 1) {
			hourlyPay = 17.00;
		} else if (shift == 2) {
			hourlyPay = 18.50;
		} else if (shift == 3) {
			hourlyPay = 22.00;
		}
		
		while (hoursWorked > 40) { //Removes any hours over 40 and adds them to overtimeHours
			hoursWorked--;
			overtimeHours++;
		}
		
		regularPay = hoursWorked * hourlyPay;
		
		overtimePay = (hourlyPay * overtimeHours) * 1.5;

		netPay = regularPay + overtimePay;

		if (retirementPlan == true) {
			retirementDeduction = netPay * 0.03;

			netPay -= retirementDeduction;
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("Hours worked: " + hoursWorked);
		System.out.println("Shift worked: " + shift);
		System.out.print("The hourly pay rate is: ");
		System.out.println(money.format(hourlyPay));
		System.out.print("Your regular pay is: ");
		System.out.println(money.format(regularPay));
		System.out.print("Your overtime pay is: ");
		System.out.println(money.format(overtimePay));
		System.out.print("Retirement deduction: ");
		System.out.println(money.format(retirementDeduction));
		System.out.println("");
		System.out.print("Your net pay is: ");
		System.out.println(money.format(netPay));
		System.out.println("----------------------------------------------------------------");
	}
}