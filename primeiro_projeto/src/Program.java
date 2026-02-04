import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String product1 = "Computer", product2 = "Office Desk";
		int age = 30, code = 5290;
		char gender = 'F';
		double price1 = 2100.0, price2 = 650.50, measure = 53.234567;

		System.out.println("Produtos:");
		System.out.printf("%s, which price is %.2f \n", product1, price1);
		System.out.printf("%s, which price is %.2f \n\n", product2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s \n", age, code, gender);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%s, which price is %.2f \n\n", product2, price2);
	}
}
