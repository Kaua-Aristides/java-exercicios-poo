package util;

public class Bancaria {

	private int Number;
	private String name;
	private double balance;

	public Bancaria(int number, String name) {
		this.Number = number;
		this.name = name;
	}

	public Bancaria(int number, String name, double initialDeposit) {
		this.Number = number;
		this.name = name;
		deposit(initialDeposit);
	}
	
	public int getNumber() {
		return Number;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}

	public void whitdraw(double amount) {
		this.balance -= amount + 5.0;
	}
	
	public String toString() {
		return String.format("Number account %d, Titular: %s, Saldo: %.2f",
                getNumber(), getName(), getBalance());
	}
}
