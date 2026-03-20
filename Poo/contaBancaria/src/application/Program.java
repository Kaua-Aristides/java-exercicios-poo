package application;

import java.util.Locale;
import java.util.Scanner;

import util.Bancaria;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bancaria bancaria;

		System.out.println("Enter account number:");
		int number = sc.nextInt();

		System.out.println("Enter account holder:");
		sc.next();
		String name = sc.next();

		System.out.println("Is there na initial deposit (y/n)?");
		char sn = sc.next().charAt(0);
		
		if (sn == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bancaria = new Bancaria(number, name, initialDeposit);
		} else {
			bancaria = new Bancaria(number, name);
		}

		System.out.println("Account Data:\n" + bancaria);

		System.out.println("\nEnter a deposit values: ");
		double depoisitValues = sc.nextDouble();
		bancaria.deposit(depoisitValues);

		System.out.println("Update account Data:\n" + bancaria);

		System.out.println("\nEnter a withdraw values: ");
		double whitdrawValues = sc.nextDouble();
		bancaria.whitdraw(whitdrawValues);

		System.out.println("Update account Data:\n" + bancaria);
		sc.close();
	}

}
