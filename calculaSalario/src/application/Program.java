package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.println("Name:");
		emp.name = sc.next();
		System.out.println("Gloss Salary:");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		emp.tax = sc.nextDouble();
		
		System.out.println("Empoly: " + emp);
		
		System.out.println("Which percertange to increase salary?");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println("Updat data: " + emp);

	}

}
