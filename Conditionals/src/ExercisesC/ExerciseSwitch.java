package ExercisesC;

public class ExerciseSwitch {
	
	
	public static void main(String[] args) {
		System.out.println(determineNameOfMonth(1));
		System.out.println(determineNameOfDay(1));
		System.out.println(isWeekDay(6));
	}

	public static String determineNameOfDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";
		default:
			return "Day no valid";
		}
	}

	public static String determineNameOfMonth(int monthNumber) {
		switch (monthNumber) {
		case 0:
			return "Enero";
		case 1:
			return "Febrero";
		case 2:
			return "Marzo";
		case 3:
			return "Abril";
		case 4:
			return "Mayo";
		case 5:
			return "Junio";
		case 6:
			return "Julio";
		case 7:
			return "Agosto";
		case 8:
			return "Septiembre";
		case 9:
			return "Octubre";
		case 10:
			return "Noviembre";
		case 11:
			return "Diciembre";
		default:
			return "Day no valid";
		}
	}

	public static boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:

		case 6:
			return false;
		case 1:

		case 2:

		case 3:

		case 4:

		case 5:
			return true;
		}
		return false;

	}
	
	public class Student {
	    private int marks;

	    public Student(int marks) {
	        // TODO: Assign 'marks' to the instance variable 'this.marks'
	        this.marks = marks;
	    }

	    public char assignGrade() {
	        if(marks < 0 || marks > 100){
	            return 'X';
	        }
	        if(marks >= 90){
	            return 'A';
	        }else if(marks >= 80 && marks < 90){
	            return 'B';
	        }else if (marks >= 70 && marks < 80){
	            return 'C';
	        }else if (marks >= 60 && marks < 70){
	            return 'D';
	        }else if (marks >= 50 && marks < 60){
	            return 'E';
	        }else {
	            return 'F';
	        }
	    }
	}
}
