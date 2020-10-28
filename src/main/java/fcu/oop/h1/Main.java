package fcu.oop.h1;
import java.util.Scanner;

public class Main {
	/** main.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String weight = scanner.next();
		String height = scanner.next();
		scanner.close();
		System.out.print(BmiCalculator.getBmi(weight,height));
	}

}
