package oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike ducati = new MotorBike();
		MotorBike honda = new MotorBike();
		
		ducati.start();
		honda.start();
		
		ducati.velocidad = 100;
		honda.velocidad = 80;
		
		ducati.velocidad = 20;
		honda.velocidad = 0;
	}
}
