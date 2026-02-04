package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)?");
			char cha = sc.next().charAt(0);
			if (cha == 'i') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income: ");
				double anuallncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				Individual ind = new Individual(name, anuallncome, healthExpenditures);
				list.add(ind);
			}
			if (cha == 'c') {
				System.out.print("Name: ");
				String name = sc.next();
				System.out.print("Anual income: ");
				double anuallncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int numberOfEmpoyee = sc.nextInt();
				Company com = new Company(name, anuallncome, numberOfEmpoyee);
				list.add(com);
			}
		}

		System.out.println("TAXES PAID:\n");
		double sum = 0;
		for (TaxPayer tp : list) {
			double tax = tp.tax();
			System.out.println(tp.getName() + ": $ " + String.format("%.2f", tax));
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
