package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for course A?");
		int numeA = sc.nextInt();
		for (int i = 0; i < numeA; i++) {
			int idA = sc.nextInt();
			a.add(idA);
		}

		System.out.print("How many students for course B?");
		int numeB = sc.nextInt();
		for (int i = 0; i < numeB; i++) {
			int idB = sc.nextInt();
			b.add(idB);
		}

		System.out.print("How many students for course C?");
		int numeC = sc.nextInt();
		for (int i = 0; i < numeC; i++) {
			int idC = sc.nextInt();
			c.add(idC);
		}

		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);

		System.out.println("Total students: " + total.size());

		sc.close();
	}
}
