//Combination is 3, 8, 9, 7

public class BatmanRiddler {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int summed = 0;
		int didgits = 0;
		
		int test = 0;
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
			
			if (summed == 27) {
				sum = true;
				System.out.println("Sum is 27? " + sum); //Remove when done
			}
			
			if ((num1 != num2) && (num1 != num3) && (num1 != num4)) {
				same = false;
			} else {
				same = true;
			}
			
			if ((num2 != num1) && (num2 != num3) && (num2 != num4)) {
				same = false;
			} else {
				same = true;
			}
			
			if ((num3 != num1) && (num3 != num2) && (num3 != num4)) {
				same = false;
			} else {
				same = true;
			}
			
			if ((num4 != num1) && (num4 != num2) && (num4 != num3)) {
				same = false;
			} else {
				same = true;
			}
			
			didgits = ()
			
			System.out.print(num1);
			System.out.print(num2);
			System.out.print(num3);
			System.out.println(num4);
			
			if ((sum == true) && (rule_3 == true) && (same == true) && (odd == true)) {
				success = true;
			}
			
			num4++;
		}
		
		System.out.println("Same? " + same);
		System.out.println("3 Rule? " + rule_3);
		System.out.println("Odd? " + odd);
		
		System.out.println("Success? " + success);
	}
}