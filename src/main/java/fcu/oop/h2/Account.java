package fcu.oop.h2;

public class Account {
	private String name;
	private String account;
	private String password;
	private double balance;
	const sdouble INTEREST_RATE = 1.55;
	
	public Account(String name, String account, String password, double balance) {
		super();
		this.name = name;
		this.account = account;
		this.password = password;
		this.balance = balance;
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
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
