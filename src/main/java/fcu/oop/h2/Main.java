package fcu.oop.h2;

import java.util.Scanner;

public class Main {
  /**.main*/
  public static void main(String[] args) {

    Account acc1 = new Account();

    System.out.println("Name:");
    acc1.setName("Amy");
    System.out.println(acc1.getName());
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Account:");
    acc1.setAccount(scanner.nextLine());

    System.out.println("Password:");
    acc1.setPassword(scanner.nextLine());

    System.out.println("Balance:");
    System.out.println(acc1.getBalance());

    System.out.println("Deposite:");
    acc1.deposite(scanner.nextInt());
    System.out.println("Balance:");
    System.out.println(acc1.getBalance());

    System.out.println("Withdraw:");
    acc1.withdraw(scanner.nextInt());
    System.out.println("Balance:");
    System.out.println(acc1.getBalance());

    scanner.nextLine();
    
    Account acc2 = new Account();
    System.out.println("Name:");
    acc2.setName(scanner.nextLine());

    System.out.println("Account:");
    acc2.setAccount(scanner.nextLine());

    System.out.println("Password:");
    acc2.setPassword(scanner.nextLine());

    System.out.println("Balance:");
    System.out.println(acc2.getBalance());

    System.out.println("Deposite:");
    acc2.deposite(scanner.nextInt());
    System.out.println("Balance:");
    System.out.println(acc2.getBalance());

    System.out.println("Withdraw:");
    acc2.withdraw(scanner.nextInt());
    System.out.println("Balance:");
    System.out.println(acc2.getBalance());

    scanner.close();
  }

}
