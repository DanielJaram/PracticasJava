package ExercisesC;

public class JavaExercises4 {

	public int calculateFactorial(int number) {
		// Write your code here
		if (number < 0) {
			return -1;
		}

		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial *= i;
		}
		return factorial;
	}

	public int getLastDigit(int number) {
		// Write your code here
		if (number == 0) {

		}
		if (number < 0) {
			return -1;
		}
		if (number > 0) {
			number = number % 10;
			return number;
		}
		return number;
	}

	public int getNumberOfDigits(int number) {
		// Write your code here
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}
		int numberOfDigits = 1;
		while (number >= 10) {
			number /= 10; // remove the last digit from the number
			numberOfDigits++; // increment the count of digits
		}
		return numberOfDigits;
	}

	public int getSumOfDigits(int number) {
		// Edge case: when number is zero
		if (number == 0) {
			return 0; // sum of digits of 0 is 0
		}
		// Edge case: when number is negative
		if (number < 0) {
			return -1; // sum of digits of negative numbers is undefined
		}

		// Initialize the sum of digits to 0
		int sumOfDigits = 0;

		// Loop while the number is not zero
		while (number != 0) {
			// Get the last digit of the number
			int digit = number % 10;
			// Add the last digit to the sum
			sumOfDigits += digit;
			// Remove the last digit from the number
			number /= 10;
		}

		// Return the sum of digits
		return sumOfDigits;
	}

	public int reverseNumber(int number) {
		// Edge case: when number is zero
		if (number == 0) {
			return 0; // reverse of 0 is 0
		}
		// Edge case: when number is negative
		if (number < 0) {
			return -1; // reverse of negative numbers is undefined
		}

		// Initialize the reversed number to 0
		int reversedNumber = 0;

		// Loop while the number is not zero
		while (number != 0) {
			// Get the last digit of the number
			int digit = number % 10;

			// Multiply the reversed number by 10 and add the last digit
			reversedNumber = reversedNumber * 10 + digit;

			// Remove the last digit from the number
			number /= 10;
		}

		// Return the reversed number
		return reversedNumber;
	}
}
