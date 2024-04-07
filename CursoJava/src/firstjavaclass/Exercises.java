package firstjavaclass;

public class Exercises {

	public int hello() {
		// TODO: Make this return 1
		return 1;
	}

	/*
	 * In Java, you have been given a partially implemented TimeConverter class that
	 * aims to convert time from hours or days to minutes. The TimeConverter class
	 * has two static methods that need to be completed: convertHoursToMinutes(int
	 * hours): This method should take an integer value representing hours and
	 * return the equivalent value in minutes. convertDaysToMinutes(int days): This
	 * method should take an integer value representing days and return the
	 * equivalent value in minutes.
	 * 
	 */
	public static int convertHoursToMinutes(int hours) {
		// Your task: complete this method
		if (hours >= 0) {
			int convert = hours * 60;
			return convert;
		}
		return -1;
	}

	public static int convertDaysToMinutes(int days) {
		// Your task: complete this method
		if (days >= 0) {
			int convert = days * (24 * 60);
			return convert;
		}
		return -1;
	}

	/*
	 * Coding Exercise: Exam Result Checker You have been provided with an
	 * incomplete Java class named ExamResult. This class has a method isPass(int
	 * marks) which needs to be completed.
	 * 
	 * The isPass(int marks) method should take an integer value representing the
	 * marks obtained by a student in an exam and determine whether the student has
	 * passed or failed the exam.
	 * 
	 * In this case, a student is considered to have passed the exam if they have
	 * scored more than 50 marks. If the student's marks are 50 or less, they are
	 * considered to have failed.
	 */

	public boolean isPass(int marks) {
		// Update Code : If the student's marks are greater than 50, they have passed
		// the exam.
		if (marks > 50) {
			return true;
		}
		return false;
	}

	/*
	 * Coding Exercise: Is Valid Triangle You are given three integer inputs that
	 * represent the angles of a triangle. You need to complete a method named
	 * isValidTriangle(int angle1, int angle2, int angle3), inside a class named
	 * TriangleValidator. This method should return a boolean value – true if the
	 * given angles form a valid triangle, and false if they do not.
	 * 
	 * The conditions for a valid triangle are:
	 * 
	 * Each of the angles must be a positive integer.
	 * 
	 * The sum of all the three angles must be exactly 180.
	 */
	
	public class TriangleValidator {
	    public boolean isValidTriangle(int angle1, int angle2, int angle3) {
	        // write your code here
	        int sum = angle1 + angle2 + angle3;
	        if(angle1 > 0 && angle2 > 0 && angle3 > 0 && sum == 180){
	            return true;
	        }
	        return false;
	    }
	}
	
}
