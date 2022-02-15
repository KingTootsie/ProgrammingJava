import java.util.*;
import java.lang.Math;

public class AP_SubtractionQuiz_TarrentFrye { 
	public static void main(String[] args) {
		int number1 = (int)(Math.random() *10);
		int number2 = (int)(Math.random() *10);
		int tempNumber; //Called if number2 is bigger than number1
		int answer; 
		int userAnswer;

		if (number1 <= number2) { //Checks if number2 is bigger than number1
			tempNumber = number1;
			number1 = number2;
			number2 = tempNumber;
		}

		answer = number1 - number2;

		System.out.print("Please answer this equation: " + number1 + " - " + number2 + " = ");
		
		Scanner keyboard = new Scanner(System.in);
		
		userAnswer = keyboard.nextInt();
		
		if (userAnswer == answer) { //User is correct senario
			System.out.print("You are correct!");
		} else { 					//User is incorrect senario
			System.out.println("Sorry, you are incorrect!");
			System.out.println(number1 + " - " + number2 + " = " + answer);
		}
	}
}