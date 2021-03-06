package fcu.oop.h2;

public class Account {

  private String name;
  private String account;
  private String password;
  private double balance = 0.0;
  private static double INTEREST_RATE = 1.55;

  public Account() {
  }

  /** Account.class */
  public Account(String name, String account, String password, double balance) {
    super();
    this.setName(name);
    this.setAccount(account);
    this.setPassword(password);
    this.balance = balance;
  }

  public double getInterest() {
    return this.balance * INTEREST_RATE;
  }

  public double deposite(int inCash) {
    this.balance += Double.valueOf(inCash);
    return this.balance;
  }

  public double withdraw(int outCash) {
    this.balance -= Double.valueOf(outCash);
    return this.balance;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAccount() {
    return account;
  }
  
  /**.*/
  public void setAccount(String account) {
    if (account.matches("^[_A-z0-9-]+([.][_A-z0-9-]+)*@[A-z0-9-]+([.][A-z0-9-]+)*$")) {
      this.account = account;
    } else {
      System.out.println("input Error");
      this.account = "NULL";
    }
  }

  public String getPassword() {
    return password;
  }
  
  /**.*/
  public void setPassword(String password) {
    if (password.matches("^.*(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$")) {
      this.password = password;
    } else {
      System.out.println("input Error");
      this.password = "NULL";
    }
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

}
