package fcu.oop.h1;

public class BmiCalculator {
	public static double getBmi(double weight, double height) {
			return weight / (height*height);
		}
	public static double getBmi(String weight, String height) {
		return getBmi(Double.valueOf(weight),Double.valueOf(height));
	}
}
