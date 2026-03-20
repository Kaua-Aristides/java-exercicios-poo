package application;

import java.util.Locale;
import java.util.Scanner;

import util.currencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		currencyConverter curr = new currencyConverter();
		
		System.out.println("Whats is the dollar price?");
		curr.dolarValues = sc.nextDouble(); 
		System.out.println("How many dollars will be bought?");
		curr.dolarQuant = sc.nextDouble();
		
		System.out.printf("Amount to be poid in reais = %.2f", curr.result());
		sc.close();
	}

}
