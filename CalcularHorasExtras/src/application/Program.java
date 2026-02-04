package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valTra, totSal, valHorasExtra, totHorasExtras, salTotal;
		int horasTra, horaExtra;

		System.out.println("Valor tra");
		valTra = sc.nextDouble();

		System.out.println("Valor horas");
		horasTra = sc.nextInt();

		totSal = valTra / horasTra;
		System.out.println(String.format("%.2f", totSal));

		valHorasExtra = totSal * 1.2;
		System.out.println(String.format("%.2f", valHorasExtra));
		
		System.out.println("horas Extra");
		horaExtra = sc.nextInt();
		
		totHorasExtras = valHorasExtra * horaExtra;
		System.out.println(String.format("%.2f", totHorasExtras));
		
		salTotal = valTra + totHorasExtras;
		System.out.println(String.format("%.2f", salTotal));		
		
		sc.close();
	}

}
