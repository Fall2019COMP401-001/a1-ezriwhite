package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		// total products
		
		int totalProducts = scan.nextInt();
		
		// array of products
		
		Product[] products = new Product[totalProducts];
		
		// putting products and properties into array
		
		for (int i=0; i < products.length; i++ ) {
			products[i] = new Product(scan.next(), scan.nextDouble());
			
		}
		
		// total customers
		
		int totalCustomer = scan.nextInt();
		
		// array of customers
		
		Customer[] customers = new Customer[totalCustomer];
		
		// putting customers into array
		
		for (int i=0; i < customers.length; i++ ) {
			customers[i] = new Customer(scan.next(),scan.next(), scan.nextInt());
			for (int j=0; j < customers[i].totalProducts; j++) {
				int number = scan.nextInt();
				String item = scan.next();
				for (int k=0; k < products.length; k++) {
					if(item == products[k].name) {
						double cost = number * products[k].price;
						customers[i].spent += cost;
					}
				}
			}	
		}
		scan.close();
		
		// biggest
		System.out.println(customers[0].first + customers[0].last);
		
		for (int i=0; i<customers.length; i++) {
			String hi = "hi";
		}

		
	}
}
