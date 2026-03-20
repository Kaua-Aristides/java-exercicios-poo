package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.Order;
import entities.Product;
import entities_enum.OrdemStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter cliente data:");
		System.out.print("Name:");
		String clientName = sc.nextLine();
		System.out.print("E-mail:");
		String clientEmail = sc.next();
		System.out.print("Birth date (DD/MM/YYYY):");
		Date clientDate = sdf.parse(sc.next());
		Client client = new Client(clientName, clientEmail, clientDate);
		System.out.println(client);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrdemStatus status = OrdemStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		for(int i = 0; i<n; i++) {
			System.out.println("Enter "+ (i+1) +"  item data:");
			System.out.print("Product name:");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price:");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity:");
			int productQuantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrdemItem ordemitem = new OrdemItem(productQuantity, productPrice, product);
			
			order.addItem(ordemitem);
		}
		
		System.out.println();
		System.out.println(order);

		sc.close();
	}

}
