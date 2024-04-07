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
}
