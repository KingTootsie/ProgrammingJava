//Combination is 3, 8, 9, 7

public class BatmanRiddler {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int summed = 0;
		int digits = 0;
		
		boolean success = false;
		boolean same = false; //None of the digits are the same.
		boolean rule_3 = false; //Digit in the the thousands place is 3 times the didgit in the tens place.
		boolean odd = false; //Return true if the number is odd.
		boolean sum = false; //Sum of 4 numbers is equal to 27
		
		while (success != true) {
			same = false;
			rule_3 = false;
			odd = false;
			sum = false;
			
			if (num4 >= 10) { 
				num4 = 0;
				num3++;
			}
			if (num3 >= 10) {
				num3 = 0;
				num2++;
			}
			if (num2 >= 10) {
				num2 = 0;
				num1++;
			}
			if (num1 >= 10) {
				System.exit(0);
			}
			
			summed = num1 + num2 + num3 + num4;
			
			if (summed == 27) { //Checks if all the digits added up sum up to 27.
				sum = true;
			}

			//I understand that the below code is very messy looking, but It is the best I can do.
			if ((num1 == num2) || (num1 == num3) || (num1 == num4) || (num2 == num1) || (num2 == num3) || (num2 == num4) || (num3 == num1) || (num3 == num2) || (num3 == num4) || (num4 == num1) || (num4 == num2) || (num4 == num3)) { //Checks if any of the numbers are the same.
				same = true;
			} else if (!((num1 == num2) || (num1 == num3) || (num1 == num4) || (num2 == num1) || (num2 == num3) || (num2 == num4) || (num3 == num1) || (num3 == num2) || (num3 == num4) || (num4 == num1) || (num4 == num2) || (num4 == num3))) {
				same = false;
			}
			
			
			digits = (1000 * num1) + (100 * num2) + (10 * num3) + num4; //Combines all the numbers together

			if (digits % 2 == 1) { //If the operator returns true, then the combination must be odd.
				odd = true;
			}

			if ((num1 * 3) == num3) { //Checks if the number in the thousands place is 3 times the number in the tens place
				rule_3 = true;
			}


			if ((sum == true) && (rule_3 == true) && (same == false) && (odd == true)) {
				success = true;
			} else {
				num4++;
			}
		}
		System.out.print("The combination is ");
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		System.out.println(num4);
	}
}
