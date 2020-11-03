package fcu.oop.h1;

import java.util.Scanner;

public class Main {
  /** main. */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input Weight:");
    String weight = scanner.next();
    System.out.println("Input Height:");
    String height = scanner.next();
    scanner.close();

    System.out.printf("weight: %s\n", weight);
    System.out.printf("height: %s\n", height);
    System.out.print(BmiCalculator.getBmi(weight, height));
  }

}
