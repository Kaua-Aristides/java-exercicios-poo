package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a quantidade: ");
		int n = sc.nextInt();
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length;i++) {
			System.out.print("Digite o numero:");
			vect[i] = sc.nextInt();
		}
		
		for(int i=0; i<vect.length;i++) {
			if(vect[i]<0) {
				System.out.println(vect[i]);;
			}
		}		
		
		sc.close();
	}

}
