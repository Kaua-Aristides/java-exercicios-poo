package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> list = new ArrayList<>();

		System.out.print("Enter the number of products:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char cui = sc.next().charAt(0);
			if (cui == 'c') {
				System.out.print("Name:");
				String productName = sc.next();
				System.out.print("Price: ");
				double productPrice = sc.nextDouble();
				Product pro = new Product(productName, productPrice);
				list.add(pro);
			}
			if (cui == 'u') {
				System.out.print("Name:");
				String productName = sc.next();
				System.out.print("Price: ");
				double productPrice = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String productData = sc.next();
				Product pro2 = new UsedProduct(productName, productPrice, sdf.parse(productData));
				list.add(pro2);
			}
			if (cui == 'i') {
				System.out.print("Name:");
				String productName = sc.next();
				System.out.print("Price: ");
				double productPrice = sc.nextDouble();
				System.out.print("Customs fee: ");
				double productCustomsFee = sc.nextDouble();
				Product pro3 = new ImportedProduct(productName, productPrice, productCustomsFee);
				list.add(pro3);
			}
		}

		System.out.println();
		System.out.println("PRICE TAGS:");

		for (Product emp : list) {
			System.out.println(emp.priceTag());
		}
		sc.close();
	}
}
